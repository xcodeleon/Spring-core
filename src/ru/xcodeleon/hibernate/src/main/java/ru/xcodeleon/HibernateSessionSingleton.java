package ru.xcodeleon;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.xcodeleon.hibernate.domains.Course;
import ru.xcodeleon.hibernate.domains.Student;


public class HibernateSessionSingleton {

    private static SessionFactory sessionFactory;

    private HibernateSessionSingleton() {
    }

    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(Course.class);
                configuration.configure();

                sessionFactory = configuration.buildSessionFactory();

            } catch (Exception e) {
                System.out.println("Ошибка инициализации Hibernate конфигурации");
                e.printStackTrace();
            }

        }
        return sessionFactory;
    }
}

