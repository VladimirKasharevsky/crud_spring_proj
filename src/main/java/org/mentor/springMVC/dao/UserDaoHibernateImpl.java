package org.mentor.springMVC.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.mentor.springMVC.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoHibernateImpl implements UserDao{

//    Configuration configuration = DBConfigHibernate.getMySqlConfiguration();
//   Configuration configuration =  DBHelper.getDbHelper().getConfiguration();
    @Autowired
    private  SessionFactory sessionFactory;
//    = DBConfigHibernate.createSessionFactory(configuration);;


    public void createUser(User user) {
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();

            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void deleteUser(String id) {
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            User user;
            user = (User)session.load(User.class,Long.parseLong(id));
            session.delete(user);
            transaction.commit();
            session.close() ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void updateUser(User user) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Query query = session.createQuery("update User set name = :newName, password = :newPassword, role = :role where id = :paramName");
            query.setParameter("newName", user.getName());
            query.setParameter("newPassword", user.getPassword());
            query.setParameter("paramName", user.getId());
            query.setParameter("role", user.getRole());
            query.executeUpdate();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<User> selectData() {
        try {
            Session session = sessionFactory.openSession();
            Query query = session.createQuery("from User");
            List<User> list =  query.list();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public User selectDataById(String id) {
            try {
                Session session = sessionFactory.openSession();
                Query query = session.createQuery("from User where id =:paramName");
                query.setParameter("paramName", Long.parseLong(id));
                return (User) query.uniqueResult();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }


    public User selectDataByLoginPassword(User user) {
        try {
            Session session = sessionFactory.openSession();
            Query query = session.createQuery("from User where name =:name and password =:password");
            query.setParameter("name", user.getName());
            query.setParameter("password", user.getPassword());
            return (User) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    }



