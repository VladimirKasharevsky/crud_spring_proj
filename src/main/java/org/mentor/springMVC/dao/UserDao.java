package org.mentor.springMVC.dao;

import org.mentor.springMVC.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    void deleteUser(String id);

    void updateUser(User user);

    List<User> selectData() ; //List<User>

    User selectDataById(String id);

    User selectDataByLoginPassword(User user);

}
