package com.zxd.Controller;

import com.zxd.dao.Student1Dao;
import com.zxd.dao.StudentDao;
import com.zxd.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @Autowired
    StudentDao studentDao;
    @Autowired
    Student1Dao student1Dao;
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("/stu")
    public Student hell1o(){
        Student student = new Student();
        student.setCreatTime(new Date());
        student.setId(1);
        student.setName("迪丽热巴");
        studentDao.save(student);
        return student;
    }
    @RequestMapping("/find1")
    public Student hell1o2(){
        Student student = student1Dao.selectById(1);
        return student;
    }
    @RequestMapping("/err")
    public String hell1o32(){
        Student student = student1Dao.selectById(2);
        return student.getName();
    }
}
