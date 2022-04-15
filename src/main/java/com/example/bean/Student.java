package com.example.bean;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    private int id;
    private String name;
    private int year;
    private int marks;
    private int total_marks;
    public int getId() {
        return id;
    }
    public int getTotal_marks() {
        return total_marks;
    }
    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
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
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
