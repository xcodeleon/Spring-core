package ru.xcodeleon.service;

import ru.xcodeleon.hibernate.domains.Student;

import java.util.List;
import ru.xcodeleon.dao.StudentDAO;


public class StudentService {

    private StudentDAO dao = new StudentDAO();

    public Student findStudent(int id) {
        return dao.findById(id);
    }

    public List<Student> findAllStudents() {
        return dao.findAll();
    }

    public void saveStudent(Student student) {
        dao.save(student);
    }
}
