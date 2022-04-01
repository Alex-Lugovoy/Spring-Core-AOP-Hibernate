package AOP.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//@Order(-100)
//public class LoggickAspect {
//
//    @Pointcut("execution(* get*())")
//    private void allgetMethod(){}
//
//    @Before("allgetMethod()")
//    public void allMethodGet(JoinPoint joinPoint){
//        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
//        System.out.println(methodSignature);
//        System.out.println(methodSignature.getMethod());
//        System.out.println(methodSignature.getReturnType());
//        System.out.println(methodSignature.getName());
//
//        Object[] obj = joinPoint.getArgs();
//    }
//}
//
//@Component
//@Aspect
//@Order(100)
//class LoggickAspect2 {
//
//    @Pointcut("execution(* get*())")
//    private void allgetMethod(){}
//
//    @Before("allgetMethod()")
//    public void allMethodGet(){
//        System.out.println("Логирование функций get Log #3");
//    }
//}
//
//
//@Component
//@Aspect
//@Order(1)
//class LoggickAspect1 {
//
//    @Pointcut("execution(* get*())")
//    private void allgetMethod(){}
//
//    @Before("allgetMethod()")
//    public void allMethodGet(){
//        System.out.println("Логирование функций get Log #2");
//    }
//}

