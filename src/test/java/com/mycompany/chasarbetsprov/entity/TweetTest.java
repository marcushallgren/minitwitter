/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.entity;

import java.text.SimpleDateFormat;
import java.util.Date;
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
public class TweetTest {
    
    public TweetTest() {
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
     * Test of getTimeStamp method, of class Tweet.
     */
    @Test
    public void testGetTimeStamp() {
        Tweet instance = new Tweet();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = sdf.format(new Date());
        instance.setTimeStamp(timeStamp);
        String expResult = timeStamp;
        String result = instance.getTimeStamp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTimeStamp method, of class Tweet.
     */
    @Test
    public void testSetTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = sdf.format(new Date());
        String expResult = timeStamp;
        Tweet instance = new Tweet();
        instance.setTimeStamp(timeStamp);
        assertEquals(expResult, instance.getTimeStamp());
    }

    /**
     * Test of setUserId method, of class Tweet.
     */
    @Test
    public void testSetUserId() {
        int userId = 1;
        Tweet instance = new Tweet();
        instance.setUserId(userId);
        assertEquals(1, instance.getUserId());
    }

    /**
     * Test of getUserId method, of class Tweet.
     */
    @Test
    public void testGetUserId() {
        Tweet instance = new Tweet();
        int expResult = 1;
        instance.setUserId(1);
        int result = instance.getUserId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTweet method, of class Tweet.
     */
    @Test
    public void testSetTweet() {
        String message = "testmessage";
        Tweet instance = new Tweet();
        instance.setTweet(message);
        assertEquals(message, instance.getTweet());
    }

    /**
     * Test of getTweet method, of class Tweet.
     */
    @Test
    public void testGetTweet() {
        Tweet instance = new Tweet();
        String expResult = "testmessage";
        instance.setTweet(expResult);
        String result = instance.getTweet();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Tweet.
     */
    @Test
    public void testSetId() {
        int id = 1;
        Tweet instance = new Tweet();
        instance.setId(id);
        int result = instance.getId();
        assertEquals(1, result);
    }

    /**
     * Test of getId method, of class Tweet.
     */
    @Test
    public void testGetId() {
        Tweet instance = new Tweet();
        Integer expResult = 1;
        instance.setId(1);
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }
    
}
