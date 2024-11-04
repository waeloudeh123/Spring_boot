package com.example.spring_boot_17.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

//oder @component. Es ist das gleiche.
@Service
public class StudentService {

    private final StudentRepositroy studentRepositroy;

    @Autowired
    public StudentService(StudentRepositroy studentRepositroy) {
        this.studentRepositroy = studentRepositroy;
    }

    //Die CRUD von Students
    public List<Student> getStudents() {
        return studentRepositroy.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepositroy.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        studentRepositroy.save(student);
    }

    //http://localhost:8080/api/v1/student/1, um User mit ID 1 zu löschen.
    public void deleteStudent(Long studentId) {
        boolean exists = studentRepositroy.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("student with id " + studentId + "does not exists");
        }
        studentRepositroy.deleteById(studentId);

    }
    // http://localhost:8080/api/v1/student/1?name=Maria&email=maria@gmail.com, um den Namen und Email auf Maria zu ändern.
    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepositroy.findById(studentId).
                orElseThrow(() -> new IllegalStateException("student with id " + studentId + "does not exist"));

        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }

        if (email != null &&
                email.length() > 0 &&
                !Objects.equals(student.getEmail(), email)) {
            Optional<Student> studentOptional = studentRepositroy.findStudentByEmail(email);
            if (studentOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }
    }

}
