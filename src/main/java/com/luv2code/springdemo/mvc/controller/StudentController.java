package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student")
@Controller
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        theModel.addAttribute("student", new Student());

        return "student-form";
    }


    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        System.out
            .println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());

        return "student-confirmation";
    }

}
