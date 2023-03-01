package ec.edu.espe.AirporTaxiScheduling.model;

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
public class TarifSingletonTest {

    public TarifSingletonTest() {
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
           * Test of totalTarif method, of class TarifSingleton.
           */
          @Test
          public void testTotalTarif() {
                    System.out.println("totalTarif");
                    float kilometro = 0.0F;
                    TarifSingleton instance = null;
                    float expResult = 0.0F;
                    float result = instance.totalTarif(kilometro);
                    assertEquals(expResult, result, 0);
          }


}