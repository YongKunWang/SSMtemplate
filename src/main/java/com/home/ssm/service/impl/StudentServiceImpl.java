package com.home.ssm.service.impl;

import com.home.ssm.dao.IStudentMapper;
import com.home.ssm.domain.Student;
import com.home.ssm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentMapper studentMapper;

    @Override
    public Student findById(int id) {
        return studentMapper.findById(id);
    }
}
