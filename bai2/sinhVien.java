/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Redmi
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class sinhVien {
    private String maSV, hoTen;
    

    public sinhVien() {
    }

    public sinhVien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "maSV=" + maSV + ", hoTen=" + hoTen + '}';
    }
    
    private ArrayList<sinhVien> svn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void in_sv(){
        for (sinhVien sinhVien : svn) {
            System.out.println(sinhVien.toString());
        }
    }
    
    public List<sinhVien> nhapthongtinsv(){
        List<sinhVien> dsSV = new ArrayList<>();
        System.out.println("Nhap thong tin cua sinh vien");
        
        while(true){
            System.out.println("Nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            
            System.out.println("Nhap ho ten sinh vien: ");
            String hoTen = sc.nextLine();
            
            if(maSV.isEmpty()||hoTen.isEmpty()){
                System.out.println("Nhap thanh cong");
                break;
            }
            sinhVien sv = new sinhVien(maSV, hoTen);
        }
        return dsSV;
    }
    
    public int getSoLuongSV(){
        return svn.size();
    }
}
