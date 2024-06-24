
package model;


public class GiaoVien {
    private int idGV;
    private String nameGV, phoneNumberGV, addressGV;

    public GiaoVien(int idGV, String nameGV, String phoneNumberGV, String addressGV) {
        this.idGV = idGV;
        this.nameGV = nameGV;
        this.phoneNumberGV = phoneNumberGV;
        this.addressGV = addressGV;
    }

    public int getIdGV() {
        return idGV;
    }

    public void setIdGV(int idGV) {
        this.idGV = idGV;
    }

    public String getNameGV() {
        return nameGV;
    }

    public void setNameGV(String nameGV) {
        this.nameGV = nameGV;
    }

    public String getPhoneNumberGV() {
        return phoneNumberGV;
    }

    public void setPhoneNumberGV(String phoneNumberGV) {
        this.phoneNumberGV = phoneNumberGV;
    }

    public String getAddressGV() {
        return addressGV;
    }

    public void setAddressGV(String addressGV) {
        this.addressGV = addressGV;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "idGV=" + idGV + ", nameGV=" + nameGV + ", phoneNumberGV=" + phoneNumberGV + ", addressGV=" + addressGV + '}';
    }
    
    
}


    