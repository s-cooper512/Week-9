package org.example.schoolapp.Teacher;

import java.util.List;

public class Teacher {
    private String teacherName;
    private String teacherID;
    private String[] courses;

    public Teacher(String name, String ID, String[] courses) {
        this.setName(name);
        this.setTeacherID(ID);
        this.setCourses(courses);
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] enrolledCourses) {
        this.courses = enrolledCourses;
    }

    public String getName() {
        return teacherName;
    }

    public void setName(String name) {
        this.teacherName = name;
    }
}
