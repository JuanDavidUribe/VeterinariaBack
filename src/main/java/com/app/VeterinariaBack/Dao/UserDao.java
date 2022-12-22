package com.app.VeterinariaBack.Dao;

import com.app.VeterinariaBack.Models.User;

public interface UserDao {
    User validate(User user);

    boolean login(User userValidated, User user);

    User verifyById(int id);
}
