package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.bean.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer>{
    
    @Query(value="select x from Student x where x.name=:name")
    public Student getStudentByName(@Param("name") String name);
}
