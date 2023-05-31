/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Responsi170;

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Lab Informatika
 */
public class ModelMovie {
    private String judul;
    private String alur;
    private String penokohan;
    private String akting;
    
    private final String DBurl = "jdbc://localhost/movie";
    private final String DBusername = "root";
    private final String DBpassword = "";
    
    Connection koneksi;
    Statement statement;
    
    public String getJudul(){
        return this.judul;
    }
    
    public String getAlur(){
        return this.alur;
    }
    
    public String getPenokohan(){
        return this.penokohan;
    }
    
    public String getAkting(){
        return this.akting;
    }
    
    public void Connection (ViewMovie viewMovie) throws SQLException{
        
        try{
            String url = "";
            String user = "";
            String pass = "";
//            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            statement = koneksi.createStatement();
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Data tidak masuk!","Message",JOptionPane.ERROR_MESSAGE);
        }
    }
}
