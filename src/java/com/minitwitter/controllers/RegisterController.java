/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.controllers;

import com.minitwitter.beans.MvcConfiguration;
import com.minitwitter.dao.UserDao;
import com.minitwitter.entity.User;
import javax.servlet.ServletContext;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RegisterController extends MvcConfiguration implements ServletContextAware {

    private ServletContext context;

    public void setServletContext(ServletContext servletContext) {
        this.context = servletContext;
    }

    @RequestMapping(value = "/register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }

    @RequestMapping(value = "/registerform")
    public ModelAndView registerForm(@ModelAttribute("userFormData") User formdata) {
        UserDao userDao = getUserDao();
        if(!formdata.getEmail().isEmpty() && !formdata.getName().isEmpty() && !formdata.getPassword().isEmpty()){
        User newUser = new User();
        newUser.setEmail(formdata.getEmail());
        newUser.setName(formdata.getName());
        newUser.setPassword(formdata.getPassword());
        userDao.createUser(newUser);    
        return new ModelAndView("registered", "user", newUser.getName());
        }else{
            String userMessage = "Something went wrong, did u fill out all of the fields in the form?";
            return new ModelAndView("error", "userMessage", userMessage);
        }
        
    }
}
