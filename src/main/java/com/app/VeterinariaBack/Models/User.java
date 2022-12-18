package com.app.VeterinariaBack.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "id")
    @Getter @Setter
    private int id;

    @Getter @Setter
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Getter @Setter
    @Column(name = "userName", length = 100, nullable = false, unique = true)
    private String userName;

    @Getter @Setter
    @Column(name = "password", length = 100, nullable = false)
    private String password;
}
