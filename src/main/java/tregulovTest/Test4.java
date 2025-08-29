package tregulovTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("pidor");
        Dog myDog2 = context.getBean("myPet", Dog.class);
//        myDog2.setName("pidor2");
//        System.out.println(myDog.getName());
//        System.out.println(myDog2.getName());
        System.out.println("равны? " + (myDog == myDog2));
        System.out.println(myDog);
        System.out.println(myDog2);

        context.close();
    }
}
