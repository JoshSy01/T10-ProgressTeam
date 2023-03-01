
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class SubscribedTraveler implements ISubscribedTraveler{

    private String name ;
    private String email;

    public SubscribedTraveler(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    @Override
    public void notifyUncollectedTravels(PendingTask pendingTask,Object args) {
        System.out.println("notified observer " + name);
        if (args instanceof Boolean) {
                              System.out.println("the payed statud of " + " changed to: " + args);
                              System.out.println("Mail sended!");
                    } else if (args instanceof Float) {
                              System.out.println("The price of " + "changed to: " + args);
                              System.out.println("Mail sended!");

                    }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

   
      
      
}
