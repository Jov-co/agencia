/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Jov_co
 */
public abstract class Operaciones {
    public abstract ResultSet Consulta(Connection con);
    public abstract int Insertar(Connection con);
    public abstract void Eliminar(Connection con);
    public abstract void Editar(Connection con);  
}
