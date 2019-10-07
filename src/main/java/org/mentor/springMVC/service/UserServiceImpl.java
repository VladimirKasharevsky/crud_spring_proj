package org.mentor.springMVC.service;

import org.mentor.springMVC.dao.UserDao;
import org.mentor.springMVC.dao.UserDaoHibernateImpl;
import org.mentor.springMVC.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    UserDao userDao = new UserDaoHibernateImpl();

    @Override
    @Transactional
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    @Override
    @Transactional
    public List listData() {
        return userDao.selectData();
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public User getUserById(String id) {
        return userDao.selectDataById(id);
    }

    @Transactional
    public User getUserByLoginPassword(User user) {
        return userDao.selectDataByLoginPassword(user);
    }
}
