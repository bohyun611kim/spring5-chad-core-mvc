package com.luv2code.springdemo.aopdemo.dao;


import com.luv2code.springdemo.aopdemo.entiry.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(Account myAccount, boolean b) {
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT 호출");
    }

    public boolean doWork() {

        System.out.println(getClass() + ": doWork()");

        return false;
    }
}
