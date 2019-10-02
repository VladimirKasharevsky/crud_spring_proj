package org.mentor.springMVC.service;

import org.mentor.springMVC.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user) ;

    void deleteUser(String id);

    List listData();

    void updateUser(User user);

    User getUserById(String id);
}
