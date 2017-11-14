/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.servletutils;

import com.mycompany.chasarbetsprov.entity.User;
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
public class RequestHandlerTest {
    
    public RequestHandlerTest() {
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
     * Test of checkIfLoggedIn method, of class RequestHandler.
     */
    @Test
    public void testCheckIfLoggedIn() {
        System.out.println("checkIfLoggedIn");
        RequestHandler instance = null;
        boolean expResult = false;
        boolean result = instance.checkIfLoggedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class RequestHandler.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        User user = null;
        RequestHandler instance = null;
        instance.login(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class RequestHandler.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        RequestHandler instance = null;
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_loggedin method, of class RequestHandler.
     */
    @Test
    public void testGetId_loggedin() {
        System.out.println("getId_loggedin");
        RequestHandler instance = null;
        int expResult = 0;
        int result = instance.getId_loggedin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName_loggedin method, of class RequestHandler.
     */
    @Test
    public void testGetName_loggedin() {
        System.out.println("getName_loggedin");
        RequestHandler instance = null;
        String expResult = "";
        String result = instance.getName_loggedin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
