package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Breed;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BreedDaoImp implements BreedDao{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Breed searchBreed(int idBreed) {
        String Query = "from Breed where id = '" + idBreed +"'";
        return (Breed) entityManager.createQuery(Query).getSingleResult();
    }

    @Override
    public List<Breed> listBreedOfSpecie(int specieId) {
        String query = "from Breed where specieId = '" + specieId +"'";
        return entityManager.createQuery(query).getResultList();
    }
}
