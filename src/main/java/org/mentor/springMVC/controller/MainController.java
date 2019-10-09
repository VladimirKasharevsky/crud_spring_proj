package org.mentor.springMVC.controller;

import org.mentor.springMVC.model.User;
import org.mentor.springMVC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getIndex(Model model) {

        List<User> list = userService.listData();
        model.addAttribute("list", list);
        return "tableserv";
    }

}

