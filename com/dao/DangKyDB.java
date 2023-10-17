/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project2.com.dao;

//import Project2.DangKy;
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

public class DangKyDB {
    
    String register_email;
    String register_password;
    String register_phone;
    String register_uname;

    public String getRegister_email() {
        return register_email;
    }

    public void setRegister_email(String register_email) {
        this.register_email = register_email;
    }

    public String getRegister_password() {
        return register_password;
    }

    public void setRegister_password(String register_password) {
        this.register_password = register_password;
    }

    public String getRegister_phone() {
        return register_phone;
    }

    public void setRegister_phone(String register_phone) {
        this.register_phone = register_phone;
    }

    public String getRegister_uname() {
        return register_uname;
    }

    public void setRegister_uname(String register_uname) {
        this.register_uname = register_uname;
    }
    
    
//    static void clearField(){ 
//        DangKyDB dangKyDb = new DangKyDB();
//        dangKyDb.setTenBanDocs(register_password.getText());
//        dangKyDb.setRegister_email(register_password.getText());
//        register_password.setText("");
//        register_phone.setText("");
//        register_retype_password.setText("");
//        register_uname.setText("");
//    }
    public static void addData(String uname ,String pass, String eMail, String phoneNumber) throws ClassNotFoundException, SQLException {
        //To change body of generated methods, choose Tools | Templates.
          try {
            
            Connection con = ConnectionDB.ketNoi();
            Statement stateMent = con.createStatement();
            String sql = "insert into dangkynhanvien(UserName,Password,Email,Phone_Number) values('"+uname+"','"+pass+"','"+eMail+"','"+phoneNumber+"')";
//            stateMent.executeUpdate("insert into dangkynhanvien(MaTaiKhoan,UserName,Password,Email,Phone_Number) values('"+id+"','"+uname+"','"+getMd5(pass, pass)+"','"+eMail+"','"+phoneNumber+"')");
              stateMent.executeUpdate(sql);
          } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(QuyenSach.class.getName()).log(Level.SEVERE, null, ex);
        }         
          
    }
}
