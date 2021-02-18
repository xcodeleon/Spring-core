package ru.xcodeleon.spring.component;

import org.springframework.stereotype.Repository;
import ru.xcodeleon.spring.di.Course;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CourseRepositoryImpl implements CourseRepository {
    @Override
    public List<Course> findAllCourses() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Spring+Hibernate", 32));
        courses.add(new Course("Python+web", 64));
        return courses;
    }
}
