package com.home.ssm.controller;

import com.home.ssm.domain.Student;
import com.home.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/show/{id}")
    public String findById(@PathVariable("id") int id, Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student",student);

        return "student";
    }
}
