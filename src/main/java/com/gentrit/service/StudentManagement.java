package com.gentrit.service;

import com.gentrit.models.Student;

import java.util.List;

public interface StudentManagement {
    Student create();

    Student save(Student student);

    Student findById(int id);

    List<Student> findAll();

    Student edit(Student student);

}
