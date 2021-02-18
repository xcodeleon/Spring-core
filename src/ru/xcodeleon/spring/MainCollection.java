package ru.xcodeleon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.xcodeleon.spring.di.Scool;

public class MainCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-config-collections.xml");

        Scool scool = context.getBean("scool", Scool.class);
        System.out.println(scool);


        ((ClassPathXmlApplicationContext) context).close();
    }
}
