package org.example.schoolapp.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    private String courseName;
    @Id
    private String courseID;
    private String[] teacherID;

    public Course(String name, String ID, String[] teacherIDs) {
        this.setCourseName(name);
        this.setCourseID(ID);
        this.setTeacherID(teacherIDs);
    }

    public Course() {

    }

    public String[] getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String[] ID) {
        this.teacherID = ID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
