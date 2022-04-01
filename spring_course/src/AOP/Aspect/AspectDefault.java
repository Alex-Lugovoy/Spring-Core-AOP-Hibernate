package AOP.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
class AspectDefault {

    @Pointcut("execution(* get*())")
    private void allgetMethod(){}

    @Before("allgetMethod()")
    public void allMethodGet(){
        System.out.println("Логирование функций get Log #000");
    }
}
