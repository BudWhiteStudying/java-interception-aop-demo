package com.budwhite.studying.intercept.execution.aspect;

import com.budwhite.studying.sample.library.Model;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class BeforeAndAfterLoggingAspect {
    @Pointcut("execution(* com.budwhite.studying.sample.library.SomeInterface+.someInterfaceMethod(..)) && args(model)")
    public void someInterfaceMethod(Model model){}

    @Before("someInterfaceMethod(Model)")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("I intercepted the external method BEFORE, model is " + joinPoint.getArgs()[0]);
    }

    @After("someInterfaceMethod(Model)")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("I intercepted the external method AFTER, model is " + joinPoint.getArgs()[0]);
    }

//    @Around("whatever()")
//    public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("before");
//        proceedingJoinPoint.proceed();
//        System.out.println("after");
//    }
}
