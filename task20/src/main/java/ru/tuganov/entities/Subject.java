package ru.tuganov.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@AllArgsConstructor
@Table(name = "subjects")
public class Subject {
    @Id
    private int id;
    private String name;
    private String description;
    private int student_id;
    public Subject() {

    }
}
