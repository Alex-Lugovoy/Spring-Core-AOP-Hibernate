package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Pet dogBean(){
        return new Dog();
    }

    @Bean
    public Human humanBean(){
        Human tmp = new Human(catBean());
        tmp.setPet(dogBean());
        return tmp;
    }

    @Bean
    public Pet dog(){
        return new Dog();
    }


}
