package com.luv2code.springdemo.aopdemo.dao;


import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println(getClass() + " DOING MY DB WORK: ADDING AN ACCOUNT 호출");
    }
}
