/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguyenvv
 */
public class LopHocCustom {

    private String tenLop;

    private String tenSinhVien;

    private String diaChi;

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public LopHocCustom(String tenLop, String tenSinhVien, String diaChi) {
        this.tenLop = tenLop;
        this.tenSinhVien = tenSinhVien;
        this.diaChi = diaChi;
    }

    public LopHocCustom() {
    }

    @Override
    public String toString() {
        return "LopHocCustom{" + "tenLop=" + tenLop + ", tenSinhVien=" + tenSinhVien + ", diaChi=" + diaChi + '}';
    }

}
