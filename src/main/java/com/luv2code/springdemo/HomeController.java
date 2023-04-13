package com.luv2code.springdemo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private static final Logger logger = LogManager.getLogger(HomeController.class);

    @GetMapping("/test")
    public String home(Model theModel) {

        theModel.addAttribute("theTime", System.currentTimeMillis());

        logger.info("{}", System.currentTimeMillis());

        return "test";
    }
}
