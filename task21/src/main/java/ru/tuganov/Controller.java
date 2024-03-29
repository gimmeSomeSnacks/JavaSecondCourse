package ru.tuganov;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.tuganov.entities.Student;
import ru.tuganov.entities.Subject;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Service service;

    @GetMapping("/search/{name}")
    public Iterable<Subject> getSpecificSubject(@PathVariable String name) {
        return service.getSpecificSubject(name);
    }

    @GetMapping("/students")
    public Iterable<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
    }

    @GetMapping("/subjects")
    public Iterable<Subject> getSubjects() {
        return service.getSubjects();
    }

    @PostMapping("/add-subject")
    public Subject addSubject(@RequestBody Subject subject) {
        return service.addSubject(subject);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable int id) {
        service.deleteSubject(id);
    }
}
