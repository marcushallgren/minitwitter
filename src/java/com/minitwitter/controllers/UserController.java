/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minitwitter.controllers;

import com.minitwitter.beans.MvcConfiguration;
import com.minitwitter.dao.FollowingDao;
import com.minitwitter.dao.UserDao;
import com.minitwitter.entity.Following;
import com.minitwitter.entity.Tweet;
import com.minitwitter.entity.User;
import com.minitwitter.servletutils.RequestHandler;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ModelAndView listUsers(HttpServletRequest request, HttpServletResponse response) {
        RequestHandler requestHandler = getRequestHandler(request, response);
        if (requestHandler.checkIfLoggedIn()) {
            UserDao userDao = getUserDao();
            List<User> listUser = userDao.list();
            ModelAndView mav = new ModelAndView();
            mav.addObject("size", listUser.size());
            mav.addObject("listUser", listUser);
            mav.setViewName("listUsers");
            return mav;
        } else {
            return new ModelAndView("login");
        }
    }

    @RequestMapping(value = "/listFollowing")
    public ModelAndView listFollowing(HttpServletRequest request, HttpServletResponse response) {
        RequestHandler requestHandler = getRequestHandler(request, response);
        if (requestHandler.checkIfLoggedIn()) {
            int userId = requestHandler.getId_loggedin();
            UserDao userDao = getUserDao();
            List<User> listUser = new ArrayList<User>();
            List<User> users = userDao.list();
            List<Following> listFollowing = getFollowingDao().getFollowing(userId);
            for (User user : users) {
                if (listFollowing != null) {
                    for (Following following : listFollowing) {
                        if (user.getId() == following.getFollowingId()) {
                            listUser.add(user);
                        }
                    }
                }
            }
            ModelAndView mav = new ModelAndView();
            mav.addObject("size", listUser.size());
            mav.addObject("listUser", listUser);
            mav.setViewName("listFollowing");
            return mav;
        } else {
            return new ModelAndView("login");
        }
    }

    @RequestMapping(value = "/follow/{id}")
    public ModelAndView followUser(@PathVariable(value = "id") int id, HttpServletRequest request, HttpServletResponse response) {
        RequestHandler requestHandler = getRequestHandler(request, response);
        if (requestHandler.checkIfLoggedIn()) {
            int userId = requestHandler.getId_loggedin();
            getFollowingDao().follow(userId, id);
            UserDao userDao = getUserDao();
            List<User> listUser = userDao.list();
            ModelAndView mav = new ModelAndView();
            mav.addObject("size", listUser.size());
            mav.addObject("listUser", listUser);
            mav.setViewName("listUsers");
            return mav;
        } else {
            return new ModelAndView("login");
        }
    }

    @RequestMapping(value = "/unFollow/{id}")
    public ModelAndView unfollowUser(@PathVariable(value = "id") int id, HttpServletRequest request, HttpServletResponse response) {
        RequestHandler requestHandler = getRequestHandler(request, response);
        if (requestHandler.checkIfLoggedIn()) {
            int userId = requestHandler.getId_loggedin();
            FollowingDao followingDao = getFollowingDao();
            followingDao.unFollow(userId, id);
            UserDao userDao = getUserDao();
            List<User> listUser = new ArrayList<User>();
            List<User> users = userDao.list();
            List<Following> listFollowing = followingDao.getFollowing(userId);
            for (User user : users) {
                if (listFollowing != null) {
                    for (Following following : listFollowing) {
                        if (user.getId() == following.getFollowingId()) {
                            listUser.add(user);
                        }
                    }
                }
            }
            ModelAndView mav = new ModelAndView();
            mav.addObject("size", listUser.size());
            mav.addObject("listUser", listUser);
            mav.setViewName("listFollowing");
            return mav;
        } else {
            return new ModelAndView("login");
        }
    }

}
