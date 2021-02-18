package ru.xcodeleon.spring.component;

import ru.xcodeleon.spring.di.Course;

import java.util.List;

public interface CourseRepository {

    public List<Course> findAllCourses();
}
