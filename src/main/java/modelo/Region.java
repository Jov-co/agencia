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
public class Region extends Operaciones{
    private int id;
    private String nombre;
    private int fk_idEstado;

    public Region() {
    }

    public Region(String nombre, int fk_idEstado) {
        this.nombre = nombre;
        this.fk_idEstado = fk_idEstado;
    }
    
    // getters and setters

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

    public int getFk_idPais() {
        return fk_idEstado;
    }

    public void setFk_idPais(int fk_idEstado) {
        this.fk_idEstado = fk_idEstado;
    }
    
    
    // methods
    
    @Override
    public ResultSet Consulta(Connection con) {
        Statement sql;
        Properties.sql = "SELECT id,nombre FROM region";
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
        Properties.sql = "INSERT INTO region(nombre, fk_idEstado) VALUES (?, ?)";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql,Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, this.getNombre());
            pstm.setInt(2, this.fk_idEstado);
            rowsCreated=pstm.executeUpdate();
            if (rowsCreated>0){
                rs=pstm.getGeneratedKeys();
                if(rs.next()){
                    return rs.getInt(1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }

    @Override
    public void Eliminar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql="DELETE FROM region WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setInt(1, this.id);
            rowsCreated = pstm.executeUpdate();
            if (rowsCreated > 0){
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    @Override
    public void Editar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql="UPDATE estado  SET nombre = ?, fk_idEstado = ? WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setString(1,this.getNombre());
            pstm.setInt(2, this.fk_idEstado);
            pstm.setInt(3, this.id);
            rowsCreated = pstm.executeUpdate();
            if (rowsCreated > 0){
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public DefaultTableModel Listar(Connection con, JTable table){
        ResultSet rs;
        Statement st;
        Properties.sql = "select region.id, region.nombre, estado.nombre "
                + "from region inner join estado on region.fk_idEstado = estado.id";
        DefaultTableModel modelo;
        try {
            st = con.createStatement();
            rs = st.executeQuery(Properties.sql);
            Object [] estado = new Object[3];
            modelo = (DefaultTableModel)table.getModel();
            while (rs.next()){
                estado[0] = rs.getInt("region.id");
                estado[1] = rs.getString("region.nombre");
                estado[2] = rs.getString("estado.nombre");
                modelo.addRow(estado);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return (DefaultTableModel)table.getModel();
    }
    
    public ArrayList<Region> lstRegion(Connection con,DefaultComboBoxModel mdlCbo){
        ArrayList<Region> listaRegion = new ArrayList<>();
        ResultSet rs =Consulta(con); 
        try {
            while(rs.next()){
                Region miRegion = new Region();
                miRegion.setId(rs.getInt("id"));
                miRegion.setNombre(rs.getString("nombre"));
                listaRegion.add(miRegion);
                mdlCbo.addElement(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRegion;
    
    }    
   
    
}
