/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.school_management_system.controller;

import com.school_management_system.model.Student;
import com.school_management_system.service.StudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Kasim Lyee
 */
@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "https://localhost:5173")
public class StudentController {
    
    @Autowired
    public StudentService studentService;
    
    @PostMapping("/register")
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        Student newStudent = studentService.saveStudent(student);
        return ResponseEntity.ok(newStudent);
    }
    
    //upoading students from excel
    @PostMapping("/upload")
    public ResponseEntity<String> uploadStudents(@RequestParam("file") MultipartFile file){
       //studentService.processExcelFile(file); 
       return ResponseEntity.ok("File upload successfully.");
    }
    
    @GetMapping("/getStudents")
    public ResponseEntity<List<Student>>getAllStudents(){
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        Optional<Student> student = studentService.getStudentById(id);
        return  student.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}