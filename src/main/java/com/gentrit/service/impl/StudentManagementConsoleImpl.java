package com.gentrit.service.impl;

import com.gentrit.data_access.StudentDao;
import com.gentrit.models.Student;
import com.gentrit.service.StudentManagement;
import com.gentrit.util.UserInputService;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {
    private UserInputService scannerService;
    private StudentDao studentDao;

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
