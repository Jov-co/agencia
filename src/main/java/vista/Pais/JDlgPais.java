/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista.Pais;

import controlador.ConexBd;
import controlador.FuncionesEsp;
import java.sql.Connection;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pais;

/**
 *
 * @author Jov_co
 */
public class JDlgPais extends javax.swing.JDialog {
    
    public JDlgPais(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listar();
    }
    final void listar(){
        ConexBd con = new ConexBd();
        Connection cn = con.miConex();
        Pais listaPaises = new Pais();
        jTableDatos.setModel(listaPaises.Listar(cn, jTableDatos));
    }
    void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();
        for (int i = 0; i < jTableDatos.getRowCount(); i++){
            modelo.removeRow(i);
            i -= 1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        Operaciones = new javax.swing.JPanel();
        jBtnNuevo = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestor Paises");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 5));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor Paises");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));
        jPanel1.setPreferredSize(new java.awt.Dimension(478, 200));
        jPanel1.setLayout(new java.awt.GridLayout());

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Pais"
            }
        ));
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDatos);
        if (jTableDatos.getColumnModel().getColumnCount() > 0) {
            jTableDatos.getColumnModel().getColumn(0).setMinWidth(50);
            jTableDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableDatos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 10), "Datos"));
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        jPanel3.setPreferredSize(new java.awt.Dimension(478, 60));
        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel6, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel7, java.awt.BorderLayout.LINE_START);

        jPanel8.setLayout(new java.awt.GridLayout(0, 2, 0, 10));

        jLabel3.setText("ID:");
        jPanel8.add(jLabel3);

        jTxtId.setEnabled(false);
        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });
        jPanel8.add(jTxtId);

        jLabel2.setText("Nombre Pais:");
        jPanel8.add(jLabel2);

        jTxtNombre.setEnabled(false);
        jPanel8.add(jTxtNombre);

        jPanel3.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        Operaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        Operaciones.setPreferredSize(new java.awt.Dimension(478, 100));
        Operaciones.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        jBtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/new.png"))); // NOI18N
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });
        Operaciones.add(jBtnNuevo);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\diskette.png")); // NOI18N
        jBtnAgregar.setEnabled(false);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        Operaciones.add(jBtnAgregar);

        jBtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edit.png"))); // NOI18N
        jBtnModificar.setEnabled(false);
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        Operaciones.add(jBtnModificar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\delete.png")); // NOI18N
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        Operaciones.add(jBtnEliminar);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\cancel.png")); // NOI18N
        jBtnCancelar.setEnabled(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        Operaciones.add(jBtnCancelar);

        jPanel2.add(Operaciones);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        ConexBd con = new ConexBd();
        Connection conn = con.miConex();
        Pais nuevoPais = new Pais(jTxtNombre.getText().toLowerCase());
        nuevoPais.Insertar(conn);
        JOptionPane.showMessageDialog(this, "Se registro un nuevo Pais","Aviso",JOptionPane.INFORMATION_MESSAGE);
        limpiarTabla();
        listar();
        
// Disable and Enable components
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar
        };
        JComponent[] component2 = {
            jBtnNuevo
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar
        };
        JComponent[] component2 = {
            jBtnNuevo
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
        // TODO add your handling code here:
        JComponent[] component1 = {
            jTxtNombre, jBtnAgregar, jBtnCancelar
        };
        JComponent[] component2 = {
            jBtnNuevo, jBtnEliminar, jBtnModificar
        };
        FuncionesEsp.DesactivarActivar(component1, true);
        FuncionesEsp.DesactivarActivar(component2, false);
        jTxtId.requestFocus();
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMouseClicked
        // TODO add your handling code here:
        int fila = jTableDatos.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "Selecciona una opción valida");
        }else{
            int id = Integer.parseInt((String)jTableDatos.getValueAt(fila, 0).toString());
            String nombre = (String)jTableDatos.getValueAt(fila, 1);
            jTxtId.setText("" + id);
            jTxtNombre.setText(nombre);
    // Disable and Enable components
            JComponent[] component1 = {
                jTxtNombre, jBtnModificar, jBtnEliminar, jBtnCancelar
            };
            JComponent[] component2 = {
                jBtnNuevo, jBtnAgregar
            };
            FuncionesEsp.DesactivarActivar(component1, true);
            FuncionesEsp.DesactivarActivar(component2, false);
            jTxtNombre.requestFocus();
            
        }
    }//GEN-LAST:event_jTableDatosMouseClicked

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        // TODO add your handling code here:
        ConexBd cnbd = new ConexBd();
        Connection conn = cnbd.miConex();
        Pais miPais = new Pais(jTxtNombre.getText());
        miPais.setId(Integer.parseInt(jTxtId.getText()));
        miPais.Editar(conn);
        JOptionPane.showMessageDialog(this, "Se modifico el pais","Aviso",JOptionPane.INFORMATION_MESSAGE);
        limpiarTabla();
        listar();
    // Disable and Enable components       
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar
        };
        JComponent[] component2 = {
            jBtnNuevo
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        ConexBd cnbd = new ConexBd();
        Connection conn = cnbd.miConex();
        Pais miPais = new Pais(jTxtNombre.getText());
        miPais.setId(Integer.parseInt(jTxtId.getText()));
        
        if (JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar la información?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "El pais " +
                    jTxtNombre.getText().toUpperCase() + " se ha eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);
            miPais.Eliminar(conn);

        } else {
            JOptionPane.showMessageDialog(this, "El pais " +
                    jTxtNombre.getText().toUpperCase() + " NO se ha eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
        limpiarTabla();
        listar();
        
    // Disable and Enable components       
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar
        };
        JComponent[] component2 = {
            jBtnNuevo
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDlgPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgPais dialog = new JDlgPais(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Operaciones;
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
