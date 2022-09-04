/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package agencia;

import javax.swing.JFrame;
import vista.JFrmPrincipal;

/**
 *
 * @author Jov_co
 */
public class Agencia {

    public static void main(String[] args) {
        JFrmPrincipal vp=new JFrmPrincipal();
        vp.setTitle("Ventana Principal");
        vp.setLocationRelativeTo(null);
        //vp.setSize(600,600);
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setLocationRelativeTo(null); //Ubicar la ventana manualmente
        vp.setVisible(true);
    }
}
