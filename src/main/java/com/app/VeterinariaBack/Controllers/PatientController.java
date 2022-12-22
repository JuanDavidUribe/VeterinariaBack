package com.app.VeterinariaBack.Controllers;

import com.app.VeterinariaBack.Dao.PatientDao;
import com.app.VeterinariaBack.Models.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    private PatientDao patientDao;

    @GetMapping("list/{name}")
    public List<Patient> listWithName (@PathVariable String name) {
        return patientDao.list(name);
    }

    @GetMapping("list")
    public List<Patient> list () {
        String name = "";
        return patientDao.list(name);
    }

    @PostMapping("/add")
    public void addPatient (@RequestBody Patient patient) {
        patientDao.addPatient(patient);
    }
}
