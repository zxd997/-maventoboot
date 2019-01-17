package com.zxd.dao;

import com.zxd.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Student1Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public Student selectById(int id){
        String sql = "select *from student where id=?";
        BeanPropertyRowMapper<Student> studentBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Student.class);
        Student student = jdbcTemplate.queryForObject(sql,new Object[]{id}, studentBeanPropertyRowMapper);
        return student;
    }
}
