package com.example.students.project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.students.project.Repository.StudentRepository;
import com.example.students.project.entity.Student;

@Service
public class StudentServiceImple implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
       
         List<Student> st = studentRepository.findAll();
         return st;
    }

    @Override
    public Student saveStudent(Student student) {
        Student s = studentRepository.save(student);
        return s;
    }

    @Override
    public Student getStudentById(Long id) {
        Student s = studentRepository.findById(id).get();
        return s;

    }

    @Override
    public Student updateStudent(Student student ,long usn)
     {
        student.setUsn(usn);
        Student s = studentRepository.save(student);
        return s;
    }

    @Override
    public void deleteStudentById(Long usn) {
        studentRepository.deleteById(usn);
        
    }
    
}
