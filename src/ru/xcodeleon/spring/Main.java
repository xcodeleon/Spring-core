package ru.xcodeleon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        CurrentTime currentTime = context.getBean("currentTime", CurrentTime.class);

        System.out.println(currentTime);
        System.out.println(helloWorld);

    }
}
