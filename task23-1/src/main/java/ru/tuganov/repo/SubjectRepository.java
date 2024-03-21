package ru.tuganov.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.tuganov.entities.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {
    Iterable<Subject> findAllByName(String name);
}
