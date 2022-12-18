package com.app.VeterinariaBack.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "specie")
public class Specie {

    @Id
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Getter @Setter
    @Column(name = "specieName", length = 100, nullable = false)
    private String specieName;
}
