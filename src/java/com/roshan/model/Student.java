/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roshan.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author roshan
 */
@Named(value = "student")
@RequestScoped
public class Student {
    
    private int id;
    
    private String name;
    
    private String address;
    
    private String phone;
    
    private String depart;
    
    private String course;
    
    private List<String> subjects;
    
    private static final Map<String,List> courseMap;
    
    static {
        courseMap=new HashMap<>();
        courseMap.put("choose course", null);
        courseMap.put("management", Arrays.asList("management 1","management 2","management 3"));
        courseMap.put("science", Arrays.asList("science 1","science 2","science 3"));
        courseMap.put("humanities", Arrays.asList("humanities 1","humanities 2","humanities 3"));
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Map<String, List> getCourseMap() {
        return courseMap;
    }   
    
    public void courseChangeListener(ValueChangeEvent event){
        subjects=courseMap.get(event.getNewValue().toString());
    }
    
}
