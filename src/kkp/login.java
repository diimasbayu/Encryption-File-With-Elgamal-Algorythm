/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkp;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class login {
    
    koneksi koneksi;
    private java.sql.Connection con;
    private java.sql.Statement stmt;
    private java.sql.ResultSet rs;
    String Users, kd_user;
    private boolean chek;
    
    
    public void Koneksi(){
        try {
            koneksi = new koneksi();
            con = koneksi.bukaKoneksi();
            stmt = con.createStatement();
        } catch (java.sql.SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void login_user(String user, String password){
           
        try {
            Koneksi();
            // query
            String cek = "select * from user where User='"+user+"' and Password='"+password+"'";
            // rs menyimpan hasil jalannya query 
            rs = stmt.executeQuery(cek);
            chek = false;
            while (rs.next()) {
                if (rs.getString(2).equals(user)) {
                kd_user = rs.getString("kd_user");
                Users = rs.getString("User");
                Session.set_kd_user(kd_user);
                Session.set_username(Users);
                chek = true;
            
            

                }  else {
                JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Tidak Sesuai",
                        "Gagal Masuk", JOptionPane.ERROR_MESSAGE);
            }}
          con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public boolean validasi (){
        return chek;
    }
    

}
