package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestingAop {


    @Pointcut("execution(* com.example.demo.*.*(..))")
    private void byPackage() {
    }

    @Pointcut("execution(* com.example.demo.MyClass2.*(..))")
    private void byPackageAndClass() {
    }


    @Pointcut("execution(* com.example.demo.MyClass2.testMethod(..))")
    private void byPackageClassAndMethodName(){
    }

    @Pointcut("execution(* com.example.demo.MyClass2.testMethod(String))")
    private void byPackageClassMethodNameAndArgsType(){
    }




    @Around(value = "byPackage()")
    public Object doAop1(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before-------------------------------------");
        Object proceed = point.proceed();
        System.out.println("after--------------------------------------");
        return proceed;
    }

    @Around(value = "byPackageAndClass()")
    public Object doAop2(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before-------------------------------------");
        Object proceed = point.proceed();
        System.out.println("after--------------------------------------");
        return proceed;
    }

    @Around(value = "byPackageClassAndMethodName()")
    public Object doAop3(ProceedingJoinPoint point) throws Throwable {
        System.out.println("before-------------------------------------");
        Object proceed = point.proceed();
        System.out.println("after--------------------------------------");
        return proceed;
    }

    @Around(value = "byPackageClassMethodNameAndArgsType() && args(temp)")
    public Object doAop4(ProceedingJoinPoint point, String temp) throws Throwable {
        System.out.println("before-------------------------------------");
        Object proceed = point.proceed(new Object[]{temp});
        System.out.println("after--------------------------------------");
        return proceed;
    }


}
