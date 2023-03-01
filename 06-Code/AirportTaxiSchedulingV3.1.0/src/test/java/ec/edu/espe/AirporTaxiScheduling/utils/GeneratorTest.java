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
public class GeneratorTest {

    public GeneratorTest() {
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
           * Test of obtainIdTraveler method, of class Generator.
           */
          @Test
          public void testObtainIdTraveler() {
                    System.out.println("obtainIdTraveler");
                    String obtainId = "4 Joshua Barreno 930903903";
                    int expResult = 4;
                    int result = Generator.obtainIdTraveler(obtainId);
                    assertEquals(expResult, result);
          }

}