package com.ironhack.tue0705.model;

import jakarta.persistence.*;

@Entity
@Table(name = "events")
@Inheritance(strategy = InheritanceType.JOINED)
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
}
