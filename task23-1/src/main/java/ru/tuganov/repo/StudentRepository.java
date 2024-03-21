package ru.tuganov.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
