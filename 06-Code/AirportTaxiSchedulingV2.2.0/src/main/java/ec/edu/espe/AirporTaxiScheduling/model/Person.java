/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public abstract class Person {

    private int id;
    private String name;
    private long phoneNumber;
    private String mail;
    private float outstandingBalance;

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", mail=" + mail + ", outstandingBalance=" + outstandingBalance + '}';
    }

    public Person() {
        this.id = 0;
        this.name = "";
        this.phoneNumber = 0;
        this.mail = "";
        this.outstandingBalance = 0.0F;
    }

    public Person(int id, String name, long phoneNumber, String mail, float outstandingBalance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.outstandingBalance = outstandingBalance;
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

}
