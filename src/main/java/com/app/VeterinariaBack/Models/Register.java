package com.app.VeterinariaBack.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "register")
@Entity
public class Register {

    @Id
    @Getter @Setter
    @Column(name = "idOwner", nullable = false)
    private int idOwner;

    @Id
    @Getter @Setter
    @Column(name = "idPatient", nullable = false)
    private int idPatient;

    @Getter @Setter
    @Column(name = "idPatient", nullable = false)
    private String dateRegister;

}
