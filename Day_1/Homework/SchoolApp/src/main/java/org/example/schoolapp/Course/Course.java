package org.example.schoolapp.Course;

import org.example.schoolapp.Data;

import java.util.List;
import java.util.Objects;

public class Course {
    private String courseName;
    private String courseID;
    private String[] teacherID;

    public Course(String name, String ID, String[] teacherIDs) {
        this.setCourseName(name);
        this.setCourseID(ID);
        this.setTeacherID(teacherIDs);
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
