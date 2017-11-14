/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.entity;

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
public class FollowingTest {
    
    public FollowingTest() {
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
     * Test of getId method, of class Following.
     */
    @Test
    public void testGetId() {
        Following instance = new Following();
        instance.setId(1);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Following.
     */
    @Test
    public void testSetId() {
        int id = 1;
        Following instance = new Following();
        instance.setId(id);
        assertEquals(1, instance.getId());
    }

    /**
     * Test of getUserId method, of class Following.
     */
    @Test
    public void testGetUserId() {
        Following instance = new Following();
        instance.setUserId(1);
        int expResult = 1;
        int result = instance.getUserId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUserId method, of class Following.
     */
    @Test
    public void testSetUserId() {
        int user_id = 1;
        Following instance = new Following();
        instance.setUserId(user_id);
        assertEquals(1, instance.getUserId());
    }

    /**
     * Test of getFollowingId method, of class Following.
     */
    @Test
    public void testGetFollowingId() {
        Following instance = new Following();
        int expResult = 1;
        instance.setFollowingId(1);
        int result = instance.getFollowingId();
        assertEquals(1, result);
    }

    /**
     * Test of setFollowingId method, of class Following.
     */
    @Test
    public void testSetFollowingId() {
        int following_id = 1;
        Following instance = new Following();
        instance.setFollowingId(following_id);
        assertEquals(1, instance.getFollowingId()
        );
    }
    
}
