package com.ironhack.tue0705.model;

import jakarta.persistence.*;

@Entity
@Table(name = "animals")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type")
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    // (optional, to rename column) @JoinColumn(name = "favorite_carer")
    private Carer favoriteCarer;

    @ManyToOne
    @JoinColumn(name = "carer_id")
    private Carer carer;
}
