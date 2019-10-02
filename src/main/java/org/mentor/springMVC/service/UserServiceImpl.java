package org.mentor.springMVC.service;

import org.mentor.springMVC.dao.UserDao;
import org.mentor.springMVC.dao.UserDaoHibernateImpl;
import org.mentor.springMVC.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {


    UserDao userDao = new UserDaoHibernateImpl();

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    @Override
    public List listData() {
        return userDao.selectData();
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getUserById(String id) {
        return userDao.selectDataById(id);
    }

    public User getUserByLoginPassword(User user) {
        return userDao.selectDataByLoginPassword(user);
    }
}
