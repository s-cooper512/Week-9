package org.example.schoolapp.Controller;

import org.example.schoolapp.Student.Student;
import org.example.schoolapp.Student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getOneStudentByID(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @GetMapping("/students/name")
    public List<Student> getStudentsByName(@RequestParam("name") String name) {
        return studentRepository.findByName(name);
    }

    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student added successfully!";
    }

    @PutMapping("/student/update/{ID}")
    public String updateStudent(@RequestBody Student student, @PathVariable Long ID) {
        Optional<Student> existingStudent = studentRepository.findById(ID);
        if (existingStudent.isPresent()) {
            Student updatedStudent = existingStudent.get();
            updatedStudent.setName(student.getName());
            updatedStudent.setEnrolledCourses(student.getEnrolledCourses());
            // You can add more updates here
            studentRepository.save(updatedStudent);
            return "Student updated successfully!";
        } else {
            return "Student not found!";
        }
    }

    @DeleteMapping("/student/delete/{ID}")
    public String deleteStudent(@PathVariable Long ID) {
        Optional<Student> existingStudent = studentRepository.findById(ID);
        if (existingStudent.isPresent()) {
            studentRepository.deleteById(ID);
            return "Student successfully removed!";
        } else {
            return "Student not found!";
        }
    }

    @PostMapping("/student/courses/{studentID}")
    public String addCourses(@PathVariable Long studentID, @RequestParam("courseID") Long courseID) {
        Optional<Student> existingStudent = studentRepository.findById(studentID);
        if (existingStudent.isPresent()) {
            Student updatedStudent = existingStudent.get();
            List<Long> newCourseList = existingStudent.get().getEnrolledCourses();
            newCourseList.add(courseID);
            updatedStudent.setEnrolledCourses(newCourseList);
            studentRepository.save(updatedStudent);
            return "Student's courses updated successfully!";
        } else {
            return "Student not found!";
        }
    }

    
}
