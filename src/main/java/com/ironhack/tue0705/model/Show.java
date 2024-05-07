package com.ironhack.tue0705.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "shows")
public class Show extends Event{
    @ManyToMany
    @JoinTable(
            name = "animal_show",
            joinColumns = @JoinColumn(name = "show_id"),
            inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
    private List<Animal> animals;
}
