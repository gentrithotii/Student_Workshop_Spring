package com.gentrit.dao.impl;

import com.gentrit.dao.StudentDao;
import com.gentrit.dao.sequencer.StudentSequencer;
import com.gentrit.domain.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;

    public StudentDaoListImpl(List<Student> students) {
        this.students = students;
    }

    @Override
    public Student save(Student student) {
        student.setId(StudentSequencer.nextId());
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
