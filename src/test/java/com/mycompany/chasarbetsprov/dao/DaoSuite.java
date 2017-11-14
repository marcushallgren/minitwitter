/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author marcus
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.chasarbetsprov.dao.TweetDaoTest.class, com.mycompany.chasarbetsprov.dao.TweetDaoImplTest.class, com.mycompany.chasarbetsprov.dao.FollowingDaoTest.class, com.mycompany.chasarbetsprov.dao.UserDaoTest.class, com.mycompany.chasarbetsprov.dao.FollowingDaoImplTest.class, com.mycompany.chasarbetsprov.dao.UserDaoImplTest.class})
public class DaoSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
