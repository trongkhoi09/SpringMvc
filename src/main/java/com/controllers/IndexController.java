package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class IndexController {
    @RequestMapping(value = "/")
    public String index(ModelMap model){
        model.addAttribute("message","Index");
        return "index";
    }
}
