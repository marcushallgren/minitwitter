/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.beans;

import com.mycompany.chasarbetsprov.dao.FollowingDao;
import com.mycompany.chasarbetsprov.dao.FollowingDaoImpl;
import com.mycompany.chasarbetsprov.dao.TweetDao;
import com.mycompany.chasarbetsprov.dao.TweetDaoImpl;
import com.mycompany.chasarbetsprov.dao.UserDao;
import com.mycompany.chasarbetsprov.dao.UserDaoImpl;
import com.mycompany.chasarbetsprov.servletutils.RequestHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.HandlerAdapter;

/**
 *
 * @author marcus
 */
public class MvcConfigurationTest {

    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    public MvcConfigurationTest() {
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
     * Test of getRequestHandler method, of class MvcConfiguration.
     */
    @Test
    public void testGetRequestHandler() {
        System.out.println("getRequestHandler");
        MvcConfiguration instance = new MvcConfiguration();
        RequestHandler expResult = new RequestHandler(request, response);
        RequestHandler result = instance.getRequestHandler(request, response);
        assertSame(RequestHandler.class, result.getClass());
    }

    /**
     * Test of getDataSource method, of class MvcConfiguration.
     */
    @Test
    public void testGetDataSource() {
        System.out.println("getDataSource");
        MvcConfiguration instance = new MvcConfiguration();
        DataSource result = instance.getDataSource();
        assertEquals(org.springframework.jdbc.datasource.DriverManagerDataSource.class, result.getClass());
    }

    /**
     * Test of getUserDao method, of class MvcConfiguration.
     */
    @Test
    public void testGetUserDao() {
        System.out.println("getUserDao");
        MvcConfiguration instance = new MvcConfiguration();
        UserDao result = instance.getUserDao();
        assertEquals(UserDaoImpl.class, result.getClass());
    }

    /**
     * Test of getTweetsDao method, of class MvcConfiguration.
     */
    @Test
    public void testGetTweetsDao() {
        System.out.println("getTweetsDao");
        MvcConfiguration instance = new MvcConfiguration();
        TweetDao result = instance.getTweetsDao();
        assertEquals(TweetDaoImpl.class, result.getClass());
    }

    /**
     * Test of getFollowingDao method, of class MvcConfiguration.
     */
    @Test
    public void testGetFollowingDao() {
        System.out.println("getFollowingDao");
        MvcConfiguration instance = new MvcConfiguration();
        FollowingDao result = instance.getFollowingDao();
        assertEquals(FollowingDaoImpl.class, result.getClass());
    }

}
