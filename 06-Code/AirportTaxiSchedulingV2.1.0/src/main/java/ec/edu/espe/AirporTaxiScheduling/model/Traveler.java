package ec.edu.espe.AirporTaxiScheduling.model;

import java.util.Date;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Traveler {
    private int id;
    private String name;
    private long phoneNumber;
    private String mail;
    private float outstandingBalance;
    private int birthdayDay;
    private int birthdayMonth;
    private int year;

    public Traveler(int id, String name, long phoneNumber, String mail, float outstandingBalance, int birthdayDay, int birthdayMonth, int year) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.outstandingBalance = outstandingBalance;
        this.birthdayDay = birthdayDay;
        this.birthdayMonth = birthdayMonth;
        this.year = year;
    }


    
    public Traveler() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.mail = "";
        this.outstandingBalance = 0.0F;
        this.birthdayDay = 1;
        this.birthdayMonth = 1;
        this.year = 1900;
    }



    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the outstandingBalance
     */
    public float getOutstandingBalance() {
        return outstandingBalance;
    }

    /**
     * @param outstandingBalance the outstandingBalance to set
     */
    public void setOutstandingBalance(float outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    /**
     * @return the birthdayDay
     */
    public int getBirthdayDay() {
        return birthdayDay;
    }

    /**
     * @param birthdayDay the birthdayDay to set
     */
    public void setBirthdayDay(int birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    /**
     * @return the birthdayMonth
     */
    public int getBirthdayMonth() {
        return birthdayMonth;
    }

    /**
     * @param birthdayMonth the birthdayMonth to set
     */
    public void setBirthdayMonth(int birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
}
