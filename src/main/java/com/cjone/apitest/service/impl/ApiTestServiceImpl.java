package com.cjone.apitest.service.impl;

import com.cjone.apitest.common.Config;
import com.cjone.apitest.common.common;
import com.cjone.apitest.config.trsmsg.*;
import com.cjone.apitest.service.ApiTestService;
import org.json.JSONObject;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;
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

        trComm.setMsg("c_1", "200");
        trComm.setMsg("c_2", "21");

        String reqData = trComm.getMsg();

        TR200 tr = new TR200();
        reqData += tr.getMsg();

        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);

        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        map.put("data", common.getRecvMsg(tr.getRecvFormat(), strRet));
        map.put("msg", strRet);

        return map;
    }

    public HashMap<String, Object> reqCnclTr300() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000();
        trComm.setMsg("c_1", "999");
        trComm.setMsg("c_2", "32");
        String reqData = trComm.getMsg();

        TR300_C tr = new TR300_C();
        reqData += tr.getMsg();

        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);
        map.put("data", common.getRecvMsg(tr.getRecvFormat(), strRet));
        map.put("msg", strRet);
        return map;
    }

    public HashMap<String, Object> reqTr300() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000();
        trComm.setMsg("c_1", "999");
        trComm.setMsg("c_2", "31");
        String reqData = trComm.getMsg();

        TR300 tr = new TR300();
        reqData += tr.getMsg();

        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        map.put("data", common.getRecvMsg(tr.getRecvFormat(), strRet));
        map.put("msg", strRet);

        System.out.println("원참여사고유식별번호=> " + tr.getUqeId());



        return map;
    }

    public HashMap<String, Object> reqTr400() {
        System.out.println("===reqTR400/");

        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000("999", "41", "7030");
        String reqData = trComm.getMsg();
        System.out.println(reqData);

        TR400 tr = new TR400();
        reqData += tr.getMsg();

        //reqData = "40041V100703020240901112623202409010000112623OFF0000010.112.165.32                                  30003000                17775010000000496    B                     000001855000000014600000000000000001514020240901202409011001N                                                                    0293097930019       20240901B09310020001501                                                                   01100000000075102422024090101110000001950";
        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        map.put("data", common.getRecvMsg(tr.getRecvFormat(), strRet));
        map.put("msg", strRet);

        return map;
    }

    public HashMap<String, Object> reqTR400(HashMap<String, Object> requestData) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        String log = requestData.toString();
        System.out.println(("================== " +  log));

        String reqData = "";
        TR000 comm = new TR000(requestData);
        reqData = comm.getMsg();
        TR400 body = new TR400(requestData);
        reqData += body.getMsg();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));
        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        map.put("data", common.getRecvMsg(body.getRecvFormat(), strRet));
        map.put("msg", strRet);

        System.out.println(map);
        return map;
    }

    public HashMap<String, Object> reqCnclTr400() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000("999", "42", "7030");

        String reqData = trComm.getMsg();
        System.out.println(reqData);

        TR400_C tr = new TR400_C();
        reqData += tr.getMsg();

        //reqData = "40041V100703020240901112623202409010000112623OFF0000010.112.165.32                                  30003000                17775010000000496    B                     000001855000000014600000000000000001514020240901202409011001N                                                                    0293097930019       20240901B09310020001501                                                                   01100000000075102422024090101110000001950";
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

    public HashMap<String, Object> reqTr300_B() {
        HashMap<String, Object> map = new HashMap<String, Object>();

        String dev_ip = prop.getProperty("dev.ip");
        int dev_port = Integer.valueOf(prop.getProperty("dev.port"));

        TR000 trComm = new TR000();
        trComm.setMsg("c_1", "999");
        trComm.setMsg("c_2", "32");
        String reqData = trComm.getMsg();

        TR300_B tr = new TR300_B();

        reqData += tr.getMsg();

        System.out.println(dev_ip + " " + dev_port);
        System.out.println("=====Request");
        System.out.println(reqData);
        CJGMSClient cjgmsClient = new CJGMSClient();
        String strRet = cjgmsClient.CJGMSCall(dev_ip, dev_port, 5000, 5000, reqData);
        System.out.println("=====Response");
        System.out.println(strRet);

        System.out.println("=======================================");
        System.out.println(common.getDateTime());
        System.out.println(common.getDate());

        map.put("msg", strRet);
        return map;
    }
}