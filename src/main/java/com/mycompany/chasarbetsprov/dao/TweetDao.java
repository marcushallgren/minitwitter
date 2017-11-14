/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

/**
 *
 * @author marcus
 */

import com.mycompany.chasarbetsprov.entity.Tweet;
import java.util.Date;
import java.util.List;
import javax.sql.DataSource;

public interface TweetDao {

   public void createTweet(int id, String tweet, String timestamp);
   
   public List<Tweet> listTweets();
}