package ru.tuganov.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ru.tuganov.entities.Student;

@Setter
@Getter
@Entity
@AllArgsConstructor
public class Subject {
    @Id
    private int id;
    private String name;
    private String description;
    private int student_id;
//    @ManyToOne
//    private Student student;
    public Subject() {

    }
}
