package com.luv2code.springdemo.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);

            System.out.println("First name: " + theStudent.getFirstName());
            System.out.println("Last name: " + theStudent.getLastName());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
