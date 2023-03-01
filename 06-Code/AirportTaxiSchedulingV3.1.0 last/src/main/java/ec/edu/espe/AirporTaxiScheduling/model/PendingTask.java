package ec.edu.espe.AirporTaxiScheduling.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
abstract class PendingTask {

     protected boolean payed;
    protected float travelPrice;
    private Travel travel;
    private ArrayList subsTravelers=new ArrayList();

    public PendingTask() {
    }
    
     public void addSubsTraveler(ISubscribedTraveler iiISubscribedTraveler ){
                    subsTravelers.add(iiISubscribedTraveler);
          }

          public void deleteSubsTraveler(ISubscribedTraveler iiISubscribedTraveler) {
                   subsTravelers.remove(iiISubscribedTraveler);
          }

          public void notifySubsTraveler(Object args) {
                    Iterator i = subsTravelers.iterator();
                    while (i.hasNext()) {
                              ISubscribedTraveler subsTraveler = (ISubscribedTraveler) i.next();
                              subsTraveler.notifyUncollectedTravels(this, args);
                    }
          }
    
}
