package com.gentrit.models;

public class Student {
    private int id;
    private String name;

    public Student(String name) {
        setName(name);
    }

    public Student(int id, String name) {
        this(name);
        setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
