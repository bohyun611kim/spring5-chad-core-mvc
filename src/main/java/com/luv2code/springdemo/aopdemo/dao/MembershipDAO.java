package com.luv2code.springdemo.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public boolean addSillyMember() {

        System.out.println(getClass() + " ");

        return true;
    }

    public void goToSleep() {

        System.out.println(getClass() + ": I'm going to sleep now...만사가 귀찮어");
    }
}
