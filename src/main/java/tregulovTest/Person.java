package tregulovTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
//    @Autowired
    private Pet pet;
//    @Value("${person.surname}")
    private String surname;
//    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Person created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Constructor bez argumentov");
    }

    public void callMyPet() {
        System.out.println("Calling MyPet");
        pet.say();
    }

    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set Surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set Age");
        this.age = age;
    }
}
