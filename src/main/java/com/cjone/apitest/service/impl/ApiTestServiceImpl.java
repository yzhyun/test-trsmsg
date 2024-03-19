package com.cjone.apitest.service.impl;

import com.cjone.apitest.common.Config;
import com.cjone.apitest.config.trsmsg.*;
import com.cjone.apitest.service.ApiTestService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Properties;
import cj.cjgms.CJGMSClient;
@Service
public class ApiTestServiceImpl implements ApiTestService {

    Config cf = new Config();
    Properties prop = cf.readProperties("src/main/resources/properties/env.properties");

    public HashMap<String, Object> reqTr931() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000();
        String reqData = trComm.getMsg();

        TR931 tr931 = new TR931();
        reqData += tr931.getMsg();

        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        map.put("msg", strRet);
        return map;
    }

    public HashMap<String, Object> reqTr200() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000();
        String reqData = trComm.getMsg();

        TR200 tr200 = new TR200();
        reqData += tr200.getMsg();

        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        map.put("msg", strRet);
        return map;
    }
}