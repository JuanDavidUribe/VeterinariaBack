package com.app.VeterinariaBack.Controllers;

import com.app.VeterinariaBack.Dao.OwnerDao;
import com.app.VeterinariaBack.Models.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/owner")
@CrossOrigin(origins = "http://localhost:4200")
public class OwnerController {

    @Autowired
    private OwnerDao ownerDao;

    @GetMapping("/listByPatient/{id}")
    public List<Owner> getOwnersByPatient (@PathVariable int id) {
        return ownerDao.getOwnersByPatient(id);
    }
}
