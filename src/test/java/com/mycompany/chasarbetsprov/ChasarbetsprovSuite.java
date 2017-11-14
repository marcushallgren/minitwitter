/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasarbetsprov;

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
@Suite.SuiteClasses({com.mycompany.chasarbetsprov.dao.DaoSuite.class, com.mycompany.chasarbetsprov.beans.BeansSuite.class, com.mycompany.chasarbetsprov.servletutils.ServletutilsSuite.class, com.mycompany.chasarbetsprov.controllers.ControllersSuite.class, com.mycompany.chasarbetsprov.entity.EntitySuite.class, com.mycompany.chasarbetsprov.mappers.MappersSuite.class})
public class ChasarbetsprovSuite {

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
