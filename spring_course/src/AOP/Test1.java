package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("main start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University uni = context.getBean("university", University.class);
        String str = uni.getBook();
        System.out.println("main str = " + str);

        context.close();
        System.out.println("main stop");
    }
}
