package ru.xcodeleon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.xcodeleon.spring.di.Student;
import ru.xcodeleon.spring.di.Teacher;

public class MainDi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-config-di.xml");

        Student student = context.getBean("student", Student.class);

        Teacher teacher = context.getBean("teacher", Teacher.class);

        System.out.println(teacher);

        System.out.println(student);
    }
}
