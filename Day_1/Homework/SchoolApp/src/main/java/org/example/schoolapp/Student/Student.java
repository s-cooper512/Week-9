package org.example.schoolapp.Student;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "student_courses", joinColumns = @JoinColumn(name = "student_id"))
    @Column(name = "course_id")
    private List<Long> enrolledCourses = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_address_id", referencedColumnName = "id")
    private Address homeAddress;

    // Constructors
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public List<Long> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Long> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
