/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.LopHoc;
import model.LopHocCustom;

/**
 *
 * @author nguyenvv
 */
public interface LopHocService {

    List<LopHoc> getList();

    Boolean addNew(LopHoc lopHoc);

    Boolean delete(LopHoc lopHoc);

    Boolean update(LopHoc lopHoc);

    LopHoc getById(int maLop);
    
    List<LopHocCustom> getListLopHocCustom();
    
}
