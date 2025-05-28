package com.gentrit.data_access;

import com.gentrit.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;


    @Override
    public Student save(Student save) {
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
    public void delete(int id) {

    }
}
