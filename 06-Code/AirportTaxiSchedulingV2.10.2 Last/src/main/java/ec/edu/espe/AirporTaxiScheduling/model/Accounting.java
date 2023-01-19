/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class Accounting extends Service{
    private float totalValue;
   private float outstandingBalance;
  private TravelerPayment travelerPayment;
  
    public Accounting() {
        this.totalValue = 0.0F;
        this.outstandingBalance = 0;
        this.travelerPayment = null;
    }

    public Accounting(float totalValue, float outstandingBalance, TravelerPayment travelerPayment) {
        this.totalValue = totalValue;
        this.outstandingBalance = outstandingBalance;
        this.travelerPayment = travelerPayment;
    }

    
    /**
     * @return the totalValue
     */
    public float getTotalValue() {
        return totalValue;
    }

    /**
     * @param totalValue the totalValue to set
     */
    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
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
     * @return the travelerPayment
     */
    public TravelerPayment getTravelerPayment() {
        return travelerPayment;
    }

    /**
     * @param travelerPayment the travelerPayment to set
     */
    public void setTravelerPayment(TravelerPayment travelerPayment) {
        this.travelerPayment = travelerPayment;
    }
    
 
    
   
   
}
