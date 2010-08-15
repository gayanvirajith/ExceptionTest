/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.execeptiontest;

import com.execeptiontest.exception.UnableToConvertStringToIntException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maheshi
 */
public class AppTest {

    public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() {
        System.out.println("-- main");
        String[] args = null;
        App.main(args);
    }

    @Test
    public void testCalcDivisionByZero() {
        try {
            App.calc(0);
        } catch (ArithmeticException success) {
            assertNotNull(success.getMessage());
        }
    }

    /**
     * when your method is throwing this one is ok
     */
    /*
    @Test(expected=ArithmeticException.class)
    public void testCalcDivideByZero() {
    App.calc(0);
    }
     */
    @Test
    public void testCalc() {
        App.calc(1);

    }

    @Test
    public void testConvertStringToInt() {
        App.convertStringToInt("12");
    }

    @Test
    public void testConvertStringToIntWithNull() {
        try {
            App.convertStringToInt(null);
        } catch (NumberFormatException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testConvertStringToIntReturnWithEmpty() {
        try {
            App.convertStringToIntReturn("");
        } catch (UnableToConvertStringToIntException ex) {
            assertNotNull(ex);
        }
    }


    @Test
    public void testConvertStringToIntReturnWithNull() {
        try {
            App.convertStringToIntReturn(null);
        } catch (UnableToConvertStringToIntException ex) {
            assertNotNull(ex);
        }
    }

    @Test
    public void testConvertStringToIntReturn() {
        try {
            int expect = App.convertStringToIntReturn("12");
            assertEquals(expect, 12);
        } catch (UnableToConvertStringToIntException ex) {
            assertNotNull(ex);
        }
    }

    @Test
    public void testApp() {
        App a = new App();
        assertNotNull(a);
    }

}
