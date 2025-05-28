package com.gentrit.data_access;

import com.gentrit.models.Student;

import java.util.List;

public interface StudentDao {
    Student save(Student save);

    Student findById(int id);

    List<Student> findAll();

    void delete(int id);
}
