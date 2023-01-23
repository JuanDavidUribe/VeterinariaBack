package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Owner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class OwnerDaoImp implements OwnerDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Owner> getOwnersByPatient(int id) {
        List<Integer> idOwners = new ArrayList<>();
        String query1 = "SELECT idOwner FROM `register` WHERE idPatient = " + id;
        idOwners = entityManager.createNativeQuery(query1).getResultList();
        List<Owner> owners = new ArrayList<Owner>();
        for (int idOwner: idOwners) {
            owners.add((Owner) entityManager.find(Owner.class, idOwner));
        }
        return owners;
    }
}
