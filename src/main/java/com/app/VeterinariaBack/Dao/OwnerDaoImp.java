package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Owner;
import com.app.VeterinariaBack.Models.Register;
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

    @Override
    public List<Owner> list(String name) {
        if(name == ""){
            String query = "from Owner";
            return entityManager.createQuery(query).getResultList();
        }
        String query = "from Owner where name = '" + name + "'";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void addOwner(Owner owner) {
        entityManager.persist(owner);
    }

    @Override
    public void deleteOwnerFromPatient(int idOwner, int idPatient) {
        Register register = new Register();
        String query = "from Register where idOwner = "+ idOwner +" AND idPatient = " + idPatient;
        register = (Register) entityManager.createQuery(query).getSingleResult();
        entityManager.remove(register);
    }

    @Override
    public void addOwnerPatient(int idOwner, int idPatient) {
        String query = "INSERT INTO `register` (`idPatient`, `idOwner`, `registerDate`) VALUES ('"+ idPatient +"', '"+ idOwner +"', SYSDATE());";
        int executeUpdate = entityManager.createNativeQuery(query).executeUpdate();
    }
}
