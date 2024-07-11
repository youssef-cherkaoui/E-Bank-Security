package com.Banke.Service;

import com.Banke.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    User createuser(User u);


}
