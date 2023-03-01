
package ec.edu.espe.AirporTaxiScheduling.controller;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AccountingControllerTest {
    
    public AccountingControllerTest() {
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
     * Test of calculateLostPercent method, of class AccountingController.
     */
    @Test
    public void testCalculateLostPercent() {
        System.out.println("calculateLostPercent");
        float payedValues = 0.0F;
        float outsValues = 0.0F;
        float expResult = 0.0F;
        float result = AccountingController.calculateLostPercent(payedValues, outsValues);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTotal method, of class AccountingController.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        ArrayList<Float> values = null;
        float expResult = 0.0F;
        float result = AccountingController.calculateTotal(values);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
