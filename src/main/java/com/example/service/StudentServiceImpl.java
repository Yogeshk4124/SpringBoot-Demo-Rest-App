package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.bean.Student;
import com.example.exception.StudentNotFoundException;
import com.example.repository.IStudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentRepository repo;

    @Override
    public Student addStudent(Student s) {
        System.out.println(s.toString());
        return repo.save(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Student updateStudent(int id,Student student) {
        Optional<Student> s = repo.findById(id);
        if (!s.isPresent())
            throw new StudentNotFoundException("Id not found: " + id);
        repo.deleteById(id);
        return repo.save(student);
    }

    @Override
    public Boolean deleteStudent(int id) {
        Optional<Student> s = repo.findById(id);
        if (!s.isPresent())
            throw new StudentNotFoundException("Id not found: " + id);
        repo.deleteById(id);
        return true;
    }

    @Override
    public Student getStudent(int id) {
        Optional<Student> s = repo.findById(id);
        if (!s.isPresent())
            throw new StudentNotFoundException("Id not found: " + id);
        return s.get();
    }

    @Override
    public Student getStudentByName(String name) {
        return repo.getStudentByName(name);
    }
}
