
package ec.edu.espe.AirporTaxiScheduling.model;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class User {
        private String fullName;
        private String mail;
        private Long phonenumber;
   private String userName;
   private String password;

    @Override
    public String toString() {
        return "User{" + "fullName=" + getFullName() + ", mail=" + getMail() + ", phonenumber=" + getPhonenumber() + ", userName=" + getUserName() + ", password=" + getPassword() + '}';
    }

  
 
    public User(String fullName, String mail, Long phonenumber, String userName, String password) {
        this.fullName = fullName;
        this.mail = mail;
        this.phonenumber = phonenumber;
        this.userName = userName;
        this.password = password;
    }

    

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the phonenumber
     */
    public Long getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

 
  
   
    
}
