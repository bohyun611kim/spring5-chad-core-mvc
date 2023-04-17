package com.luv2code.springdemo.entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            // read json from file and map/convert to java pojo
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

            System.out.println("First name: " + theStudent.getFirstName());
            System.out.println("Last name: " + theStudent.getLastName());

            // print out address : street and city
            Address theAddress = theStudent.getAddress();
            System.out.println(theAddress.getStreet());
            System.out.println(theAddress.getCity());

            System.out.println("-------");
            for(String theLanguage : theStudent.getLanguages()) {
                System.out.println(theLanguage);
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
