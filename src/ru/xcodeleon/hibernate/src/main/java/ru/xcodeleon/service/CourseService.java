package ru.xcodeleon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.xcodeleon.dao.CourseDAO;
import ru.xcodeleon.hibernate.domains.Course;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDAO dao;

    public Course findCourse(int id){
        return dao.findById(id);
    }

    public List<Course> findAllCourse(){
        return dao.findAll();
    }

    public void save(Course course){
        dao.save(course);
    }
}
