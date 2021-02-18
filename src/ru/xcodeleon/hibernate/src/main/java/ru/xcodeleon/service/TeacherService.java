package ru.xcodeleon.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.xcodeleon.hibernate.domains.Teacher;
import ru.xcodeleon.repository.TeacherRepository;
import ru.xcodeleon.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository repository;

    public Teacher findTeacher(int id){
        return repository.findById(id).get();
    }

    public List<Teacher> findAllTeacher(){
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public void saveTeacher(Teacher teacher){
        repository.save(teacher);
    }


    public List<Teacher> findTeachersByFio(String fio){
        Teacher teacher = repository.findByFio(fio);
        List<Teacher> teachers = new ArrayList<>();
        return teachers;


    }
}
