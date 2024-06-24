
package test;

import model.GiaoVien;
import model.MonHoc;
import model.Student;

public class Main {
    public static void main(String[] args) {
        
   GiaoVien coDayToan = new GiaoVien(123, "Nguyen Thi A", "01253", "Xuan Thieu");
   Student banHocA = new Student(19, "Le Thanh Lam", "0777", "Lien Chieu", "Nu");  
   MonHoc java = new MonHoc(10, "Tin Hoc");
   
    System.out.println("Truoc khi doi ten giao vien: "+coDayToan.getNameGV());
    coDayToan.setNameGV("Emma");
        System.out.println("Sau khi doi ten giao vien: "+coDayToan.getNameGV());
        
        System.out.println("Truoc khi doi so dien thoai cua hoc sinh: "+banHocA.getPhoneNumberS());
        banHocA.setPhoneNumberS("0987");
        System.out.println("Sau khi doi so dien thoai cua hoc sinh: "+banHocA.getPhoneNumberS());
        
        System.out.println("Truoc khi doi ma so mon hoc: "+java.getIdMonHoc());
        java.setIdMonHoc(21);
        System.out.println("Sau khi doi ma so mon hoc: "+java.getIdMonHoc());
        
        System.out.println("In thong tin giao vien: "+coDayToan.getIdGV()+" : "+coDayToan.getNameGV());
        System.out.println("In thong tin hoc sinh: "+banHocA.getIdS()+" : "+banHocA.getNameS()+" / "+banHocA.getGioitinhS());
        System.out.println("In thong tin mon hoc: "+java.getIdMonHoc()+" : "+java.getTenMonHoc());
        
    }
    
}
