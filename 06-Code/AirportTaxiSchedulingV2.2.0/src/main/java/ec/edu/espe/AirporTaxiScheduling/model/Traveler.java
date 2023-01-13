package ec.edu.espe.AirporTaxiScheduling.model;

import java.util.Date;

/**
 *
 * @author Justin Villarroel, ProgressTeam, DCCO-ESPE
 */
public class Traveler extends Person {

    private int birthdayDay;
    private int birthdayMonth;
    private int year;

    @Override
    public String toString() {
        return "Traveler{" + super.toString() + "birthdayDay=" + birthdayDay + ", birthdayMonth=" + birthdayMonth + ", year=" + year + '}';
    }

    public Traveler(int birthdayDay, int birthdayMonth, int year, int id, String name, long phoneNumber, String mail, float outstandingBalance) {
        super(id, name, phoneNumber, mail, outstandingBalance);
        this.birthdayDay = birthdayDay;
        this.birthdayMonth = birthdayMonth;
        this.year = year;

    }

    public Traveler() {
        super(0, "", 0, "", 0.0F);
        this.birthdayDay = 1;
        this.birthdayMonth = 1;
        this.year = 1900;
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
