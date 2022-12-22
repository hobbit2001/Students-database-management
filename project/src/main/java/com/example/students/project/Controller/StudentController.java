package com.example.students.project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.students.project.Service.StudentServiceImple;
import com.example.students.project.entity.Student;



@RestController
public class StudentController {
    
    @Autowired
    private StudentServiceImple studentService;

    @GetMapping("/student")
    public List<Student> getStudent(){

        List<Student> st = studentService.getAllStudents();
        
        return st;
        
      
    }
    @GetMapping("/student/{usn}")
    public Student getStudentByid(@PathVariable("usn") long usn){
        Student st =  studentService.getStudentById(usn);
        return st;
        
    }
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        

        Student s = studentService.saveStudent(student);
        return s;
        
    }
    @DeleteMapping("/student/{usn}")
    public void deleteStudent(@PathVariable("usn") long usn){
       studentService.deleteStudentById(usn);
    }

    @PutMapping("/student/{usn}")
    public Student updateStudent(@RequestBody Student student,@PathVariable("usn") int usn){
 
        Student s = studentService.updateStudent(student, usn);
        return s;

    }

} 
