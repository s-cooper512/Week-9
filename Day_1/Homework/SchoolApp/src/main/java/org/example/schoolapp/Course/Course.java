package org.example.schoolapp.Course;

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.setCourseName(courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
