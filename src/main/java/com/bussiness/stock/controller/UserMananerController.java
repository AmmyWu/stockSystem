package com.bussiness.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userManager")
public class UserMananerController {
    @ResponseBody
    @RequestMapping("/alterPassword")
    public void alterPassword(){

    }
    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "success";
    }
    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        return "test success!";
    }
}
