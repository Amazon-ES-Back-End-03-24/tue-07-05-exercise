package com.ironhack.tue0705.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "birds")
@DiscriminatorValue("BIRD")
public class Bird extends Animal{
    private boolean canFly;
}
