/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.servletutils;

import com.minitwitter.beans.MvcConfiguration;
import com.minitwitter.dao.UserDao;
import com.minitwitter.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marcus
 */
public class RequestHandler {

    private HttpServletRequest request;
    private HttpServletResponse response;

    public RequestHandler(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    public boolean checkIfLoggedIn() {
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", 0);
        response.setHeader("Pragma", "no-cache");
        if (request.getSession().getAttribute("id_loggedin") == null || request.getSession().getAttribute("name_loggedin") == null) {
            return false;
        } else {
            return true;
        }
    }

    public void login(User user) {
        HttpSession session = request.getSession();
        if (!user.equals(null)) {
            MvcConfiguration configuration = new MvcConfiguration();
            UserDao userDao = configuration.getUserDao();
            User userCheck = userDao.get(user);
            if (userCheck != null) {
                session.setAttribute("id_loggedin", userCheck.getId());
                session.setAttribute("name_loggedin", userCheck.getName());
            }
        }
    }

    public void logout() {
        HttpSession session = request.getSession();
        session.removeAttribute("id_loggedin");
        session.removeAttribute("name_loggedin");
        request.getSession().invalidate();
    }

    public int getId_loggedin() {
        return (Integer) request.getSession().getAttribute("id_loggedin");
    }

    public String getName_loggedin() {
        return request.getSession().getAttribute("name_loggedin").toString();
    }
}
