/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.model;

/**
 *
 * @author Kasim Lyee
 */
// src/main/java/com/example/demo/model/UserForm.java

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class UserForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "School name is required")
    private String schoolName;

    @NotBlank(message = "Address is required")
    private String schoolAddress;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String schoolPhone;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String schoolEmail;

    // Getters and Setters
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String name){
        this.schoolName = name;
    }
    public String getSchoolAddress(){
        return schoolAddress;
    }
    public void setSchoolAddress(String address){
        this.schoolAddress = address;
    }
    public String getSchoolPhone(){
        return schoolPhone;
    }
    public void setSchoolPhone(String phone){
        this.schoolPhone = phone;
    }
    public String getSchoolEmail(){
        return schoolEmail;
    }
    public void setSchoolEmail(String email){
        this.schoolEmail = email;
    }
}

