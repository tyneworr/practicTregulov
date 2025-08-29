package tregulovTest;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Created Cat");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
