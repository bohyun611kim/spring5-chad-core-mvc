package com.luv2code.springdemo.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("silly")
@Controller
public class SillyController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "silly";
    }
}
