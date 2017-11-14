/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

import com.mycompany.chasarbetsprov.entity.Tweet;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcus
 */
public class TweetDaoTest {
    
    public TweetDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createTweet method, of class TweetDao.
     */
    @Test
    public void testCreateTweet() {
        System.out.println("createTweet");
        int id = 0;
        String tweet = "";
        String timestamp = "";
        TweetDao instance = new TweetDaoImpl();
        instance.createTweet(id, tweet, timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTweets method, of class TweetDao.
     */
    @Test
    public void testListTweets() {
        System.out.println("listTweets");
        TweetDao instance = new TweetDaoImpl();
        List<Tweet> expResult = null;
        List<Tweet> result = instance.listTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TweetDaoImpl implements TweetDao {

        public void createTweet(int id, String tweet, String timestamp) {
        }

        public List<Tweet> listTweets() {
            return null;
        }
    }
    
}
