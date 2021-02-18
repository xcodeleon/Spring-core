package ru.xcodeleon.spring;

//singleton паттерн

public class FactorySelfCreationBean {
    private static FactorySelfCreationBean bean = new FactorySelfCreationBean();

    private FactorySelfCreationBean() {
    }

   public static FactorySelfCreationBean getInstance(){
        return bean;
   }

    @Override
    public String toString() {
        return "FactorySelfCreationBean";
    }
}
