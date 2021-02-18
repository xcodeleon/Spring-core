package ru.xcodeleon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


    public class MainLazy {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-config-lazy.xml");
            System.out.println("after context initialization");
            context.getBean("lazy");
        }
    }

