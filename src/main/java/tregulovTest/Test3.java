package tregulovTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet", Pet.class);
        //Pet pet = new Cat();
        Person clark = context.getBean("myPerson", Person.class);
        clark.callMyPet();
        System.out.println(clark.getAge());
        System.out.println(clark.getSurname());
        context.close();
    }
}
