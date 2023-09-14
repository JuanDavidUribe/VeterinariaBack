package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.Patient;

import java.util.List;

public interface PatientDao {
    List<Patient> list(String name);

    void addPatient(Patient patient);

    void updateName (Patient patient, String newName);
}
