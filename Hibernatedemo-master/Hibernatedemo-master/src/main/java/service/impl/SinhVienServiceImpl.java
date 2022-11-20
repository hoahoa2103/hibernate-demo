/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.SinhVien;
import model.SinhVienCustom;
import reopsitory.SinhVienRepository;
import service.SinhVienService;

/**
 *
 * @author nguyenvv
 */
public class SinhVienServiceImpl implements SinhVienService {

    private SinhVienRepository sinhVienRepository = new SinhVienRepository();

    @Override
    public List<SinhVien> getList() {
        return sinhVienRepository.getListSinhVien();
    }

    @Override
    public Boolean addNew(SinhVien sinhVien) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SinhVienCustom> listSinhVienCustom() {
        return sinhVienRepository.getListSinhVienCustom();
    }

    

}
