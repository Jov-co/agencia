/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jov_co
 */
public class ConexBd {
    private String db;
    private String pwd;
    private String user;

    public ConexBd() {
        this.db = Properties.DB;
        this.user = Properties.USER;
        this.pwd = Properties.PWD;
    }
    public Connection miConex(){
        String url = "jdbc:mysql://localhost:3306/"+this.db+"?useSSL=false&serverTimezone=UTC";
        try {
            Connection conex = DriverManager.getConnection(url,this.user,this.pwd);
            return conex;
        } catch (SQLException ex) {
            Logger.getLogger(ConexBd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;    
    }    
}
