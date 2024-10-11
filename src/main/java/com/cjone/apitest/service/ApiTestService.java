package com.cjone.apitest.service;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public interface ApiTestService {
    public HashMap<String, Object> reqTr200();
    public HashMap<String, Object> reqTr300();
    public HashMap<String, Object> reqTr931();
    public HashMap<String, Object> reqTr400();
    public HashMap<String, Object> reqCnclTr400();
    public HashMap<String, Object> reqTr300_B();

}
