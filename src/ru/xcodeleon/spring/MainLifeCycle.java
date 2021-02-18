package ru.xcodeleon.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.xcodeleon.spring.lifecycleBean.LifeCycle;


public class MainLifeCycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-config-lifecycle.xml");
        LifeCycle lifeCycle = context.getBean("lifecycle", LifeCycle.class);
        System.out.println("Secret is " + lifeCycle.showMySecret());

        context.registerShutdownHook();


    }

}
