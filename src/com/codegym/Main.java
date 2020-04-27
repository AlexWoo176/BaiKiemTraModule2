package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyDanhBa quanLyDanhBa = new QuanLyDanhBa();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        do {
            showMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    quanLyDanhBa.showDanhBa();
                    break;
                case 2:
                    quanLyDanhBa.inputDanhBa();
                    break;
                case 3:
                    quanLyDanhBa.updateDanhBa();
                    break;
                case 4:
                    quanLyDanhBa.deleteSDT();
                    break;
                case 5:
                    System.out.println("Nhap so dien thoai can tim kiem:");
                    String sdt = sc.nextLine();
                    System.out.println("Nhap Ho Ten can tim kiem:");
                    String hoten = sc.nextLine();
                    String choice1 = sc.nextLine();
                    switch (choice1) {
                        case "a":
                            quanLyDanhBa.searchBySDT(sdt);
                            break;
                        case "b":
                            quanLyDanhBa.searchByHoTen(hoten);
                            break;
                    }
                    break;
                case 6:
                    quanLyDanhBa.readByFile();
                    break;
                case 7:
                    quanLyDanhBa.saveByFile();
                    break;
                case 0:
                    System.out.println("Exit thanh cong");
                    break;
                default:
                    System.err.println("Nhap sai roi");
                    break;
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("1:Xem Danh sach");
        System.out.println("2:Them moi");
        System.out.println("3:Cap Nhat");
        System.out.println("4:Xoa");
        System.out.println("5:Tim Kiem");
        System.out.println("6:Doc Tu File:");
        System.out.println("7:Ghi vao File");
        System.out.println("0:Thoat");
        System.out.println("Choose:");
    }
}
