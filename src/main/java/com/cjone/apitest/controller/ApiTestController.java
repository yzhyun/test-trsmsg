package com.cjone.apitest.controller;

import com.cjone.apitest.service.ApiTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class ApiTestController {
    private final ApiTestService apiTestService;
    @Autowired
    public ApiTestController(ApiTestService apiTestService) {
        this.apiTestService = apiTestService;
    }

    @RequestMapping(value="/reqTr200", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr000(){
        return apiTestService.reqTr200();
    }

    @RequestMapping(value="/reqTr300", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr300(){
        return apiTestService.reqTr300();
    }

    @RequestMapping(value="/reqCnclTr300", method = RequestMethod.GET)
    public HashMap<String, Object> reqCnclTr300(){
        return apiTestService.reqCnclTr300();
    }

    @RequestMapping(value="/reqTr300_B", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr300_B(){
        return apiTestService.reqTr300_B();
    }

    @RequestMapping(value="/reqTr931", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr931(){
        return apiTestService.reqTr931();
    }

    @RequestMapping(value="/reqTr400", method = RequestMethod.GET)
    public HashMap<String, Object> reqTr400(){
        return apiTestService.reqTr400();
    }

    @RequestMapping(value="/reqTR400", method = RequestMethod.POST)
    public ResponseEntity<HashMap<String, Object>> reqTR400(
            @RequestBody HashMap<String, Object> requestData) {
        // Service로 비즈니스 로직 처리 요청
        HashMap<String, Object> result = apiTestService.reqTR400(requestData);
        return ResponseEntity.ok(result);
    }

    @RequestMapping(value="/reqCnclTr400", method = RequestMethod.GET)
    public HashMap<String, Object> reqCnclTr400(){
        return apiTestService.reqCnclTr400();
    }

}