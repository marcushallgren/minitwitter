/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.controllers;

import com.mycompany.chasarbetsprov.entity.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author marcus
 */
public class LoginControllerTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    private MockHttpServletResponse response;

    public LoginControllerTest() {
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
     * Test of login method, of class LoginController.
     */
    @Test
    public void testLogin() {
        LoginController instance = new LoginController();
        String expResult = "login";
        ModelAndView result = instance.login();
        assertEquals(expResult, result.getViewName());
        assertNotNull(result.getModel());
    }

    /**
     * Test of login_form method, of class LoginController.
     */
    @Test
    public void testLogin_form() {
        User formdata = null;
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        LoginController instance = new LoginController();
        instance.login_form(formdata, request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of home method, of class LoginController.
     */
    @Test
    public void testHome() {
        HttpServletRequest mockedRequest = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse mockedResponse = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        when( mockedRequest.getParameter("id_loggedin") ).thenReturn("1");
        when( mockedRequest.getParameter("name_loggedin") ).thenReturn("test");
        LoginController instance = new LoginController();
        String expResult = "homepage";
        ModelAndView result = instance.home(mockedRequest, mockedResponse);
        assertEquals(expResult, result.getViewName());
        assertNotNull(result.getModel());
    }

    /**
     * Test of logout method, of class LoginController.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        LoginController instance = new LoginController();
        ModelAndView expResult = null;
        ModelAndView result = instance.logout(request, response);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
