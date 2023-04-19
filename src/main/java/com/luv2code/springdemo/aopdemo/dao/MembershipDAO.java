package com.luv2code.springdemo.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    // 적용 method 아님 : 파라미터 값 불일치
    public void addSillyMember() {

        System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");


    }
}
