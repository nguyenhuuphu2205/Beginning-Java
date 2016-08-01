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
public class TruongPhong extends NhanVien {

    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong() {
        phuCap = 0;
        soNamDuongChuc = 1;
    }

    public TruongPhong(String TenNV, double hesoluong, double phucap, double sonam) {
        this.setNhanVien(TenNV);
        this.setheSoLuong(hesoluong);
        this.phuCap = phucap;
        this.soNamDuongChuc = sonam;

    }

    public static void main(String[] args) {
        TruongPhong N1 = new TruongPhong("nguyenvanA", 2.0, 800000, 3);
        N1.inTTin();
        System.out.println("Phucap:" + N1.phuCap + "\nSonamduongchuc:" + N1.soNamDuongChuc);
    }
}
