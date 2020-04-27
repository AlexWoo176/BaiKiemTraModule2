package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDanhBa {
    private static Scanner sc = new Scanner(System.in);
    List<DanhBa> danhBaList;

    public QuanLyDanhBa() {
        danhBaList = new ArrayList<>();
    }

    public void inputDanhBa() {
        while (true) {
            DanhBa danhBa = new DanhBa();
            danhBa.inputData();
            danhBaList.add(danhBa);
            System.out.println("Ban co muon them Danh Ba khong?: ");
            System.out.println("1. Y");
            System.out.println("2. N");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("N"))
                break;
        }
    }
    public void showDanhBa() {
        if (danhBaList.isEmpty()) {
            System.out.println("Chua co du lieu");
        } else {
            for (DanhBa db : danhBaList) {
                db.display();
            }
        }
    }

    public void updateDanhBa() {
        System.out.println("Nhap so dien thoai can Update: ");
        String sdtDanhba = sc.nextLine();
        DanhBa db = null;

        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getSoDienThoai().equalsIgnoreCase(sdtDanhba)) {
                db = danhBa;
                break;
            }
        }
        if (db != null) {
            System.out.println("Update Nhom Danh Ba: ");
            db.setNhomDanhBa(sc.nextLine());
            System.out.println("Update Ho ten: ");
            db.setHoTen(sc.nextLine());
            System.out.println("Update Gioi Tinh: ");
            db.setGioiTinh(sc.nextLine());
            System.out.println("Update Dia Chi: ");
            db.setDiaChi(sc.nextLine());
            System.out.println("Update Ngay Sinh: ");
            db.setNgaySinh(sc.nextLine());
            System.out.println("Update Email: ");
            db.setEmail(sc.nextLine());
        } else {
            System.out.println("Khong ton tai so dien thoai: " + sdtDanhba);
        }
    }

    public void deleteSDT() {
        System.out.println("Nhap so dien thoai can xoa: ");
        String sdt = sc.nextLine();
        DanhBa db = null;
        for (DanhBa danhBa : danhBaList) {
            if (danhBa.getSoDienThoai().equalsIgnoreCase(sdt)) {
                db = danhBa;
                break;
            }
        }
        if (db !=null) {
            danhBaList.remove(danhBaList.remove(db));
            System.out.println("Xoa thanh cong so dien thoai: " + sdt);
            System.out.println("Danh sach Danh Ba sau khi xoa: ");
            showDanhBa();
        } else {
            System.out.println("Khong ton tai So Dien Thoai nay");
        }
    }

//    public void findSDT() {
//        System.out.println("Nhap so dien thoai can tim kiem: ");
//        String sdt = sc.nextLine();
//        DanhBa db = null;
//        for (DanhBa danhBa : danhBaList) {
//            if (danhBa.getSoDienThoai().equalsIgnoreCase(sdt)) {
//                db = danhBa;
//                break;
//            }
//        }
//        if (db !=null) {
//            System.out.println("So dien thoai can tim kiem: " + sdt);
//            System.out.println("Danh sach Danh Ba sau khi xoa: ");
//            showDanhBa();
//        } else {
//            System.out.println("Khong ton tai So Dien Thoai nay");
//        }
//    }

    public void searchBySDT(String soDienThoai) {
        for (int i = 0; i < danhBaList.size(); i++) {
            DanhBa danhBa = (DanhBa) danhBaList.get(i);
            if (danhBa.getSoDienThoai() == soDienThoai) {
                danhBa.display();
            }
        }
    }

    public void searchByHoTen(String hoTen) {
        for (int i = 0; i < danhBaList.size(); i++) {
            DanhBa danhBa = (DanhBa) danhBaList.get(i);
            if (danhBa.getHoTen() == hoTen) {
                danhBa.display();
            }
        }
    }

    public void saveByFile() {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("Danhba.txt");
            oos = new ObjectOutputStream(fos);

            oos.writeObject(danhBaList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos !=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readByFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("Danhba.txt");
            ois = new ObjectInputStream(fis);

            danhBaList = (List<DanhBa>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis !=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
