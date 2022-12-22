package com.app.VeterinariaBack.Controllers;

import com.app.VeterinariaBack.Dao.SpecieDao;
import com.app.VeterinariaBack.Models.Breed;
import com.app.VeterinariaBack.Models.Specie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specie")
@CrossOrigin(origins = "http://localhost:4200")
public class SpecieController {

    @Autowired
    private SpecieDao specieDao;

    @GetMapping("/search/{idBreed}")
    public Specie searchSpecieByBreed (@PathVariable int idBreed) {
        return specieDao.searchSpecieByBreed(idBreed);
    }

    @GetMapping("/list")
    public List<Specie> list () {
        return specieDao.list();
    }

}
