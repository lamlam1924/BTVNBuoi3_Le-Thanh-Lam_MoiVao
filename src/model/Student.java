
package model;


public class Student {
       
    private int idS;
    private String nameS, phoneNumberS, addressS, gioitinhS;

    public Student(int idS, String nameS, String phoneNumberS, String addressS, String gioitinhS) {
        this.idS = idS;
        this.nameS = nameS;
        this.phoneNumberS = phoneNumberS;
        this.addressS = addressS;
        this.gioitinhS = gioitinhS;
    }

    public int getIdS() {
        return idS;
    }

    public void setIdS(int idS) {
        this.idS = idS;
    }

    public String getNameS() {
        return nameS;
    }

    public void setNameS(String nameS) {
        this.nameS = nameS;
    }

    public String getPhoneNumberS() {
        return phoneNumberS;
    }

    public void setPhoneNumberS(String phoneNumberS) {
        this.phoneNumberS = phoneNumberS;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioitinhS() {
        return gioitinhS;
    }

    public void setGioitinhS(String gioitinhS) {
        this.gioitinhS = gioitinhS;
    }

    @Override
    public String toString() {
        return "Student{" + "idS=" + idS + ", nameS=" + nameS + ", phoneNumberS=" + phoneNumberS + ", addressS=" + addressS + ", gioitinhS=" + gioitinhS + '}';
    }
   
}

    