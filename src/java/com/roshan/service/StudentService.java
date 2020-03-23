/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roshan.service;

import com.roshan.model.Student;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author roshan
 */
@Named(value = "service")
@ApplicationScoped
public class StudentService {
    
    private static final List<Student> students;
    private static int id;
    
    static {
        
        students =  new ArrayList<>();
        id=1;
    }

    /**
     * Creates a new instance of StudentService
     */
    public StudentService() {
    }
    
    public void add(Student student){
        student.setId(id);
        students.add(student);
        id++;
    }
    
    public Student getStudent(int id){
        for(Student student:students){
            if(student.getId()==id){
                return student;
            }
        }
        return null;
    }
    
    public List<Student> getStudents(){
        return students;
    }
    
    public void update(Student student){
        Student s = getStudent(student.getId());
        int index = students.indexOf(s);
        students.add(index, student);
    }
    
    public boolean delete(int id){
        Student student = getStudent(id);
        return students.remove(student);
    }
    
}
