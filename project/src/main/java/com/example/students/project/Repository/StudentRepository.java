package com.example.students.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.students.project.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long >  {
    
}
