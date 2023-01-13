
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Jefferson Ulco,ProgressTeam,DCCO-ESPE
 */
public class TaxiDriver {
    private String CI;
    private String name;
    private String phoneNumber;
    private String age;
    private String adress;
    private String email;
    private String gender;
    private String vehicleMark;
    private String vehiclePlate;
    private String vehicleYear;

    public TaxiDriver(String CI, String name, String phoneNumber, String age, String adress, String email, String gender, String vehicleMark, String vehiclePlate, String vehicleYear) {
        this.CI = CI;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.adress = adress;
        this.email = email;
        this.gender = gender;
        this.vehicleMark = vehicleMark;
        this.vehiclePlate = vehiclePlate;
        this.vehicleYear = vehicleYear;
    }

    /**
     * @return the CI
     */
    public String getCI() {
        return CI;
    }

    /**
     * @param CI the CI to set
     */
    public void setCI(String CI) {
        this.CI = CI;
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
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
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
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the vehicleMark
     */
    public String getVehicleMark() {
        return vehicleMark;
    }

    /**
     * @param vehicleMark the vehicleMark to set
     */
    public void setVehicleMark(String vehicleMark) {
        this.vehicleMark = vehicleMark;
    }

    /**
     * @return the vehiclePlate
     */
    public String getVehiclePlate() {
        return vehiclePlate;
    }

    /**
     * @param vehiclePlate the vehiclePlate to set
     */
    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    /**
     * @return the vehicleYear
     */
    public String getVehicleYear() {
        return vehicleYear;
    }

    /**
     * @param vehicleYear the vehicleYear to set
     */
    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

}