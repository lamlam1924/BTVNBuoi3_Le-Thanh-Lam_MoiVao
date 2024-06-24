
package model;


public class MonHoc {
    private int idMonHoc;
    private String tenMonHoc;

    public MonHoc(int idMonHoc, String tenMonHoc) {
        this.idMonHoc = idMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public int getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(int idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "idMonHoc=" + idMonHoc + ", tenMonHoc=" + tenMonHoc + '}';
    }
    
    
}
