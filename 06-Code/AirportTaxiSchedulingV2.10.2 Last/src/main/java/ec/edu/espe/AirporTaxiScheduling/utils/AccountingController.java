package ec.edu.espe.AirporTaxiScheduling.utils;

import ec.edu.espe.AirporTaxiScheduling.controller.TraveldbController;
import ec.edu.espe.AirporTaxiScheduling.model.Travel;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class AccountingController {

    public static float calculateOutstandingBalance(float outsBalance, TraveldbController dataBaseManager, String collectionName) {

        
        ArrayList<Travel> travelsView = new ArrayList<Travel>();
        TraveldbController.load(travelsView, dataBaseManager.getDatabase(), collectionName);
        for (int i = 0; i < travelsView.size(); i++) {

            if (travelsView.get(i).isPayed() == false) {
                outsBalance += (travelsView.get(i).getPrice());
            }
        }
        return outsBalance;
    }
}
