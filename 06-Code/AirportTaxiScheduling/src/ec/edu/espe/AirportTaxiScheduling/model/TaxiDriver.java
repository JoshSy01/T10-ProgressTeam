/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirportTaxiScheduling.model;

/**
 *
 * @author ProgressTeam,DCCO-ESPE
 */
public class TaxiDriver {
    private String Drivername;
    private String plateNumber;
    private long  phoneNumber;
    private String email;
    private DataBase dataBase;
    
    public TaxiDriver() {
        this.Drivername = "";
        this.plateNumber = "";
        this.phoneNumber = 0;
        this.email = "";
        this.dataBase = dataBase;
    }
    
    public TaxiDriver(String Drivername, String plateNumber, long phoneNumber, String email) {
        this.Drivername = Drivername;
        this.plateNumber = plateNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dataBase = dataBase;
    }

    /**
     * @return the Drivername
     */
    public String getDrivername() {
        return Drivername;
    }

    /**
     * @param Drivername the Drivername to set
     */
    public void setDrivername(String Drivername) {
        this.Drivername = Drivername;
    }

    /**
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * @return the phoneNumber
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
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
    /**
     * @return the database
     */
    public DataBase getDatabase() {
        return dataBase;
    }

    /**
     * @param dataBase the database to set
     */
    public void setDatabase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    
}
