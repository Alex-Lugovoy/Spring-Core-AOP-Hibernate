package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Human {
    private Pet pet2;
    private Pet pet;

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;


    public Human(Pet pet)
    {
        System.out.println("Constructor");
        this.pet2 = pet;
    }

    private Human()
    {

    }

    @PostConstruct
    public void init()
    {
        System.out.println("Init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }

    public void callYourPet()
    {
        System.out.println("Hey my pet");
        pet.say();
        pet2.say();
    }

    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet)
    {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }
}
