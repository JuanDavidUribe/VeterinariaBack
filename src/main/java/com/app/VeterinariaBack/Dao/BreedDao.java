package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Breed;

import java.util.List;

public interface BreedDao {
    Breed searchBreed(int idBreed);

    List<Breed> listBreedOfSpecie(int specieId);
}
