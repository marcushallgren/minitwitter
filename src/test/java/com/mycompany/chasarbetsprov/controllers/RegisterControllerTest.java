/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.controllers;

import com.mycompany.chasarbetsprov.entity.User;
import javax.servlet.ServletContext;
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
public class RegisterControllerTest {
    
    public RegisterControllerTest() {
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
     * Test of setServletContext method, of class RegisterController.
     */
    @Test
    public void testSetServletContext() {
        System.out.println("setServletContext");
        ServletContext servletContext = null;
        RegisterController instance = new RegisterController();
        instance.setServletContext(servletContext);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class RegisterController.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        RegisterController instance = new RegisterController();
        ModelAndView expResult = null;
        ModelAndView result = instance.register();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerForm method, of class RegisterController.
     */
    @Test
    public void testRegisterForm() {
        System.out.println("registerForm");
        User formdata = null;
        RegisterController instance = new RegisterController();
        ModelAndView expResult = null;
        ModelAndView result = instance.registerForm(formdata);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
