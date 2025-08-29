package tregulovTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callMyPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();

        context.close();
    }
}
