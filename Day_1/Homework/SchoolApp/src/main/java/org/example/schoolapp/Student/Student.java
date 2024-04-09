package org.example.schoolapp.Student;

import java.util.List;

public class Student {
    private String studentName;
    private String studentID;
    private String[] enrolledCourses;

    public Student(String name, String ID, String[] courses) {
        this.setName(name);
        this.setStudentID(ID);
        this.setEnrolledCourses(courses);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String[] enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public String getName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }
}
