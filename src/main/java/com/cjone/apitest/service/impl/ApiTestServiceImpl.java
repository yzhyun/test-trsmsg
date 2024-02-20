package com.cjone.apitest.service.impl;

import com.cjone.apitest.common.Config;
import com.cjone.apitest.config.trsmsg.*;
import com.cjone.apitest.service.ApiTestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Properties;

@Service
public class ApiTestServiceImpl implements ApiTestService {

    @Value("${dev.ip}")
    private String dev_ip;
    @Value("${dev.port}")
    private String dev_port;

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
        String dev_port = prop.getProperty("dev.port");

        TR931 trData = new TR931();
        String msg = trData.getMsg();


        System.out.println(dev_ip + " " + dev_port);

        return map;
    }
}