package org.mentor.springMVC.controller;

import org.mentor.springMVC.dao.UserDao;
import org.mentor.springMVC.dao.UserDaoHibernateImpl;
import org.mentor.springMVC.model.User;
import org.mentor.springMVC.service.UserService;
import org.mentor.springMVC.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(HttpServletRequest request) {
//        UserService userService = new UserServiceImpl();
//
//        List<User> list = userService.listData();
//        request.setAttribute("list", list);
        return "tableserv";
    }

}

