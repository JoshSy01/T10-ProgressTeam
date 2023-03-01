package ec.edu.espe.AirporTaxiScheduling.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class ValidationTest {

    public ValidationTest() {
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
           * Test of IdValidation method, of class Validation.
           */
          @Test
          public void testIdValidation() {
                    System.out.println("IdValidation");
                    String IdValidator = "";
                    boolean expResult = true;
                    boolean result = Validation.IdValidation(IdValidator);
                    assertEquals(expResult, result);
          }

}