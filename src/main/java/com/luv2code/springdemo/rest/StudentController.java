package com.luv2code.springdemo.rest;


import com.luv2code.springdemo.entity.Student2;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    private List<Student2> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student2("Danbi", "Na"));
        theStudents.add(new Student2("Tom", "Kim"));
        theStudents.add(new Student2("Bongue", "Kim"));
        System.out.println("--- loadData 호출");
    }

    @GetMapping("students")
    public List<Student2> getStudents() {

        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student2 getStudent(@PathVariable int studentId) {
        System.out.println("--- studentId: " + studentId);
    
        return theStudents.get(studentId);
    }

}
