package com.gentrit.data_access.impl;

import com.gentrit.data_access.StudentDao;
import com.gentrit.models.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;


    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findById(int id) {
        return students.stream().filter((st) -> st.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return List.copyOf(students);
    }

    @Override
    public void delete(int id) {
        students.removeIf((s) -> s.getId() == id);
    }
}
