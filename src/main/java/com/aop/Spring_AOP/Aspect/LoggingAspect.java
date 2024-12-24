package com.aop.Spring_AOP.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.aop.Spring_AOP.Service.EmployeeService.*(..))")
    public  void logBeforeMethod(JoinPoint joinPoint){
        System.out.println("Before method:" +joinPoint.getSignature().getName());
    }

    @After("execution(* com.aop.Spring_AOP.Service.EmployeeService.*(..))")
    public void logAfterMethod(JoinPoint joinPoint){
        System.out.println("After method:" +joinPoint.getSignature().getName());
    }
}
