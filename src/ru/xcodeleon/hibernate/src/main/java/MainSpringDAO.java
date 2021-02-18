import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.xcodeleon.hibernate.domains.Teacher;
import ru.xcodeleon.service.CourseService;
import ru.xcodeleon.service.TeacherService;

public class MainSpringDAO {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        CourseService service = context.getBean(CourseService.class);
        System.out.println(service.findAllCourse());

        TeacherService servise1 = context.getBean(TeacherService.class);
        System.out.println(servise1.findAllTeacher());

    }
}
