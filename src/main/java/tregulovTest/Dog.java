package tregulovTest;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dog")
@Scope("singleton")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Created Dog");
    }

    @Override
    public void say() {
        System.out.println("BOW-WOW");
    }

    @PostConstruct
    public void init() {
        System.out.println("init-dog");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy-dog");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
