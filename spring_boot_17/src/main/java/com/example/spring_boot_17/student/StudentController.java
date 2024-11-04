package com.example.spring_boot_17.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// Klasse als Controller für RESTful Webservices kennzeichnet
@RestController
//Legt den Basis-URI für alle Methoden der Klasse fest
//Kommt auf Klassenebene vor
@RequestMapping(path = "api/v1/student")
public class StudentController {

    //Objekt zum Aufruf von Students in StudentService.
    private final StudentService studentService;

    @Autowired
    //Dependency Injection.
    //Konstruktur zum Erstellen von Studencontroller.
    // Spring Boot kümmert sich um die Erstellung des studentService-Objekts. werden durch RestController als Spring Boot gezeichnet.
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //Speziell für HTTP GET-Anfragen, um eine Methode zu kennzeichnen.
    //Gibt an, dass die Methode bei GET-Anfragen an den festgelegten URI aufgerufen wird.
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    //@RequestBody bindet den Inhalt der HTTP-Anfrage an ein Java-Objekt.
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }

}