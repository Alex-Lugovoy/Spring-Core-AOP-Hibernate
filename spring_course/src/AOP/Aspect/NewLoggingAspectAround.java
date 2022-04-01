package AOP.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
//public class NewLoggingAspectAround {
//
//    @Around("execution(public String getBook())")
//    public Object afterMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
//    {
//        System.out.println("Start Advice method");
//
//        Object tmp = proceedingJoinPoint.proceed();
//        System.out.println("Stop Advice method");
//
//        return tmp;
//    }
//}
