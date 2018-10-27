/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria.Vista;

import clinicaveterinaria.modelo.Conexion;
import clinicaveterinaria.modelo.Mascota;
import clinicaveterinaria.modelo.Tratamiento;
import clinicaveterinaria.modelo.VisitaAtencion;
import clinicaveterinaria.modelo.VisitaAtencionData;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class FormularioVisitas extends javax.swing.JFrame {
    private VisitaAtencionData visitadata;
    private Conexion conexion;

    /**
     * Creates new form FormularioVisitas
     */
    public FormularioVisitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            conexion = new Conexion ("jdbc:mysql://localhost/clinica_veterinaria","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioVisitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        visitadata = new VisitaAtencionData(conexion);
    }
    
    public void limpiar(){
        jTextFieldIdvisita.setText("");
        jtmascota.setText("");
        jttratamiento.setText("");
        jTextFieldFecha.setText("");
        jTextFieldPeso.setText("");
        jTextAreaDetalles.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelIdmascota = new javax.swing.JLabel();
        jLabelIdtratamient = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelDetalles = new javax.swing.JLabel();
        jtmascota = new javax.swing.JTextField();
        jttratamiento = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDetalles = new javax.swing.JTextArea();
        jButtonGuardar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabelIdvisita = new javax.swing.JLabel();
        jTextFieldIdvisita = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("- Visitas de Atencion -");

        jLabelIdmascota.setText("mascota");

        jLabelIdtratamient.setText("Tratamiento");

        jLabelFecha.setText("Fecha de Visita");

        jLabelPeso.setText("Peso actual");

        jLabelDetalles.setText("Detalles");

        jttratamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jttratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttratamientoActionPerformed(evt);
            }
        });

        jTextAreaDetalles.setColumns(20);
        jTextAreaDetalles.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDetalles);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabelIdvisita.setText("ID Visitas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDetalles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonLimpiar)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFecha)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPeso)
                        .addGap(33, 33, 33)
                        .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelIdvisita)
                        .addGap(6, 6, 6)
                        .addComponent(jTextFieldIdvisita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelIdmascota)
                        .addGap(12, 12, 12)
                        .addComponent(jtmascota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelIdtratamient)
                        .addGap(18, 18, 18)
                        .addComponent(jttratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdmascota)
                    .addComponent(jLabelIdtratamient)
                    .addComponent(jtmascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jttratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdvisita)
                    .addComponent(jTextFieldIdvisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabelPeso)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDetalles)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonBuscar)
                    .addComponent(jButtonLimpiar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        int mascota=Integer.parseInt(jtmascota.getText());        
        int tratamiento=Integer.parseInt(jttratamiento.getText());
        LocalDate fecha= LocalDate.parse(jTextFieldFecha.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        double peso=Double.parseDouble(jTextFieldPeso.getText());
        String detalles=jTextAreaDetalles.getText();
        Mascota mascotas = new Mascota();
        mascotas.setIdmascota(mascota);
        Tratamiento tratamientos = new Tratamiento ();
        tratamientos.setIdtratamiento(tratamiento);
        
        VisitaAtencion visita = new VisitaAtencion(mascotas, tratamientos, detalles, fecha, peso);
        visitadata.guardarVisita(visita);
        jTextFieldIdvisita.setText(visita.getIdvisitaatencion()+""); 
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jttratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttratamientoActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        int idvisitaatencion=Integer.parseInt(jTextFieldIdvisita.getText());
        visitadata.borrarVistitaAtencion(idvisitaatencion);
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        int idvisitaatencion=Integer.parseInt(jTextFieldIdvisita.getText());
        VisitaAtencion visita = visitadata.buscarVisitaAtencion(idvisitaatencion);
	if(visita!=null){
	jTextFieldIdvisita.setText(visita.getIdvisitaatencion()+"");
        jTextFieldFecha.setText(visita.getFechaVisita().toString());
	jTextFieldPeso.setText(visita.getPeso()+"");
	jTextAreaDetalles.setText(visita.getDetalles());
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioVisitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioVisitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDetalles;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelIdmascota;
    private javax.swing.JLabel jLabelIdtratamient;
    private javax.swing.JLabel jLabelIdvisita;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDetalles;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldIdvisita;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jtmascota;
    private javax.swing.JTextField jttratamiento;
    // End of variables declaration//GEN-END:variables
}
