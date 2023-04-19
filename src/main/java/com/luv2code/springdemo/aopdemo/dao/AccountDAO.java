package com.luv2code.springdemo.aopdemo.dao;


import com.luv2code.springdemo.aopdemo.entiry.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account theAccount, boolean flag) {
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT");
    }

}
