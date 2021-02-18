import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.xcodeleon.hibernate.domains.Course;
import ru.xcodeleon.hibernate.domains.Student;
import ru.xcodeleon.service.ModuleService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainModule {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ModuleService moduleService = context.getBean(ModuleService.class);

        Course junior = new Course("Java Junior", 32);
        List<Course> courses = new ArrayList<>();
        courses.add(junior);

        Student student = new Student("Иванов Пётр", new Date(), 1000L, courses);
        List<Student> students = new ArrayList<>();
        students.add(student);

    }
}
