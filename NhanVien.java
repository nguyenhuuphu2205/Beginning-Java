/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_tuan1_lthdt;

/**
 *
 * @author nguyenhuuphu
 */
public class NhanVien {

    private String tenNhanVien;
    private static double luongCoBan;
    public double heSoLuong;
    public static final double LUONG_MAX = 20000000;

    public NhanVien() {
        this.tenNhanVien = "NONAME";
        this.heSoLuong = 1;
        this.luongCoBan = 800000;
    }

    public NhanVien(String TenNV, double hesoluong) {
        this.tenNhanVien = TenNV;
        this.heSoLuong = hesoluong;
    }

    public void setNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setluongCoBan(double luongcoban) {
        if (luongcoban > 0) {
            this.luongCoBan = luongcoban;
        }
    }

    public void setheSoLuong(double heso) {
        if (heso > 1) {
            heSoLuong = heso;
        }

    }

    public String gettenNhanVien() {
        return tenNhanVien;
    }

    public double getluongCoBan() {
        return luongCoBan;
    }

    public double getheSoLuong() {
        return this.heSoLuong;
    }

    public boolean tangHeSoLuong(double heso) {
        if (((heSoLuong + heso) * luongCoBan) > LUONG_MAX) {
            return false;
        } else {
            heSoLuong += heso;
            return true;
        }
    }

    public double tinhLuong() {
        return (luongCoBan * heSoLuong);
    }

    public void inTTin() {
        System.out.println("NhanVien:" + tenNhanVien);
        System.out.println("heSoLuong:" + heSoLuong);
        System.out.println("LuongCoBan:" + luongCoBan);
        System.out.println("Luong" + tinhLuong());
    }
}
