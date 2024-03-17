package ru.tuganov;

import ru.tuganov.entities.Subject;

import java.util.List;

public interface SubjectCustomInterface {
    List<Subject> getSpecificSubject(String name);
}
