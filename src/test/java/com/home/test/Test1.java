package com.home.test;

import com.home.ssm.domain.Student;
import com.home.ssm.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class Test1 {
    @Autowired
    private IStudentService studentService;

    @Test
    public void test2(){
        Student student = studentService.findById(1);
        System.out.println(student);
    }
}
