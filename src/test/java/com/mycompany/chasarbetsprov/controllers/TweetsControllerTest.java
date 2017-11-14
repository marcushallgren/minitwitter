/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.controllers;

import com.mycompany.chasarbetsprov.entity.Tweet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author marcus
 */
public class TweetsControllerTest {
    
    public TweetsControllerTest() {
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
     * Test of listTweets method, of class TweetsController.
     */
    @Test
    public void testListTweets() {
        System.out.println("listTweets");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        TweetsController instance = new TweetsController();
        ModelAndView expResult = null;
        ModelAndView result = instance.listTweets(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of statusUpdate method, of class TweetsController.
     */
    @Test
    public void testStatusUpdate() {
        System.out.println("statusUpdate");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        TweetsController instance = new TweetsController();
        ModelAndView expResult = null;
        ModelAndView result = instance.statusUpdate(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tweet method, of class TweetsController.
     */
    @Test
    public void testTweet() {
        System.out.println("tweet");
        Tweet formdata = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        TweetsController instance = new TweetsController();
        ModelAndView expResult = null;
        ModelAndView result = instance.tweet(formdata, request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
