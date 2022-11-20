/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reopsitory;

import hibernateDemo.HibernatUtil;
import java.util.List;
import model.LopHoc;
import model.LopHocCustom;
import model.SinhVien;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

/**
 *
 * @author nguyenvv
 */
public class LopHocRepository {

    Session session = HibernatUtil.getFACTORY().openSession();

    public List<LopHoc> getList() {
        Query query = session.createQuery("From LopHoc ");// truy vấn trên entity(HQL)
        List<LopHoc> list = query.getResultList();
        return list;
    }

    public Boolean save(LopHoc lopHoc) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(lopHoc);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
    }

    public Boolean delete(LopHoc lopHoc) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(lopHoc);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }
        return null;
    }

    // update không dùng transaction -> phát sinh lỗi
    public Boolean update(LopHoc lopHoc) {

        Query query = session.createQuery("update LopHoc set tenLop = :tenLop"
                + " where maLop = :maLop");
        query.setParameter("tenLop", lopHoc.getTenLop());
        query.setParameter("maLop", lopHoc.getMaLop());
        query.executeUpdate();
        return true;
    }

    public Boolean update1(LopHoc lopHoc) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery("update LopHoc set tenLop = :tenLop"
                    + " where maLop = :maLop");
            query.setParameter("tenLop", lopHoc.getTenLop());
            query.setParameter("maLop", lopHoc.getMaLop());
            query.executeUpdate();
            transaction.commit();
            return true;
        }
    }

    public List<Object[]> getListObject() {
        //join
//        Query query = session.createQuery("from LopHoc as lophoc ,SinhVien as sinhvien");

        //inner join
        Query query = session.createQuery("FROM LopHoc lopHoc "
                + " INNER JOIN  lopHoc.listSinhVien");

        List<Object[]> list = query.list();
        return list;
    }

    public LopHoc getById(int id) {
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            LopHoc lopHoc = session.get(LopHoc.class, id);
            return lopHoc;
        } catch (Exception e) {
        }
        return null;
    }

    public List<LopHocCustom> listLopHocCustom() {
        Query query = session.createQuery("select "
                + " new model.LopHocCustom(m.lopHoc.tenLop as tenLop,"
                + " m.ten as tenSinhVien , "
                + " m.diaChi as diaChi) "
                + " from model.SinhVien m");
        List<LopHocCustom> result = query.list();
        return result;
    }
    public static void main(String[] args) {
//        LopHoc sv=new LopHoc(1, "Lop moi");
//                System.out.println("Cap nhat ten lop");
//        LopHoc lopHocUpdate = lopHocService.getById(9);
//        lopHocUpdate.setTenLop("Lop New");
//        lopHocService.update(lopHocUpdate);
        System.out.println(new LopHocRepository().getListObject());
   
    }

}
