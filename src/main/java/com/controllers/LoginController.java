package com.controllers;

import com.models.Person;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "login")
    public String login(Model model) {
        model.addAttribute("person", new Person());
        return "login";
    }

    @RequestMapping(value = "admin" )
    public String checkLogin( @ModelAttribute("person") Person person, Model model){
       if(loginService.login(person)){
           model.addAttribute("mess","khoi");
           return "admin";
       }else {
           model.addAttribute("error",true);
           return "redirect:login";
       }
    }
}
