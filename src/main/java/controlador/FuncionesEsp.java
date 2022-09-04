/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jov_co
 */
public class FuncionesEsp {
        public static void DesactivarActivar(JComponent[] tipoComponente,boolean estado){
        for (JComponent c : tipoComponente){
            c.setEnabled(estado);
        }
    }
    public static void LimpiarData(JComponent[] tipoComponente){
        for (JComponent c : tipoComponente){
            JTextField txt = (JTextField)c;
            txt.setText("");
        }
    }
    public static void DesactivarActivar(int tipoComponente,JPanel JpnlContenedor,boolean estado){
        /*
            1. Cajas de texto JTextField
            2. Botones JButtons
        */
        switch(tipoComponente)
        {
            case 1 -> Arrays.stream(JpnlContenedor.getComponents()).forEach(c -> { if (c instanceof JTextField) c.setEnabled(estado); } );
            case 2 -> Arrays.stream(JpnlContenedor.getComponents()).forEach(c -> { if (c instanceof JButton) c.setEnabled(estado); } );
        }
    }     
    
}
