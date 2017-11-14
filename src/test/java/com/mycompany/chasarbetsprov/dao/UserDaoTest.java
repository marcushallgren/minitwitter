/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

import com.mycompany.chasarbetsprov.entity.User;
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
public class UserDaoTest {
    
    public UserDaoTest() {
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
     * Test of createUser method, of class UserDao.
     */
    @Test
    public void testCreateUser() {
        System.out.println("createUser");
        User user = null;
        UserDao instance = new UserDaoImpl();
        instance.createUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class UserDao.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        User user = null;
        UserDao instance = new UserDaoImpl();
        User expResult = null;
        User result = instance.get(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class UserDao.
     */
    @Test
    public void testList() {
        System.out.println("list");
        UserDao instance = new UserDaoImpl();
        List<User> expResult = null;
        List<User> result = instance.list();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class UserDaoImpl implements UserDao {

        public void createUser(User user) {
        }

        public User get(User user) {
            return null;
        }

        public List<User> list() {
            return null;
        }
    }
    
}
