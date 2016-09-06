/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.*;

/**
 *
 * @author mvarela6
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        txtnum1 = new javax.swing.JTextField();
        txtden1 = new javax.swing.JTextField();
        cmdoperacion = new javax.swing.JComboBox<>();
        txtden2 = new javax.swing.JTextField();
        txtnum2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnum3 = new javax.swing.JTextField();
        txtden3 = new javax.swing.JTextField();
        cmdcalcular = new javax.swing.JButton();
        cmdlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("OPERACION CON LOS FRACCIONARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 220, 30));
        jPanel1.add(txtnum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, 30));
        jPanel1.add(txtden1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        cmdoperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División", " " }));
        jPanel1.add(cmdoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));
        jPanel1.add(txtden2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 90, 30));
        jPanel1.add(txtnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 90, 30));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 20, 20));
        jPanel1.add(txtnum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 90, 30));
        jPanel1.add(txtden3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 90, 30));

        cmdcalcular.setText("Calcular");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 163, 100, 30));

        cmdlimpiar.setText("Limpiar");
        jPanel1.add(cmdlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        int op, n1, n2, n3, d1, d2, d3;
        Fraccionarios f1, f2, f3 = null;
         op = cmdoperacion.getSelectedIndex();
         
        n1 = Integer.parseInt(txtnum1.getText());
        n2 = Integer.parseInt(txtnum2.getText());
        n3 = Integer.parseInt(txtnum3.getText());
        d1 = Integer.parseInt(txtden1.getText());
        d2 = Integer.parseInt(txtden2.getText());
        d3 = Integer.parseInt(txtden3.getText());
        
        f1 = new Fraccionarios(n1, d1);
        f2 = new Fraccionarios(n2, d2);

       
      switch(op){
          case 0:
              f3 = f1.suma(f2);
              break;
          case 1:
              f3 = f1.resta(f2);
              break;
              
      }
txtnum3.setText(""+ f3.getnumerador());
              txtden3.setText(""+ f3.getdenominador());

    }//GEN-LAST:event_cmdcalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JButton cmdlimpiar;
    private javax.swing.JComboBox<String> cmdoperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtden1;
    private javax.swing.JTextField txtden2;
    private javax.swing.JTextField txtden3;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    private javax.swing.JTextField txtnum3;
    // End of variables declaration//GEN-END:variables
}
