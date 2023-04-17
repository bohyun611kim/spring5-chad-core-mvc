package com.luv2code.springdemo.rest;


import com.luv2code.springdemo.entity.Student2;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("students")
    public List<Student2> getStudents() {

        List<Student2> theStudents = new ArrayList<>();

        theStudents.add(new Student2("Poornima", "Patel"));
        theStudents.add(new Student2("Mario", "Rossi"));
        theStudents.add(new Student2("Mary", "Smith"));

        return theStudents;
    }
}
