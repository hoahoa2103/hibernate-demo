/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.LopHoc;
import model.SinhVien;
import service.LopHocService;
import service.SinhVienService;
import service.impl.LopHocServiceImpl;
import service.impl.SinhVienServiceImpl;

/**
 *
 * @author nguyenvv
 */
public class main {

    public static void main(String[] args) {
        SinhVienService sinhVienService = new SinhVienServiceImpl();
        LopHocService lopHocService = new LopHocServiceImpl();

//        System.out.println("Danh sách lớp học ");
//        List<LopHoc> list = lopHocService.getList();
//        for (LopHoc lop : list) {
//            System.out.println(lop.toString());
//        }

//        System.out.println("Lớp học có mã lớp = 5 ");
//        LopHoc lopHoc1 = lopHocService.getById(5);
//        System.out.println(lopHoc1.toString());
//        System.out.println("Xoa lop hoc");
//        lopHocService.delete(lopHoc1);
//        System.out.println("Danh sach sau khi xoa");
//        List<LopHoc> list1 = lopHocService.getList();
//        for (LopHoc lop : list1) {
//            System.out.println(lop.toString());
//        }
//        System.out.println("Cap nhat ten lop");
//        LopHoc lopHocUpdate = lopHocService.getById(9);
//        lopHocUpdate.setTenLop("Lop New");
//        lopHocService.update(lopHocUpdate);
//
//        System.out.println("Lop Hoc sau khi update : " + lopHocService.getById(9).toString());
        //lấy tên + địa chỉ => custom object
//        System.out.println("danh sach custom:");
//        List<SinhVienCustom> list = sinhVienService.listSinhVienCustom();
//        for (SinhVienCustom sinhVienCustom : list) {
//            System.out.println(sinhVienCustom.toString());
//        }
//        List<LopHocCustom> listLopHocCustoms = lopHocService.getListLopHocCustom();
//        System.out.println("Lay sanh sach ten lop, ten sinh vien, dia chi");
//        for (LopHocCustom listLopHocCustom : listLopHocCustoms) {
//            System.out.println(listLopHocCustom.toString());
//        }
//        List<SinhVien> list = sinhVienService.getList();
//        for (SinhVien sinhVien : list) {
//            System.out.println(sinhVien.getTen() + " == " + sinhVien.getLopHoc().getTenLop());
//        }
        // Insert
//        LopHoc lopHoc = new LopHoc();
//        lopHoc.setTenLop("Toan");
//        lopHocRepository.save(lopHoc);
//        lopHocRepository.delete(4);
        //getList
        // get by id
//        LopHoc lopHoc1 = lopHocRepository.getById(3);
//        System.out.println(lopHoc1.toString());
        //delete
//        lopHocRepository.delete(lopHoc1);
//        lopHoc1.setTenLop("AAA");
//        lopHocRepository.update1(lopHoc1);
//        //get list join table
//        List<Object[]> listResult = lopHocRepository.getListObject();
//        System.out.println(listResult.size());
//        for (Object[] aRow : listResult) {
//            LopHoc lopHoc = (LopHoc) aRow[0];
//            SinhVien sinhVien = (SinhVien) aRow[1];
//            System.out.println(lopHoc.getTenLop()+ " - " + sinhVien.getTen());
//        }
//        System.out.println("insert lop hoc");
//        LopHoc lopHoc = new LopHoc();
//        lopHoc.setTenLop("CNTT456");
//        lopHocService.addNew(lopHoc);
//        List<LopHoc> getListLopHoc = lopHocService.getList();
//        for (LopHoc lopHoc : getListLopHoc) {
//            System.out.println(lopHoc.toString());
//        }
        // many to one
        List<SinhVien> list = sinhVienService.getList();
        for (SinhVien sinhVien : list) {
            System.out.println("Ten SV : " + sinhVien.getTen() + "- Ten Lop : " + sinhVien.getLopHoc().getTenLop());

        }
        // one to many
        List<LopHoc> list1 = lopHocService.getList();
        for (LopHoc lopHoc : list1) {
            System.out.println("Ten Lop :" + lopHoc.getTenLop()
                    + " - " + lopHoc.getListSinhVien());
        }
    }

}
