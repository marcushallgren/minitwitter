/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

import com.mycompany.chasarbetsprov.entity.Following;
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
public class FollowingDaoImplTest {
    
    public FollowingDaoImplTest() {
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
     * Test of getFollowing method, of class FollowingDaoImpl.
     */
    @Test
    public void testGetFollowing() {
        System.out.println("getFollowing");
        int userId = 0;
        FollowingDaoImpl instance = null;
        List<Following> expResult = null;
        List<Following> result = instance.getFollowing(userId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of follow method, of class FollowingDaoImpl.
     */
    @Test
    public void testFollow() {
        System.out.println("follow");
        int userId = 0;
        int followingId = 0;
        FollowingDaoImpl instance = null;
        instance.follow(userId, followingId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unFollow method, of class FollowingDaoImpl.
     */
    @Test
    public void testUnFollow() {
        System.out.println("unFollow");
        int userId = 0;
        int id = 0;
        FollowingDaoImpl instance = null;
        instance.unFollow(userId, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
