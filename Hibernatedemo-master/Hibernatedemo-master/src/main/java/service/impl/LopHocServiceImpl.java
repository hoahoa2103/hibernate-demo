/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;
import model.LopHoc;
import model.LopHocCustom;
import reopsitory.LopHocRepository;
import service.LopHocService;

/**
 *
 * @author nguyenvv
 */
public class LopHocServiceImpl implements LopHocService {
    
    private LopHocRepository lopHocRepository = new LopHocRepository();
    
    @Override
    public List<LopHoc> getList() {
        //xu ly logic
        return lopHocRepository.getList();
    }
    
    @Override
    public Boolean addNew(LopHoc lopHoc) {
        return lopHocRepository.save(lopHoc);
    }
    
    @Override
    public Boolean delete(LopHoc lopHoc) {
        return lopHocRepository.delete(lopHoc);
    }
    
    @Override
    public Boolean update(LopHoc lopHoc) {
        return lopHocRepository.update1(lopHoc);
    }
    
    @Override
    public LopHoc getById(int maLop) {
        return lopHocRepository.getById(maLop);
    }

    @Override
    public List<LopHocCustom> getListLopHocCustom() {
        return lopHocRepository.listLopHocCustom();
    }
    
}
