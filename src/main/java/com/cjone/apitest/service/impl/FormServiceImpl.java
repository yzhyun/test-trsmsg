package com.cjone.apitest.service.impl;


import com.cjone.apitest.config.trsmsg.*;
import com.cjone.apitest.service.FormService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FormServiceImpl implements FormService {
    public HashMap<String, Object> getFormTr000() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        TR000 tr000 = new TR000();
        map = tr000.getForm();
        return map;
    }

    public HashMap<String, Object> getFormTr200() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        TR200 tr200 = new TR200();
        map = tr200.getForm();
        return map;
    }

    public HashMap<String, Object> getFormTr931() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        TR931 tr931 = new TR931();
        map = tr931.getForm();
        return map;
    }
}
