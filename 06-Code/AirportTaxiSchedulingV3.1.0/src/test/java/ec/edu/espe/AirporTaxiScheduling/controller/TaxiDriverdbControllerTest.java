package ec.edu.espe.AirporTaxiScheduling.controller;

import com.mongodb.client.MongoDatabase;
import ec.edu.espe.AirporTaxiScheduling.model.TaxiDriver;
import java.util.ArrayList;
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
public class TaxiDriverdbControllerTest {

    public TaxiDriverdbControllerTest() {
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
           * Test of findDriver method, of class TaxiDriverdbController.
           */
          @Test
          public void testFindDriver() {
                    System.out.println("findDriver");
                    TaxiDriver driver = null;
                    TaxiDriver expResult = null;
                    TaxiDriver result = TaxiDriverdbController.findDriver(driver);
                    assertEquals(expResult, result);

          }



}