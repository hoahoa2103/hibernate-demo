/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.SinhVien;
import model.SinhVienCustom;

/**
 *
 * @author nguyenvv
 */
public interface SinhVienService {
 
    public List<SinhVien> getList();
    
    public Boolean addNew(SinhVien sinhVien);
    
    List<SinhVienCustom> listSinhVienCustom();
}
