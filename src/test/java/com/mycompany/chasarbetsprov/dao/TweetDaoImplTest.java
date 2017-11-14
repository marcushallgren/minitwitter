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
public class TweetDaoImplTest {
    
    public TweetDaoImplTest() {
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
     * Test of createTweet method, of class TweetDaoImpl.
     */
    @Test
    public void testCreateTweet() {
        System.out.println("createTweet");
        int userId = 0;
        String message = "";
        String timestamp = "";
        TweetDaoImpl instance = null;
        instance.createTweet(userId, message, timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listTweets method, of class TweetDaoImpl.
     */
    @Test
    public void testListTweets() {
        System.out.println("listTweets");
        TweetDaoImpl instance = null;
        List<Tweet> expResult = null;
        List<Tweet> result = instance.listTweets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
