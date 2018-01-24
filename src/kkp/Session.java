/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkp;

public class Session {
    private static String kd_user, user;
    private static int row;
    
    public static void set_kd_user(String user){
        Session.kd_user = user;
    }
    
    public static void set_username(String user){
        Session.user = user;
    }
    
    public static void set_row(int row){
        Session.row = row;
    }
    
    public static String get_kd_user(){
        return kd_user;
    }
    
    public static Integer get_row(){
        return row;
    }
    
    public static String get_username(){
        return user;
    }
}
