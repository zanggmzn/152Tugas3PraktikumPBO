/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asus
 */
public class BalokTest {
    
    public BalokTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTinggi method, of class Balok.
     */
    @Test
    public void testGetTinggi() {
        System.out.println("getTinggi");
        Balok instance = null;
        int expResult = 0;
        int result = instance.getTinggi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTinggi method, of class Balok.
     */
    @Test
    public void testSetTinggi() {
        System.out.println("setTinggi");
        int tinggi = 0;
        Balok instance = null;
        instance.setTinggi(tinggi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of luasPermukaan method, of class Balok.
     */
    @Test
    public void testLuasPermukaan() {
        System.out.println("luasPermukaan");
        Balok instance = null;
        float expResult = 0.0F;
        float result = instance.luasPermukaan();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volume method, of class Balok.
     */
    @Test
    public void testVolume() {
        System.out.println("volume");
        Balok instance = null;
        float expResult = 0.0F;
        float result = instance.volume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
