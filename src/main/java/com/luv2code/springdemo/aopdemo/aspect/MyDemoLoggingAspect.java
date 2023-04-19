package com.luv2code.springdemo.aopdemo.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // addXXX 함수 호출전에 이곳을 거쳐간다.

    @Before("execution(* add*(com.luv2code.springdemo.aopdemo.entiry.Account, ..))")
    public void beforeAddAccountAdvice() {

        System.out.println("\n=====>>> ################################  Executing @Before advice on method");

    }

}
