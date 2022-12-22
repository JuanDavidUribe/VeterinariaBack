package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Specie;

import java.util.List;

public interface SpecieDao {
    Specie searchSpecieByBreed(int idBreed);

    List<Specie> list();
}
