package com.luv2code.springdemo.aopdemo;

import com.luv2code.springdemo.aopdemo.config.DemoConfig;
import com.luv2code.springdemo.aopdemo.dao.AccountDAO;
import com.luv2code.springdemo.aopdemo.dao.MembershipDAO;
import com.luv2code.springdemo.aopdemo.entiry.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(DemoConfig.class);

        // get the bean from spring container
        AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

        // get membership bean from spring container
        MembershipDAO theMembershipDAO =
            context.getBean("membershipDAO", MembershipDAO.class);

        // call the business method
        Account theAccount = new Account();
        theAccountDAO.addAccount(theAccount, true);

        // call the business method
        theMembershipDAO.addSillyMember();

        // close the context
        context.close();
    }


}
