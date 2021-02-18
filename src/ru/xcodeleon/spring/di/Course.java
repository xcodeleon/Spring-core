package ru.xcodeleon.spring.di;

import java.util.ArrayList;
import java.util.List;




public class Course {

    private String name;
    private int duration;
    public static List<Course> cache = new ArrayList<>();

    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }


    public void cacheCourses() {
        cache.add(this);
    }

    public void doSomething() {
        System.out.println("PreDestroy");
    }

    @Override
    public String toString() {
        return String.format("Курс %s продолжительностью %s", name, duration);
    }
}
