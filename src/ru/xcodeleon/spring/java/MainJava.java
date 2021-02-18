package ru.xcodeleon.spring.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.xcodeleon.spring.di.Student;

public class MainJava {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ApplicationConfig config = context.getBean("myConfig", ApplicationConfig.class);

        System.out.println(config);
        Student student = context.getBean("student", Student.class);
        System.out.println(student);

    }
}
