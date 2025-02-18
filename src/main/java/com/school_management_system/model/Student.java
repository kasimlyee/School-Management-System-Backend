/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.model;

/**
 *
 * @author Kasim Lyee
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String enrolledClass;
    private String contact;
    private String location;
    private String fatherName;
    private String motherName;
    private String fatherContact;
    private String motherContact;
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getfName(){
        return firstName;
    }
    public void setfName(String name){
        this.firstName = name;
    }
    public String getlName(){
        return lastName;
    }
    public void setlName(String name){
        this.lastName = name;
    }
    public String enrolledClass(){
        return enrolledClass;
    }
    public void setClass(String classes){
        this.enrolledClass = classes;
    }
    public String getContacts(){
        return contact;
    }
    public void setContacts(String contact){
        this.contact = contact;
    }
    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getFatherName(){
        return fatherName;
    }
    public void setFatherName(String name){
        this.fatherName = name;
    }
    public String getMotherName(){
        return motherName;
    }
    public void setMotherName(String name){
        this.motherName = name;
    }
    public String getfContact(){
        return fatherContact;
    }
    public void setfContact(String contact){
        this.fatherContact = contact;
    }
    public String getmContact(){
        return motherContact;
    }
    public void setmContact(String contact){
        this.motherContact = contact;
    }
              
}
