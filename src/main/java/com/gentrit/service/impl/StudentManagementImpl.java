package com.gentrit.service.impl;

import com.gentrit.dao.StudentDao;
import com.gentrit.domain.model.Student;
import com.gentrit.service.StudentManagement;
import com.gentrit.util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentManagementImpl implements StudentManagement {
    private final UserInputService userInputService;
    private final StudentDao studentDao;

    @Autowired
    public StudentManagementImpl(UserInputService userInputService, StudentDao studentDao) {
        this.userInputService = userInputService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        System.out.println("Creating a new student");
        System.out.print("Enter student name: ");
        String name = userInputService.getString();

        Student student = new Student(name);

        return student;
    }

    @Override
    public Student save(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student can't be null");
        }
        return studentDao.save(student);
    }

    @Override
    public Student findById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Id can't be negative number or  0");
        }
        Student existing = studentDao.findById(id);

        return existing;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cant be null");
        }
        Student foundStudent = studentDao.findById(student.getId());

        if (foundStudent != null) {
            foundStudent.setName(student.getName());
        }
        return null;
    }
}
