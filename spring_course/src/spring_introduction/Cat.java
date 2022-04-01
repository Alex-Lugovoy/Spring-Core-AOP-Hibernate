package spring_introduction;

import org.springframework.stereotype.Component;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Miu");
    }

    public Cat(){
        System.out.println("Cat created");
    }
}
