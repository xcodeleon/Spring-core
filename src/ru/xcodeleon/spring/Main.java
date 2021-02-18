package ru.xcodeleon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-config.xml");
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        CurrentTime currentTime = context.getBean("currentTime", CurrentTime.class);
        FibonacciNumber fibonacciNumber = context.getBean("fibonacchiNumber", FibonacciNumber.class);

        FactorySelfCreationBean factorySelfCreationBean = (FactorySelfCreationBean )context.getBean("factorySelfCreationBean");
        System.out.println(factorySelfCreationBean);

        HelloWorld bean2 = context.getBean("createHelloFromFactory", HelloWorld.class);
        System.out.println(bean2);

    }
}
