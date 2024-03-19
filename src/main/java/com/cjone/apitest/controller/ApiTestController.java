package com.cjone.apitest.controller;

import com.cjone.apitest.service.ApiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ApiTestController {
    private final ApiTestService apiTestService;
    @Autowired
    public ApiTestController(ApiTestService apiTestService) {
        this.apiTestService = apiTestService;
    }

    @RequestMapping(value="/getFormatTr931", method = RequestMethod.GET)
    public HashMap<String, Object> getFormatTr931(){
        return apiTestService.getFormatTr931();
    }

    @RequestMapping(value="/reqTr931", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr931(){
        return apiTestService.reqTr931();
    }

    @RequestMapping(value="/reqTr200", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr000(){
        return apiTestService.reqTr200();
    }
}