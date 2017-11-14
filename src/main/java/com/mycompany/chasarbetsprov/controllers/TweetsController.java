package com.mycompany.chasarbetsprov.controllers;

import com.mycompany.chasarbetsprov.beans.MvcConfiguration;
import com.mycompany.chasarbetsprov.entity.Following;
import com.mycompany.chasarbetsprov.entity.Tweet;
import com.mycompany.chasarbetsprov.entity.User;
import com.mycompany.chasarbetsprov.servletutils.RequestHandler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author marcus
 */
public class TweetsController extends MvcConfiguration {

    @RequestMapping(value = "/listTweets")
    public ModelAndView listTweets(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelView = new ModelAndView();
        RequestHandler requestHandler = getRequestHandler(request, response);
        if (requestHandler.checkIfLoggedIn()) {
            int userId = requestHandler.getId_loggedin();
            List<Tweet> listTweet = getTweetsDao().listTweets();
            listTweet.size();
            List<Following> followingIds = getFollowingDao().getFollowing(userId);
            List<Tweet> tweets = new ArrayList<Tweet>();
            
            //Adding tweets to "tweets" list if they match following ID's
            for (Following followingId : followingIds) {
                for (Tweet tweet : listTweet) {
                    if (tweet.getUserId() == followingId.getFollowingId()) {
                        tweets.add(tweet);
                    }
                }
            }
            for (Tweet tweet : listTweet) {
                if (tweet.getUserId() == userId) {
                    tweets.add(tweet);
                }
            }

            //Sort the list of tweets by timestamp
            tweets.sort(Comparator.comparing(Tweet::getTimeStamp).reversed());
            modelView.addObject("size", tweets.size());
            modelView.addObject("listTweet", tweets);
            modelView.setViewName("listTweets");
        } else {
            modelView.setViewName("login");
        }
        return modelView;
    }

    @RequestMapping(value = "/statusUpdate")
    public ModelAndView statusUpdate(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelView = new ModelAndView();
        RequestHandler requestHandler = getRequestHandler(request, response);
        if (requestHandler.checkIfLoggedIn()) {
            modelView.setViewName("statusUpdate");
        } else {
            modelView.setViewName("login");
        }
        return modelView;
    }

    @RequestMapping(value = "/tweet")
    public ModelAndView tweet(@ModelAttribute("loginFormData") Tweet formdata, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelView = new ModelAndView();
        if (formdata.getTweet().length() > 160) {
            String errorMessage = "You have exceeded the maximum amount of characters per tweet (160)";
            modelView.addObject("userMessage", errorMessage);
            modelView.setViewName("error");
            return modelView;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeStamp = sdf.format(new Date());
            getTweetsDao().createTweet(Integer.parseInt(request.getSession().getAttribute("login").toString()), formdata.getTweet(), timeStamp);
            modelView.setViewName("statusUpdate");
            return modelView;
        }

    }

}
