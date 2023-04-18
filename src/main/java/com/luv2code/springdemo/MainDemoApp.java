package com.luv2code.springdemo;

import com.luv2code.springdemo.aopdemo.config.DemoConfig;
import com.luv2code.springdemo.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        // load spring config file
        // read spring config java class
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(DemoConfig.class);// read spring config java class

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // call the business method
        theAccountDAO.addAccount();

        // do it again!
        System.out.println("\nlet's call it again!\n");

        // call the business method again
        theAccountDAO.addAccount();

        // close the context
        context.close();
    }


}
