package ru.xcodeleon.spring.component;

import org.springframework.stereotype.Repository;
import ru.xcodeleon.spring.di.Course;
import ru.xcodeleon.spring.di.Teacher;


@Repository
public class TeacherRepositoryImpl implements TeacherRepository {

    @Override
    public Teacher getTeacher() {
        Teacher teacher = new Teacher();
        teacher.setCourse(new Course("html+css+js", 56));
        return teacher;
    }
}
