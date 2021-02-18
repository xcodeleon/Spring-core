package ru.xcodeleon.spring.Scope;

public class PrototypeBean {

    @Override
    public String toString() {
        return ("prototype " + hashCode());
    }
}
