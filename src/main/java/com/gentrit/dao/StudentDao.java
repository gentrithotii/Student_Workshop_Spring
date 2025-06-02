package com.gentrit.dao;

import com.gentrit.domain.model.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student save);

    Student findById(int id);

    List<Student> findAll();

    void delete(int id);
}
