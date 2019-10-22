package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController {

    @RequestMapping("/error404")
    public String error404(){
        return "error404";
    }


    @RequestMapping("/testError")
    public String error() throws Exception{
        throw new Exception("测试异常");
    }
}
