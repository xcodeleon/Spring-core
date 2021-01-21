package ru.xcodeleon.spring;
import java.util.Date;

public class CurrentTime {
    Date date = new Date();

    @Override
    public String toString() {
        return date.toString();
    }


}
