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

    @GetMapping("/list")
    public List<Owner> list () {
        return ownerDao.list("");
    }

    @GetMapping("/list/{name}")
    public List<Owner> listWithName (@PathVariable String name) {
        return ownerDao.list(name);
    }

    @PostMapping ("/add")
    public void addOwner (@RequestBody Owner owner) {
        ownerDao.addOwner(owner);
    }

    @DeleteMapping ("/delete/{idOwner}/{idPatient}")
    public void deleteOwnerFromPatient (@PathVariable int idOwner, @PathVariable int idPatient) {
        ownerDao.deleteOwnerFromPatient(idOwner, idPatient);
    }

    @GetMapping("addOwnerPatient/{idOwner}/{idPatient}")
    public void addOwnerPatient (@PathVariable int idOwner, @PathVariable int idPatient) {
        ownerDao.addOwnerPatient(idOwner, idPatient);
    }
}
