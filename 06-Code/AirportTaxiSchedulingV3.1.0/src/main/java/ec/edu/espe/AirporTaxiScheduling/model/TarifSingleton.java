package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TarifSingleton {
private static TarifSingleton instance;
    private float tarifValue;
    private TarifSingleton(){    
        this.tarifValue = 0.40F;
    }
    
    public void modifyValue(float tarifValue){
        this.tarifValue = tarifValue;
    }
    
    public static TarifSingleton getInstance() {
        if(instance == null){ 
            instance = new TarifSingleton();
        }
        return instance;
    }
    
    public float totalTarif(float kilometro) {
        float tarif = kilometro * this.tarifValue;
        return tarif;
    }

    public float getTarifValue() {
        return tarifValue;
    }
}

