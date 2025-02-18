/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.service;

import com.school_management_system.model.Student;
import com.school_management_system.repository.StudentRepository;
import java.io.File;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kasim Lyee
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
