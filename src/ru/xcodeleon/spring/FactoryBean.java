package ru.xcodeleon.spring;

public class FactoryBean {

    private static HelloWorld bean = new HelloWorld();

    private FactoryBean(){
    }

    public HelloWorld getHelloFromFactory(){

        return bean;
    }


}

