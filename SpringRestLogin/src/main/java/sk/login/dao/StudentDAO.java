package sk.login.dao;

import sk.login.model.Student;

public interface StudentDAO
{
    public void createStudent(Student student);
    public Student getStudent(String name, long age);
}

