package ru.tuganov.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tuganov.entities.Student;
import ru.tuganov.repositories.StudentRepository;

import java.sql.SQLException;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private StudentRepository studentRepository;

    public List<Student> getStudents() throws SQLException {
        return studentRepository.getStudents();
    }
    public Student addStudent(Student student) throws SQLException {
        return studentRepository.addStudent(student);
    }

    public boolean deleteStudent(int id) throws SQLException {
        return studentRepository.deleteStudent(id);
    }

}
