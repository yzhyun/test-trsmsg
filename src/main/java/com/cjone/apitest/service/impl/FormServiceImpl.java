package com.cjone.apitest.service.impl;


import com.cjone.apitest.config.trsmsg.*;
import com.cjone.apitest.service.FormService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FormServiceImpl implements FormService {
    public HashMap<String, Object> getFormTr000() {
        HashMap<String, Object> response = new HashMap<String, Object>();
        TR000 tr000 = new TR000();
        String[][] format = tr000.getForm();
        response.put("form", format);
        return response;
    }

    public HashMap<String, Object> getFormTr200() {
        System.out.println("=======getFormTr200======");
        HashMap<String, Object> response = new HashMap<>();
        TR200 tr = new TR200();
        String[][] format = tr.getForm();
        response.put("form", format);
        return response;
    }

    public HashMap<String, Object> getFormTr300() {
        System.out.println("=======getFormTr300======");
        HashMap<String, Object> response = new HashMap<>();
        TR300 tr = new TR300();
        String[][] format = tr.getForm();
        response.put("form", format);
        return response;
    }

    public HashMap<String, Object> getFormTr400() {
        System.out.println("=======getFormTr400======");
        HashMap<String, Object> response = new HashMap<>();
        TR000 tr000 = new TR000("400", "41", "");
        String[][] commFormat = tr000.getForm();
        response.put("comm", commFormat);

        TR400 tr = new TR400();
        String[][] bodyformat = tr.getForm();
        response.put("body", bodyformat);

        return response;
    }

    public HashMap<String, Object> getFormTr931() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        TR931 tr931 = new TR931();
        map = tr931.getForm();
        return map;
    }
}
