package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/hello")
@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(@RequestParam("studentName") String studentName, Model model) {

        // read the request parameter from the HTML form
        String theName = studentName;

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;
        System.out.println("--- result = " + result);


        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
