/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista.Cliente;

import controlador.ConexBd;
import controlador.FuncionesEsp;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Optional;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Estado;
import modelo.Region;

/**
 *
 * @author Jov_co
 */
public class JDlgCliente extends javax.swing.JDialog {
    ArrayList<Region> lstRegion = new ArrayList<>();
    int idRegion;
    
    /**
     * Creates new form JDlgCliente
     */
    public JDlgCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fillCiudades();
        listar();
    }
    
       
    public final void fillCiudades(){
        DefaultComboBoxModel mdlCbo = new DefaultComboBoxModel();
        ConexBd myConex = new ConexBd();
        jCboRegion.removeAllItems(); //Eliminar todos los items
        Connection con = myConex.miConex();
        Region region = new Region();
        mdlCbo.addElement("Seleccione una región");
        lstRegion = region.lstRegion(con, mdlCbo);
        jCboRegion.setModel(mdlCbo);
    }

    final void listar(){
        ConexBd con = new ConexBd();
        Connection cn = con.miConex();
        Cliente listaClientes = new Cliente();
        jTableDatos.setModel(listaClientes.Listar(cn, jTableDatos));
    }
    void limpiarTabla(){
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();
        for (int i = 0; i < jTableDatos.getRowCount(); i++){
            modelo.removeRow(i);
            i -= 1;
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTxtBuscar = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jBtnNuevo = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedFechaNacimiento = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jCboRegion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor Clientes");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel2.setLayout(new java.awt.GridLayout());

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "E-mail", "Telefono", "Fecha Nacimiento", "Región"
            }
        ));
        jTableDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar"));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel12, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel13, java.awt.BorderLayout.LINE_END);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jTxtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 40));

        jBtnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\search.png")); // NOI18N
        jBtnBuscar.setPreferredSize(new java.awt.Dimension(20, 20));
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });
        jPanel14.add(jBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 40, 40));

        jPanel5.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0, 10, 10));

        jBtnNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\new.png")); // NOI18N
        jBtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoActionPerformed(evt);
            }
        });
        jPanel6.add(jBtnNuevo);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\diskette.png")); // NOI18N
        jBtnAgregar.setEnabled(false);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jPanel6.add(jBtnAgregar);

        jBtnModificar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\edit.png")); // NOI18N
        jBtnModificar.setEnabled(false);
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });
        jPanel6.add(jBtnModificar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\delete.png")); // NOI18N
        jBtnEliminar.setEnabled(false);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jPanel6.add(jBtnEliminar);

        jBtnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Documents\\NetBeansProjects\\Agencia\\src\\main\\resources\\Iconos\\cancel.png")); // NOI18N
        jBtnCancelar.setEnabled(false);
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });
        jPanel6.add(jBtnCancelar);

        jPanel4.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setPreferredSize(new java.awt.Dimension(25, 104));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel10.setLayout(new java.awt.GridLayout(0, 4, 10, 10));

        jLabel2.setText("Identificación:");
        jPanel10.add(jLabel2);

        jTxtId.setEnabled(false);
        jPanel10.add(jTxtId);

        jLabel3.setText("Telefono:");
        jPanel10.add(jLabel3);

        jTxtTelefono.setEnabled(false);
        jPanel10.add(jTxtTelefono);

        jLabel4.setText("Nombre: ");
        jPanel10.add(jLabel4);

        jTxtNombre.setEnabled(false);
        jPanel10.add(jTxtNombre);

        jLabel5.setText("Fecha de Nacimiento:");
        jPanel10.add(jLabel5);

        jFormattedFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-d"))));
        jFormattedFechaNacimiento.setToolTipText("");
        jFormattedFechaNacimiento.setEnabled(false);
        jFormattedFechaNacimiento.setName(""); // NOI18N
        jPanel10.add(jFormattedFechaNacimiento);

        jLabel6.setText("Apellido: ");
        jPanel10.add(jLabel6);

        jTxtApellido.setEnabled(false);
        jPanel10.add(jTxtApellido);

        jLabel7.setText("Región");
        jPanel10.add(jLabel7);

        jCboRegion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCboRegion.setEnabled(false);
        jCboRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboRegionActionPerformed(evt);
            }
        });
        jPanel10.add(jCboRegion);

        jLabel8.setText("E-mail:");
        jPanel10.add(jLabel8);

        jTxtEmail.setEnabled(false);
        jPanel10.add(jTxtEmail);

        jPanel7.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
      
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento,
            jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar, jCboRegion
        };
        JComponent[] component2 = {
            jBtnNuevo, jTxtBuscar, jBtnBuscar
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        // TODO add your handling code here:
        ConexBd cnbd = new ConexBd();
        Connection conn = cnbd.miConex();
        Cliente miCliente = new Cliente(jTxtNombre.getText(),
                jTxtApellido.getText(), jTxtEmail.getText(), jTxtTelefono.getText(),
                jFormattedFechaNacimiento.getText(), idRegion);
        miCliente.setId(jTxtId.getText());
        miCliente.Editar(conn);
        JOptionPane.showMessageDialog(this, "Se modifico el cliente","Aviso",JOptionPane.INFORMATION_MESSAGE);
        limpiarTabla();
        listar();
    // Disable and Enable components       
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento,
            jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar, jCboRegion
        };
        JComponent[] component2 = {
            jBtnNuevo, jTxtBuscar, jBtnBuscar
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
        ConexBd cnbd = new ConexBd();
        Connection conn = cnbd.miConex();
        Cliente miCliente = new Cliente();
        /*Cliente miCliente = new Cliente(jTxtNombre.getText(),
                jTxtApellido.getText(), jTxtEmail.getText(), jTxtTelefono.getText(),
                jFormattedFechaNacimiento.getText(), idRegion);*/
        miCliente.setId(jTxtId.getText());
        
        if (JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar la información?", "WARNING",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "El cliente " +
                    jTxtNombre.getText().toUpperCase() + " se ha eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);
            miCliente.Eliminar(conn);

        } else {
            JOptionPane.showMessageDialog(this, "El cliente " +
                    jTxtNombre.getText().toUpperCase() + " NO se ha eliminado","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
        limpiarTabla();
        listar();
        
    // Disable and Enable components       
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento,
            jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar, jCboRegion
        };
        JComponent[] component2 = {
            jBtnNuevo, jTxtBuscar, jBtnBuscar
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoActionPerformed
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento,
            jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar, jCboRegion
        };
        JComponent[] component2 = {
            jBtnNuevo, jBtnEliminar, jBtnModificar, jTxtBuscar, jBtnBuscar
        };
        FuncionesEsp.DesactivarActivar(component1, true);
        FuncionesEsp.DesactivarActivar(component2, false);
        jTxtId.requestFocus();
    }//GEN-LAST:event_jBtnNuevoActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        ConexBd con = new ConexBd();
        Connection conn = con.miConex();
        Cliente miCliente = new Cliente(jTxtNombre.getText(),
                jTxtApellido.getText(), jTxtEmail.getText(), jTxtTelefono.getText(),
                jFormattedFechaNacimiento.getText(), idRegion);
        miCliente.setId(jTxtId.getText());
        miCliente.Insertar(conn);
        JOptionPane.showMessageDialog(this, "Se registro un nuevo cliente","Aviso",JOptionPane.INFORMATION_MESSAGE);
        limpiarTabla();
        listar();
        
    // Disable and Enable components       
        JComponent[] component1 = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento,
            jBtnAgregar, jBtnCancelar, jBtnEliminar, jBtnModificar, jCboRegion
        };
        JComponent[] component2 = {
            jBtnNuevo, jTxtBuscar, jBtnBuscar
        };
        JComponent[] datosLimpiar = {
            jTxtId, jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento
        };
        FuncionesEsp.DesactivarActivar(component1, false);
        FuncionesEsp.DesactivarActivar(component2, true);
        FuncionesEsp.LimpiarData(datosLimpiar);
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jCboRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboRegionActionPerformed
        // TODO add your handling code here:
        Region region;
        if((jCboRegion.getSelectedIndex()-1)>=0){
            region = lstRegion.get(jCboRegion.getSelectedIndex()-1);
            idRegion = region.getId();
        }
    }//GEN-LAST:event_jCboRegionActionPerformed

    private void jTableDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDatosMouseClicked
        // TODO add your handling code here:

        int fila = jTableDatos.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null, "Selecciona una opción valida");
        }else{
            String id = (String)jTableDatos.getValueAt(fila, 0);
            String nombre = (String)jTableDatos.getValueAt(fila, 1);
            String apellido = (String)jTableDatos.getValueAt(fila, 2);
            String email = (String)jTableDatos.getValueAt(fila, 3);
            String telefono = (String)jTableDatos.getValueAt(fila, 4);
            String fechaNacimiento = (String)jTableDatos.getValueAt(fila, 5);
            String region = (String)jTableDatos.getValueAt(fila, 6);
            
            jTxtId.setText(id);
            jTxtNombre.setText(nombre);
            jTxtApellido.setText(apellido);
            jTxtEmail.setText(email);
            jTxtTelefono.setText(telefono);
            jFormattedFechaNacimiento.setText(fechaNacimiento);
            jCboRegion.setSelectedItem(region);
            
            
    // Disable and Enable components
            JComponent[] component1 = {
                jTxtNombre, jTxtApellido, jTxtEmail, jTxtTelefono, jFormattedFechaNacimiento,
                jBtnModificar, jBtnEliminar, jBtnCancelar, jCboRegion
            };
            JComponent[] component2 = {
                jBtnNuevo, jBtnAgregar
            };
            FuncionesEsp.DesactivarActivar(component1, true);
            FuncionesEsp.DesactivarActivar(component2, false);
            jTxtNombre.requestFocus();
            
        }
    }//GEN-LAST:event_jTableDatosMouseClicked

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuscarActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        ConexBd con = new ConexBd();
        Connection cn = con.miConex();
        Cliente listaClientes = new Cliente();
        jTableDatos.setModel(listaClientes.Listar2(cn, jTableDatos, jTxtBuscar.getText()));
    }//GEN-LAST:event_jBtnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCliente dialog = new JDlgCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JButton jBtnNuevo;
    private javax.swing.JComboBox<String> jCboRegion;
    private javax.swing.JFormattedTextField jFormattedFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtBuscar;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
