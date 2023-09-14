package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class PatientDaoImp implements PatientDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Patient> list(String name) {
        if(name == ""){
            String query = "from Patient";
            return entityManager.createQuery(query).getResultList();
        }
        String query = "from Patient where patientName = '" + name + "'";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void addPatient(Patient patient) {
        entityManager.persist(patient);
    }

    @Override
    public void updateName(Patient patient, String newName) {
        patient.setPatientName(newName);
        entityManager.merge(patient);
    }
}
