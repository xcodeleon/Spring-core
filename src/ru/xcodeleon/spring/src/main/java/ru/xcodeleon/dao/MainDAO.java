package ru.xcodeleon.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDAO {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-jdbc.xml");

        JdbcCommonDao dao = context.getBean("jdbcCommonDao", JdbcCommonDao.class);

        dao.insertCource(1, "Spring+HIbernate", 32);
        System.out.println(dao.getCourses());

    }


}


