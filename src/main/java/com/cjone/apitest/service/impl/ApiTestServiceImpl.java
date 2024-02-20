package com.cjone.apitest.service.impl;

import com.cjone.apitest.common.Config;
import com.cjone.apitest.config.trsmsg.*;
import com.cjone.apitest.service.ApiTestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Properties;
import cj.cjgms.CJGMSClient;
@Service
public class ApiTestServiceImpl implements ApiTestService {

    Config cf = new Config();
    Properties prop = cf.readProperties("src/main/resources/properties/env.properties");

    public HashMap<String, Object> getFormatTr931() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        TR931 trData = new TR931();
        map.put("colNm", trData.getColNm());
        map.put("colLen", trData.getColLen());
        map.put("msg", trData.getMsg());
        return map;
    }

    public HashMap<String, Object> reqTr931() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000();
        TR931 trData = new TR931();
        String reqData = trComm.getMsg() + trData.getMsg();
        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);
        map.put("rslt", strRet);

        return map;
    }
}