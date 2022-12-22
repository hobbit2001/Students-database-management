package com.example.students.project.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Id
    private Long usn;

    @Column(name = "first_name" , nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email" )
    private String email;
    @Column(name = "semester" )
    private int semester;
    

    public Student(){

    }

    public Student(long id, String firstName, String lastName, String email , int sem) {
        this.usn = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.semester = sem;
    }

    public long getUsn() {
        return usn;
    }

    public void setUsn(long id) {
        this.usn = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
