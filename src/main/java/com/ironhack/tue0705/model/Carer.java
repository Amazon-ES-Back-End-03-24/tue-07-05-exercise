package com.ironhack.tue0705.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "carers")
public class Carer extends Employee{
    @OneToOne(mappedBy = "favoriteCarer")
    private Animal animal;

    @OneToMany(mappedBy = "carer")
    private List<Animal> animals;
}
