package ru.xcodeleon.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Repository
public class JdbcCommonDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){

        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public int insertCource(int id, String name, int duration){

        return jdbcTemplate.update("INSET into COURSE values(?, ?, ?)", id, name, duration);

    }

    public List<Map<String, Object>> getCourses(){
        return jdbcTemplate.queryForList("select * from course");
    }
}
