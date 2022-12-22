package com.app.VeterinariaBack.Controllers;

import com.app.VeterinariaBack.Dao.BreedDao;
import com.app.VeterinariaBack.Models.Breed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/breed")
@CrossOrigin(origins = "http://localhost:4200")
public class BreedController {

    @Autowired
    private BreedDao breedDao;

    @GetMapping("/search/{idBreed}")
    public Breed searchBreed (@PathVariable int idBreed) {
        return breedDao.searchBreed(idBreed);
    }

    @GetMapping("/list/{specieId}")
    public List<Breed> listBreedOfSpecie (@PathVariable int specieId) {
        return breedDao.listBreedOfSpecie(specieId);
    }
}
