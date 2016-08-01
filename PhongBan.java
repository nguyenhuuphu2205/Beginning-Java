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
public class PhongBan {

    private String tenPhongBan;
    private int soNhanVien;
    public static final int SO_NV_MAX = 100;
    NhanVien[] array1 = new NhanVien[SO_NV_MAX];

    public boolean themNV(NhanVien nv) {
        if (soNhanVien + 1 > SO_NV_MAX) {
            return false;
        } else {
            array1[soNhanVien] = nv;
            soNhanVien++;
            return true;
        }

    }

    public NhanVien xoaNV() {
        if (soNhanVien == 0) {
            return null;
        } else {
            soNhanVien--;
            NhanVien Temp;
            Temp = array1[soNhanVien];
            array1[soNhanVien] = null;
            return Temp;
        }
    }

    public double tinhTongLuong() {
        double tong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tong += array1[i].tinhLuong();
        }
        return tong;
    }

    public void inTTin() {
        System.out.println("TenPhongBan:" + tenPhongBan);
        System.out.println("SoNhanVienPhongBan:" + soNhanVien);
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("NhanVien" + i + ":");
            array1[i].inTTin();
        }
    }
}
