package com.example.service;

import java.util.List;

import com.example.bean.Student;

public interface IStudentService {
    public Student addStudent(Student s);
    public Student updateStudent(int id,Student s);
    public Boolean deleteStudent(int id);
    public Student getStudent(int id);
    public Student getStudentByName(String name);
    public List<Student> getAllStudents();

}
