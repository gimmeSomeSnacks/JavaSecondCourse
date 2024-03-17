package ru.tuganov;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tuganov.repositories.StudentRepository;
import ru.tuganov.repositories.SubjectRepository;
import ru.tuganov.services.StudentService;
import ru.tuganov.services.SubjectService;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@AllArgsConstructor
public class HibernateConfig {
    private final DataSource ds;
    @Bean
    public StudentService studentService() throws SQLException {
        return new StudentService(studentRest());
    }

    @Bean
    public StudentRepository studentRest() throws SQLException {
        StudentRepository studentRepository = new StudentRepository(ds);
        studentRepository.init();
        return studentRepository;
    }

    @Bean
    public SubjectService subjectService() throws SQLException {
        return new SubjectService(subjectRest());
    }

    @Bean
    public SubjectRepository subjectRest() throws SQLException {
        return new SubjectRepository(ds);
    }
}
