package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Breed;
import com.app.VeterinariaBack.Models.Specie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class SpecieDaoImp implements SpecieDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Specie searchSpecieByBreed(int idBreed) {
        String Query = "from Breed where id = '" + idBreed +"'";
        Breed breed = (Breed) entityManager.createQuery(Query).getSingleResult();

        String query2 = "from Specie where id = '" +breed.getSpecieId()+ "'";
        return (Specie) entityManager.createQuery(query2).getSingleResult();
    }

    @Override
    public List<Specie> list() {
        String query = "from Specie";
        return entityManager.createQuery(query).getResultList();
    }
}
