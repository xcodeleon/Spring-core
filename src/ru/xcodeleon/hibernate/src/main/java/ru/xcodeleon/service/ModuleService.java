package ru.xcodeleon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.xcodeleon.dao.CourseDAO;
import ru.xcodeleon.dao.StudentDAO;
import ru.xcodeleon.hibernate.domains.Course;
import ru.xcodeleon.hibernate.domains.Student;
import ru.xcodeleon.hibernate.domains.Teacher;
import ru.xcodeleon.repository.TeacherRepository;

import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private CourseDAO courseDAO;

    @Autowired
    private StudentDAO studentDAO;

public void createModule(Teacher teacher, Course course, List<Student> students ){

     teacherRepository.save(teacher);

     courseDAO.save(course);
     for (Student student : students){
         studentDAO.save(student);
     }
}

}
