package com.example.controller;

import java.util.List;

import com.example.bean.Student;
import com.example.service.IStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    IStudentService service;
    
    @PostMapping("/addStudent")
	public ResponseEntity<Student> addStudent(@RequestBody Student s)
    {
        Student student = service.addStudent(s);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/getAllStudents")
	public ResponseEntity<List<Student>> getAllStudent()
    {
        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.OK);
    }
    
    @PatchMapping("/updateStudent/{id}")
    public ResponseEntity<Student>updateStudent(@PathVariable("id") int id,@RequestBody Student s){
        return new ResponseEntity<>(service.updateStudent(id,s), HttpStatus.OK);
    }
    
    @GetMapping("/getStudent/{id}")
    public ResponseEntity<Student>getStudent(@PathVariable("id")int id){
        return new ResponseEntity<>(service.getStudent(id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public ResponseEntity<Boolean>deleteStudent(@PathVariable("id") int id){
        return new ResponseEntity<>(service.deleteStudent(id), HttpStatus.OK);
    }
    
    @GetMapping("/getStudentByName/{name}")
    public ResponseEntity<Student>getStudentByName(@PathVariable("name") String name ){
        return new ResponseEntity<>(service.getStudentByName(name), HttpStatus.OK);
    }
}
