
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public interface ISubscribedTraveler {
    void notifyUncollectedTravels(PendingTask pendingTask,Object args);
}
