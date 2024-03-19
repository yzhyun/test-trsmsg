package com.cjone.apitest.service.impl;


import com.cjone.apitest.config.trsmsg.TR000;
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
}
