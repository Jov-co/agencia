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
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jov_co
 */
public class Cliente extends Operaciones {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String fechaNacimiento;
    private int fk_idRegion;

    // constructors
    
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String email, String telefono, String fechaNacimiento, int fk_idRegion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.fk_idRegion = fk_idRegion;
    }
    
    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getFk_idRegion() {
        return fk_idRegion;
    }

    public void setFk_idRegion(int fk_idRegion) {
        this.fk_idRegion = fk_idRegion;
    }


    
    // methods
    
    @Override
    public ResultSet Consulta(Connection con) {
        Statement sql;
        Properties.sql = "SELECT cliente.id, cliente.nombre, cliente.apellido, cliente.email,"
                + " cliente.telefono, cliente.fechaNacimineto, region.nombre "
                + "FROM cliente INNER JOIN region ON cliente.fk_idRegion = region.id";
        try {
            sql = con.createStatement();
            ResultSet result = sql.executeQuery(Properties.sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Pais.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet Consulta(Connection con,String nombre) {
        Statement stmt;
        Properties.sql="SELECT id,nombre,apellido,"
                + "email FROM cliente WHERE nombre LIKE '%"+nombre+"%'";
        try {
            stmt = con.createStatement();
            ResultSet result=stmt.executeQuery(Properties.sql);
            return result;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int Insertar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql = "INSERT INTO cliente(id, nombre, apellido, email, "
                + "telefono, fechaNacimiento, fk_idRegion) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql,Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, this.id);
            pstm.setString(2, this.getNombre());
            pstm.setString(3, this.getApellido());
            pstm.setString(4, this.getEmail());
            pstm.setString(5, this.getTelefono());
            pstm.setString(6, this.getFechaNacimiento());
            pstm.setInt(7, this.fk_idRegion);
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
        int rowsCreated;
        Properties.sql="DELETE FROM cliente WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setString(1, this.id);
            rowsCreated = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    @Override
    public void Editar(Connection con) {
        ResultSet rs;
        int rowsCreated;
        Properties.sql="UPDATE cliente  SET nombre = ?, apellido = ?,"
                + "email = ?, telefono = ?, fechaNacimiento = ?, fk_idRegion = ? "
                + " WHERE id = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setString(1, this.getNombre());
            pstm.setString(2, this.getApellido());
            pstm.setString(3, this.getEmail());
            pstm.setString(4, this.getTelefono());
            pstm.setString(5, this.getFechaNacimiento());
            pstm.setInt(6, this.fk_idRegion);
            pstm.setString(7, this.getId());
            rowsCreated = pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Estado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public DefaultTableModel Listar(Connection con, JTable table){
        ResultSet rs;
        Statement st;
        Properties.sql = "select cliente.id, cliente.nombre, cliente.apellido,"
                + "cliente.email, cliente.telefono, cliente.fechaNacimiento, region.nombre "
                + "from cliente inner join region on cliente.fk_idRegion = region.id";
        DefaultTableModel modelo;
        try {
            st = con.createStatement();
            rs = st.executeQuery(Properties.sql);
            Object [] estado = new Object[7];
            modelo = (DefaultTableModel)table.getModel();
            while (rs.next()){
                estado[0] = rs.getString("cliente.id");
                estado[1] = rs.getString("cliente.nombre");
                estado[2] = rs.getString("cliente.apellido");
                estado[3] = rs.getString("cliente.email");
                estado[4] = rs.getString("cliente.telefono");
                estado[5] = rs.getString("cliente.fechaNacimiento");
                estado[6] = rs.getString("region.nombre");
                modelo.addRow(estado);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return (DefaultTableModel)table.getModel();
    }
    public DefaultTableModel Listar2(Connection con, JTable table, String nombre){
        ResultSet rs;
        Statement st;
        Properties.sql = "select cliente.id, cliente.nombre, cliente.apellido,"
                + "cliente.email, cliente.telefono, cliente.fechaNacimiento, region.nombre "
                + "from cliente inner join region on cliente.fk_idRegion = region.id "
                + " WHERE cliente.nombre LIKE '%"+nombre+"%'";
        DefaultTableModel modelo;
        try {
            st = con.createStatement();
            rs = st.executeQuery(Properties.sql);
            Object [] estado = new Object[7];
            modelo = (DefaultTableModel)table.getModel();
            while (rs.next()){
                estado[0] = rs.getString("cliente.id");
                estado[1] = rs.getString("cliente.nombre");
                estado[2] = rs.getString("cliente.apellido");
                estado[3] = rs.getString("cliente.email");
                estado[4] = rs.getString("cliente.telefono");
                estado[5] = rs.getString("cliente.fechaNacimiento");
                estado[6] = rs.getString("region.nombre");
                modelo.addRow(estado);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return (DefaultTableModel)table.getModel();
    }

    
   /* public int buscarRegion (Connection con, String nombre){
        ResultSet rs;
        Statement st;
        Properties.sql = "select id from region where nombre LIKE '%?%'";
        try {
            PreparedStatement pstm = con.prepareStatement(Properties.sql);
            pstm.setString(1, nombre);
            st = con.createStatement();
            rs = st.executeQuery(Properties.sql);
            return rs.getInt("id");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return 0;
    }*/
     
    }

