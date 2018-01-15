package com.xiaobai.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public abstract class BaseContoller {

    protected static String INDEX = "index";

    @RequestMapping(value = {"index"})
    public String index() {
        return INDEX;
    }
}
