package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping("hello")
@Controller
public class HelloController {
    @RequestMapping(value = "hello")
    public String hello(ModelMap model){
        model.addAttribute("message","hello page");
        return "hello";
    }
}
