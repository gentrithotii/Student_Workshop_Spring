package com.gentrit.service;

import com.gentrit.domain.model.Student;

import java.util.List;

public interface StudentManagement {
    Student create();

    Student save(Student student);

    Student findById(int id);

    List<Student> findAll();

    Student edit(Student student);

}
