/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Redmi
 */
public class main {
    public static void main(String[]agrs){
        lopHocPhan lhp = new lopHocPhan();
        Scanner sc = new Scanner(System.in);

        ArrayList<sinhVien> sv = new ArrayList<>();

        System.out.println("Nhap ma lop:");
        String maLHP = sc.nextLine();

        System.out.println("Nhap ten lop hoc:");
        String tenLHP = sc.nextLine();

        System.out.println("Nhap ten giao vien:");
        String tenGV = sc.nextLine();

        System.out.println("Nhap thong tin buoi hoc:");
        String thongTinLopHoc = sc.nextLine();

        System.out.println("maLH"+ maLHP);
        System.out.println("ten lop:"+ tenLHP);
        System.out.println("ten giao vien "+ tenGV);
        System.out.println("thong tin buoi hoc "+thongTinLopHoc);
        System.out.println("danh sach sinh vien");
      
    }  
}
