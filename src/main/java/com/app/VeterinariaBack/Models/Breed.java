package com.app.VeterinariaBack.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "breed")
public class Breed {
    @Id
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Getter @Setter
    @Column(name = "breedName", length = 100, nullable = false)
    private String breedName;

    @Getter @Setter
    @Column(name = "specieId", length = 100, nullable = false)
    private int specieId;
}
