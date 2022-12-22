package com.example.students.project.Service;

import java.util.List;

import com.example.students.project.entity.Student;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student ,long usn);

    void deleteStudentById(Long id);
}
