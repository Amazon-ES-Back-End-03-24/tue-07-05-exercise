package com.ironhack.tue0705.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mammals")
@DiscriminatorValue("MAMMAL")
public class Mammal extends Animal{
    private String habitat;
}
