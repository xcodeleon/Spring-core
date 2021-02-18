import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.xcodeleon.HibernateSessionSingleton;
import ru.xcodeleon.hibernate.domains.Course;
import ru.xcodeleon.hibernate.domains.Student;
import ru.xcodeleon.service.StudentService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Session session = HibernateSessionSingleton.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();


        Course junior = new Course("Java junior", 64);
        Course middle = new Course("Java middle", 85);

        List<Course> courses = new ArrayList<>();
        courses.add(junior);
        courses.add(middle);

        Student student = new Student("Максим", new Date(123456), 1000L, courses);
        junior.setStudent(student);
        middle.setStudent(student);

        StudentService service = new StudentService();
        service.saveStudent(student);


        tx.commit();
        session.close();
    }
}
