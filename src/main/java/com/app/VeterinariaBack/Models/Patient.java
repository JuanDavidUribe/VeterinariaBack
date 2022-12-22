package com.app.VeterinariaBack.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Getter @Setter
    @Column(name = "patientName", length = 100, nullable = false)
    private String patientName;

    @Getter @Setter
    @Column(name = "breedId", length = 100, nullable = false)
    private int breedId;

    @Getter @Setter
    @Column(name = "birth", nullable = false, columnDefinition = "date")
    //format "yyyy-mm-dd"
    private String birth;

}
