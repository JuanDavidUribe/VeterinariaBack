package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Owner;

import java.util.List;

public interface OwnerDao {
    List<Owner> getOwnersByPatient(int id);
}
