package AOP.Aspect;

import AOP.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
//@Aspect
//public class UniversityLoggingAspect {
//
//    @AfterReturning(pointcut = "execution(* getStudentList())")
//    public void getStudMethod(){
//        MethodSignature str = (MethodSignature) joinPoint.getSignature();
//        System.out.println(str.getName());
//        for (Student tmp : students)
//            tmp.setName(tmp.getName() + " я изменил вывод!!!");
//        System.out.println("логируем получение студентов после выполнения метода getStudents");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudentList())")
//    public void getStudMethod(JoinPoint joinPoint){
//        System.out.println("Поймано исключение");
//    }
//
//    @After("execution(* getStudentList())")
//    public void After(JoinPoint joinPoint){
//        System.out.println("After method");
////    }
//}
