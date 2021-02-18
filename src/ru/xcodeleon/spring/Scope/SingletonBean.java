package ru.xcodeleon.spring.Scope;

public class SingletonBean {

    @Override
    public String toString() {
        return ("singleton " + hashCode() );
    }
}
