package ru.tuganov;

import lombok.AllArgsConstructor;
import ru.tuganov.entities.Student;
import ru.tuganov.entities.Subject;
import ru.tuganov.repo.StudentRepository;
import ru.tuganov.repo.SubjectRepository;

import java.util.List;


@org.springframework.stereotype.Service
@AllArgsConstructor
public class Service {
    private StudentRepository studentRepository;
    private SubjectRepository subjectRepository;

    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public Iterable<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    public Subject addSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public void deleteSubject(long id) {
        subjectRepository.deleteById(id);
    }

    public Iterable<Subject> getSpecificSubject(String name) {
        return subjectRepository.findAllByName(name);
    }
}
