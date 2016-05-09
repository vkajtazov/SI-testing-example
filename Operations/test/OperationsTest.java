/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import operations.Operations;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IvanaKajtazova
 */
public class OperationsTest {
    Operations o;
    public OperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        o=new Operations();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test (expected = NullPointerException.class)
    public void checkArray() {
        int [] a = new int [4];
       o.checkArray(null);
    }
    @Test
    public void checkArrayVistinska() {
        int [] a = new int [2];
        a[0]=1;
        a[1]=2;
        assertEquals("OK",o.checkArray(a));
    }
    @Test
    public void checkArrayFalse() {
        int [] a = new int [11];
        assertEquals("too long array",o.checkArray(a));
    }
    @Test (expected = IllegalArgumentException.class)
    public void  sum() {
        int [] a = new int [2];
        int [] b = new int [2];
        o.sum(a, null);
    }
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void  sumDolzina() {
        int [] a = new int [2];
        int [] b = new int [3];
        o.sum(a,b);
        
    }
    @Test 
    public void  suma() {
        int [] a = new int [3];
        int [] b = new int [3];
        a[0]=1;
        a[1]=1;
        a[2]=1;
        b[0]=1;
        b[1]=1;
        b[2]=1;
        assertArrayEquals(b, a);
        
    }
     @Test 
    public void  isOkArray () {
        int [] a = new int [2];
         assertTrue(o.isOkArray(a));
        
    }
    
}
