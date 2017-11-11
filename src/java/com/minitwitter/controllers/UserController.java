/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.controllers;

import com.minitwitter.beans.MvcConfiguration;
import com.minitwitter.dao.UserDao;
import com.minitwitter.entity.User;
import java.util.List;
import javax.servlet.ServletContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author marcus
 */
@Controller
public class UserController extends MvcConfiguration {

    @RequestMapping(value = "/listUsers")
    public ModelAndView listUsers() {
        UserDao userDao = getUserDao();
        List<User> listUser = userDao.list();
        ModelAndView mav = new ModelAndView();
        mav.addObject("size", listUser.size());
        mav.addObject("listuser", listUser);
        mav.setViewName("listUsers");
        return mav;
    }
}