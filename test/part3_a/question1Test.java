/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3_a;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author melvi
 */
public class question1Test {
    
    public question1Test() {
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
     * Test of calculateNet method, of class question1.
     */
    @Test
    public void testCalculateNetGood() {
        System.out.println("calculateNet: Good");
        int hours = 10;
        double rate = 5;
        double tax = 1;
        question1 instance = new question1();
        double expResult = 49;
        double result = instance.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateNetBad() {
        System.out.println("calculateNet: Bad");
        int hours = 10;
        double rate = 5;
        double tax = 10;
        question1 instance = new question1();
        double expResult = 39;
        double result = instance.calculateNet(hours, rate, tax);
        assertEquals(expResult, result, 0.0);
    }
    
}
