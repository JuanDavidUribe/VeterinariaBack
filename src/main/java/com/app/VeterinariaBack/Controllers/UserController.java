package com.app.VeterinariaBack.Controllers;

import com.app.VeterinariaBack.Dao.UserDao;
import com.app.VeterinariaBack.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/login")
    public User login (@RequestBody User user) {
        //si el usuario existe devuelve el usuario completo
        User userValidated = userDao.validate(user);

        if(userValidated != null) {
            //si se valida que el usuario tiene la contraseña correcta devuelve el usuario
            if(userDao.login(userValidated, user)) {
                return userValidated;
            }
        }
        return null;
    }

    @GetMapping("/verify/{id}")
    public User verifyById (@PathVariable int id) {
        return userDao.verifyById(id);
    }
}
