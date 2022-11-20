/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nguyenvv
 */
public class SinhVienCustom {

    private String ten;

    private String diaChi;

    public SinhVienCustom(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public SinhVienCustom() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "SinhVienCustom{" + "ten=" + ten + ", diaChi=" + diaChi + '}';
    }

    
}
