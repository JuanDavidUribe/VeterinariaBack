package com.app.VeterinariaBack.Controllers;

import com.app.VeterinariaBack.Models.Owner;
import com.app.VeterinariaBack.Repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OwnerGraphQLController {

    @Autowired
    private OwnerRepository ownerRepository;

    @QueryMapping
    public List<Owner> listOwners() {
        return ownerRepository.findAll();
    }
}
