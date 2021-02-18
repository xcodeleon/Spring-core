package ru.xcodeleon.spring.java;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.xcodeleon.spring.di.Course;
import ru.xcodeleon.spring.di.Student;

@Configuration
public class ApplicationConfig {

    @Bean
    public ApplicationConfig myConfig() {
        return new ApplicationConfig();

    }

    @Bean("student")
    public Student getStudent(Course course) {
        return new Student(course, "Петров Сидор");
    }

    @Bean
    public Course getCourse() {
        return new Course("Java Junior", 16);
    }


    @Override
    public String toString() {
        return "Java-Based Application configuration!";


    }
}
