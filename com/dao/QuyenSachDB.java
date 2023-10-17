/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2.com.dao;

import Project2.com.entitys.QuyenSach;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh PC
 */
public class QuyenSachDB {
    public static void addData( String ten, String theloai, String nXB, float giatien) throws ClassNotFoundException, SQLException {
        //To change body of generated methods, choose Tools | Templates.
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("insert into quyensach(TenSach,TheLoai,NXB,GiaTien) values('" + ten + "','" + theloai + "','" + nXB + "','" + giatien + "')");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void updateData(int ma, String ten, String theloai, String nXB, float giatien) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("update quyensach set TenSach='" + ten + "',TheLoai='" + theloai + "',NXB='" + nXB + "',GiaTien='" + giatien + "' where MaSach='" + ma + "'");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void deleteData(int ma) {
        try {
            Connection con = Project2.com.dao.ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            stateMent.executeUpdate("delete from quyensach where MaSach='" + ma + "'");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
