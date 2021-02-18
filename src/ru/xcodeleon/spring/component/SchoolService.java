package ru.xcodeleon.spring.component;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.xcodeleon.spring.di.Course;


    @Component
    public class SchoolService {

        @Bean
        @Qualifier("java")
        public Course getJavaCourse() {
            return new Course("Spring+Hibernate", 32);
        }

        @Bean
        @Qualifier("python")
        public Course getPythonCourse() {
            return new Course("Spring+Hibernate", 32);
        }
}
