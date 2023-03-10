package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Owner;

import java.util.List;

public interface OwnerDao {
    List<Owner> getOwnersByPatient(int id);

    List<Owner> list(String name);

    void addOwner(Owner owner);

    void deleteOwnerFromPatient(int idOwner, int idPatient);

    void addOwnerPatient(int idOwner, int idPatient);
}
