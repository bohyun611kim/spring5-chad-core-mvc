package com.luv2code.springdemo.rest;


import com.luv2code.springdemo.entity.Student2;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

        // check the studentId against lise size
        if (studentId >= theStudents.size() || studentId < 0) {
            throw new StudentNotFoundException("Student id not found - " + studentId); // 사용자정의 예외를 던진다.
        }

        return theStudents.get(studentId);
    }


    /*
        studentId : index 범위를 예외처리
     */
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleResponse(StudentNotFoundException exc) {

        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        System.out.println("--- StudentNotFoundException");

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    /*
        studentId : abc 잘못된 타입 처리
     */
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {

        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        System.out.println("--- Exception");

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); // body, statusCode
    }

}
