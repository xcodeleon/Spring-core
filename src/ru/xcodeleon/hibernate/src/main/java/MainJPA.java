import org.hibernate.Transaction;
import ru.xcodeleon.hibernate.domains.Course;
import ru.xcodeleon.hibernate.domains.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class MainJPA {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceDB");

        EntityManager entityManager = factory.createEntityManager();

        try {
            EntityTransaction tx = entityManager.getTransaction();
            tx.begin();

            //Teacher teacher = entityManager.find(Teacher.class, 1);
            //System.out.println(teacher.getCourses());

            Teacher teacher = new Teacher(2,"Сидоров", "10 лет стаж");

            entityManager.persist(teacher);

            tx.commit();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
            factory.close();
        }
    }
}
