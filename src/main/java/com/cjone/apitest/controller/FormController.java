package com.cjone.apitest.controller;

import com.cjone.apitest.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class FormController {
    private final FormService FormService;

    @Autowired
    public FormController(com.cjone.apitest.service.FormService formService) {
        FormService = formService;
    }

    @RequestMapping(value="/getFormat/TR000", method = RequestMethod.GET)
    public HashMap<String, Object> getFormatTr000() { return FormService.getFormTr000(); }

    @RequestMapping(value="/getFormat/TR200", method = RequestMethod.GET)
    public HashMap<String, Object> getFormatTr200() { return FormService.getFormTr200(); }

    @RequestMapping(value="/getFormat/TR931", method = RequestMethod.GET)
    public HashMap<String, Object> getFormatTr931() { return FormService.getFormTr931(); }
}
