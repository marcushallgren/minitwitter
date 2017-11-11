/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.controllers;

import com.minitwitter.beans.MvcConfiguration;
import com.minitwitter.dao.UserDao;
import com.minitwitter.entity.User;
import com.minitwitter.servletutils.RequestHandler;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author marcus
 */
public class LoginController extends MvcConfiguration {

    @RequestMapping(value = "/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login_form", method = RequestMethod.POST)
    public void login_form(@ModelAttribute("loginFormData") User formdata, HttpServletRequest request, HttpServletResponse response) {
        RequestHandler requestHandler = getRequestHandler(request,response);
        requestHandler.login(formdata);
        try {
            response.sendRedirect("homepage");
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @RequestMapping(value = "/homepage")
    public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        RequestHandler requestHandler = getRequestHandler(request,response);
        if (requestHandler.checkIfLoggedIn()) {
            mav.setViewName("homepage");
        } else {
            mav.setViewName("login");
        }
        return mav;

    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().removeAttribute("login");
        request.getSession().removeAttribute("loginName");
        request.getSession().invalidate();
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
}
