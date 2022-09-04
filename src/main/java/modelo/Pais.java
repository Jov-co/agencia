/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import controlador.Operaciones;
import controlador.Properties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jov_co
 */
public class Pais extends Operaciones{
    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {
    }
    
    public ResultSet Consulta(Connection con,String criterio,String palabra) {
        Statement stmt;
        if (criterio.equals("id")){
            Properties.sql = "SELECT id,nombre FROM pais WHERE id =" + palabra;
        }else if (criterio.equals("nombre"))
        {
            Properties.sql = "SELECT id,nombre FROM pais WHERE nombre like  '%"+palabra+"%' ORDER BY nombre";
        }else{
            Properties.sql = "SELECT id,nombre FROM pais";
        }
        try {
            stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(Properties.sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public ResultSet Consulta(Connection con) {
        Statement sql;
        Properties.sql = "SELECT id,nombre FROM pais";
        try {
            sql = con.createStatement();
            ResultSet result = sql.executeQuery(Properties.sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int Insertar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql = "INSERT INTO pais(nombre) VALUES (?)";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql,Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, this.getNombre());
            rowsCreated=pstm.executeUpdate();
            if (rowsCreated>0){
                rs=pstm.getGeneratedKeys();
                if(rs.next()){
                    return rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    @Override
    public void Eliminar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql="DELETE FROM pais WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setInt(1, this.id);
            rowsCreated = pstm.executeUpdate();
            if (rowsCreated > 0){
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    @Override
    public void Editar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql="UPDATE Pais  SET nombre = ? WHERE id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setString(1,this.getNombre());
            pstm.setInt(2, this.id);
            rowsCreated = pstm.executeUpdate();
            if (rowsCreated > 0){
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public DefaultTableModel Listar(Connection con, JTable table){
        ResultSet rs;
        Statement st;
        Properties.sql = "select id, nombre from pais";
        DefaultTableModel modelo;
        try {
            st = con.createStatement();
            rs = st.executeQuery(Properties.sql);
            Object [] pais = new Object[2];
            modelo = (DefaultTableModel)table.getModel();
            while (rs.next()){
                pais[0] = rs.getInt("id");
                pais[1] = rs.getString("nombre");
                modelo.addRow(pais);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return (DefaultTableModel)table.getModel();
    }
    
    public ArrayList<Pais> lstPais(Connection con,DefaultComboBoxModel mdlCbo){
        ArrayList<Pais> listaPais = new ArrayList<>();
        ResultSet rs = Consulta(con); 
        try {
            while(rs.next()){
                Pais miPais = new Pais();
                miPais.setId(rs.getInt("id"));
                miPais.setNombre(rs.getString("nombre"));
                listaPais.add(miPais);
                mdlCbo.addElement(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPais;
    
    }
}
