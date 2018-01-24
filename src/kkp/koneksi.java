package kkp;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {

public static Connection bukaKoneksi()throws SQLException{

        Connection connect;
  	try{
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost/db_kkp","root","");
            return connect;
  	}
  	catch(SQLException sqlexc){
            JOptionPane.showMessageDialog(null,sqlexc,"Koneksi Database",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
  	}
  	catch(ClassNotFoundException classexc){
            JOptionPane.showMessageDialog(null,classexc,"Koneksi Database",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
  	}
  	catch(Exception exc){
            JOptionPane.showMessageDialog(null,exc,"Koneksi Database",JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            return null;
  	}
    }
}
