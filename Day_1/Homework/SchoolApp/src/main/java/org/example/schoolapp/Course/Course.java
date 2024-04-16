package org.example.schoolapp.Course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Course {
    private String courseName;
    @Id
    private Long courseID;
    private List<Long> teacherID;

    public Course(String name, Long ID, List<Long> teacherIDs) {
        this.setCourseName(name);
        this.setCourseID(ID);
        this.setTeacherID(teacherIDs);
    }

    public Course() {

    }

    public List<Long> getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(List<Long> ID) {
        this.teacherID = ID;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
