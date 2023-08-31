package com.app.VeterinariaBack.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Owner")
public class Owner {
    @Id
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Getter @Setter
    @Column(name = "typeId", length = 50, nullable = false)
    private String typeId;

    @Getter @Setter
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Getter @Setter
    @Column(name = "city", length = 100, nullable = false)
    private String city;

    @Getter @Setter
    @Column(name = "address", length = 100, nullable = false)
    private String address;

    @Getter @Setter
    @Column(name = "cellphone", length = 10, nullable = false)
    private String cellphone;

    @Getter @Setter
    @Column(name = "observations", length = 100)
    private String observations;

}
