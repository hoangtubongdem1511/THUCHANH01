/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

/**
 *
 * @author Redmi
 */
import java.util.Scanner;
import java.util.ArrayList;

public class lopHocPhan {
    private String maLHP, tenLHP, tenGV, thongtinLopHoc, dsSV;
    private ArrayList<lopHocPhan> hp = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
   
    public lopHocPhan() {
    }

    public lopHocPhan(String maLHP, String tenLHP, String tenGV, String thongtinLopHoc, String dsSV) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongtinLopHoc = thongtinLopHoc;
        this.dsSV = dsSV;
    }

    public String getMaLHP() {
        return maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getThongtinLopHoc() {
        return thongtinLopHoc;
    }

    public String getDsSV() {
        return dsSV;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public void setThongtinLopHoc(String thongtinLopHoc) {
        this.thongtinLopHoc = thongtinLopHoc;
    }

    public void setDsSV(String dsSV) {
        this.dsSV = dsSV;
    }

    @Override
    public String toString() {
        return "LopHocPhan{" + "maLHP=" + maLHP + ", tenLHP=" + tenLHP + ", tenGV=" + tenGV + ", thongtinLopHoc=" + thongtinLopHoc + ", dsSV=" + dsSV + ", sc=" + sc + '}';
    }
}
