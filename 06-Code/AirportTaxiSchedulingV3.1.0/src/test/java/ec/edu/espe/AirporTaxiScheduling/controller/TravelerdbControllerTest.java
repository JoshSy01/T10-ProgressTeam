package ec.edu.espe.AirporTaxiScheduling.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.AirporTaxiScheduling.model.Traveler;
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
public class TravelerdbControllerTest {

    public TravelerdbControllerTest() {
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
           * Test of findDocumentdb method, of class TravelerdbController.
           */
          @Test
          public void testFindDocumentdb() {
                    System.out.println("findDocumentdb");
                    Traveler traveler = new Traveler();
                    int idFinder = 6;
                    Traveler expResult = new Traveler(6, "Leonardo Yaranga", 995667373, "leonardo.yaranga@hotmail.com", 50, 17, 11, 2003);
                    Traveler result = TravelerdbController.findDocumentdb(traveler, idFinder);
                    assertEquals(expResult, result);
          }

}