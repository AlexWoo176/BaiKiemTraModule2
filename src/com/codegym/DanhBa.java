package com.codegym;

import java.io.Serializable;
import java.util.Scanner;

public class DanhBa implements Serializable {
    private String soDienThoai;
    private String nhomDanhBa;
    private String hoTen;
    private String gioiTinh;
    private String diaChi;
    private String ngaySinh;
    private String email;

    public DanhBa() {
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(" SDT= %-5d" + "Nhom DanhBa = %-20s" + "Ho Ten = %-15s" + "Gioi Tinh = %-10.2f" + "Dia Chi = %-15s"+
                "Ngay Sinh = %-15s" + "Email = %-15s" , soDienThoai, nhomDanhBa, hoTen, gioiTinh, diaChi, ngaySinh, email);
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap So dien thoai: ");
        soDienThoai = sc.nextLine();
        System.out.println("Nhap nhom danh ba: ");
        nhomDanhBa = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap Email: ");
        email = sc.nextLine();
    }

    public void display() {
        System.out.println(toString());
    }
}
