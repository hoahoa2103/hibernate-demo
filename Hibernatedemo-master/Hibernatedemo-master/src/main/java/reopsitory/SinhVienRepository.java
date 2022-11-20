/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reopsitory;

import hibernateDemo.HibernatUtil;
import java.util.List;
import model.SinhVien;
import model.SinhVienCustom;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author nguyenvv
 */
public class SinhVienRepository {

    Session session = HibernatUtil.getFACTORY().openSession();

    public List<SinhVien> getListSinhVien() {
        Query q = session.createQuery("From SinhVien");// truy vấn trên entity(HQL)
        List<SinhVien> list = q.getResultList();
        return list;
    }

    public List<SinhVienCustom> getListSinhVienCustom() {
        Query<SinhVienCustom> query = session.createQuery(
                "select new model.SinhVienCustom(s.ten , s.diaChi) "
                + " from SinhVien s");
        List<SinhVienCustom> list = query.list();
        return list;

    }

    public static void main(String[] args) {
        SinhVienRepository sinhVienRepository = new SinhVienRepository();
        List<SinhVien> list = sinhVienRepository.getListSinhVien();
        for (SinhVien sinhVien : list) {
            System.out.println("Ten sv :" + sinhVien.getTen() + " - " + sinhVien.getLopHoc().getTenLop());

        }
        
    }

}
