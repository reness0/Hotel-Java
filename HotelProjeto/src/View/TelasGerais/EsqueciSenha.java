/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TelasGerais;

import View.TelasGerais.Login;
import com.placeholder.PlaceHolder;
import conexao.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import model.bean.Hospede;
import model.dao.HospedeDAO;

/**
 *
 * @author sousa
 */
public class EsqueciSenha extends javax.swing.JFrame {

    /**
     * Creates new form EsqueciSenha
     */
    PlaceHolder texto;
    String cpf;

    public EsqueciSenha() {
        initComponents();
        texto = new PlaceHolder(jTextField1, "CPF");
        texto = new PlaceHolder(jTextField2, "Login");
        texto = new PlaceHolder(jPasswordField1, "Senha");
        texto = new PlaceHolder(jPasswordField2, "Senha");

        jPasswordField1.setVisible(false);
        jPasswordField2.setVisible(false);
        jBntVerificar1.setVisible(false);
    }

    public boolean verificar() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement("select * from tabelaclientes where cpf = ? and login = ?");

            stmt.setString(1, jTextField1.getText());
            stmt.setString(2, jTextField2.getText());

            rs = stmt.executeQuery();

            if (rs.next()) {
                cpf = jTextField1.getText();
                jPasswordField1.setVisible(true);
                jPasswordField2.setVisible(true);
                jTextField1.setVisible(false);
                jTextField2.setVisible(false);
                jBntVerificar1.setVisible(true);
                jBntVerificar.setVisible(false);

                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return false;
    }

    public void modificar_senha() {
        Hospede h = new Hospede();
        HospedeDAO hdao = new HospedeDAO();

        h.setCpf(cpf);
        h.setSenha(jPasswordField1.getText());
        
        if(jPasswordField1.getText().equals(jPasswordField2.getText())){
            hdao.modificar_senha(h);
            Login l = new Login();
            
            l.setVisible(true);
            dispose();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLblFechar = new javax.swing.JLabel();
        jLblMinimizar = new javax.swing.JLabel();
        jLblVoltar = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jBntVerificar1 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBntVerificar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(70, 130, 180));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("SUNN", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jLabel11.setText("Hotel");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLblFechar.setFont(new java.awt.Font("SUNN", 1, 36)); // NOI18N
        jLblFechar.setForeground(new java.awt.Color(255, 255, 255));
        jLblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png"))); // NOI18N
        jLblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblFecharMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblFecharMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLblFecharMouseReleased(evt);
            }
        });
        jPanel3.add(jLblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        jLblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minus.png"))); // NOI18N
        jLblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblMinimizarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblMinimizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLblMinimizarMouseReleased(evt);
            }
        });
        jPanel3.add(jLblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        jLblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reply (1).png"))); // NOI18N
        jLblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblVoltarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLblVoltarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLblVoltarMouseReleased(evt);
            }
        });
        jPanel2.add(jLblVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 230, 40));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, 40));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, 40));

        jBntVerificar1.setBackground(new java.awt.Color(144, 238, 144));
        jBntVerificar1.setFont(new java.awt.Font("SUNN", 1, 28)); // NOI18N
        jBntVerificar1.setText("Modificar Senha");
        jBntVerificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVerificar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jBntVerificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 230, 40));
        jPanel2.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 230, 40));

        jLabel6.setFont(new java.awt.Font("SUNN", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Esqueceu a Senha");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jBntVerificar.setBackground(new java.awt.Color(144, 238, 144));
        jBntVerificar.setFont(new java.awt.Font("SUNN", 1, 28)); // NOI18N
        jBntVerificar.setText("Verificar");
        jBntVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBntVerificarActionPerformed(evt);
            }
        });
        jPanel2.add(jBntVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 230, 40));

        jLabel20.setFont(new java.awt.Font("SUNN", 1, 72)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Hotel");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 70));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/painel.png"))); // NOI18N
        jLabel21.setText("jLabel2");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 450, 560));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/265-swimming-pool-22-hotel-barcelo-costa-cancun_tcm7-126728.jpg"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblFecharMouseClicked
        // TODO add your handling code here:
        dispose();
        jLblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x vermelho.png")));
    }//GEN-LAST:event_jLblFecharMouseClicked

    private void jLblFecharMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblFecharMousePressed
        // TODO add your handling code here:
        jLblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x vermelho.png")));
    }//GEN-LAST:event_jLblFecharMousePressed

    private void jLblFecharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblFecharMouseReleased
        // TODO add your handling code here:
        jLblFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/x.png")));
    }//GEN-LAST:event_jLblFecharMouseReleased

    private void jLblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMinimizarMouseClicked
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLblMinimizarMouseClicked

    private void jBntVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVerificarActionPerformed
        verificar();
        // TODO add your handling code here:

    }//GEN-LAST:event_jBntVerificarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblVoltarMouseClicked
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLblVoltarMouseClicked

    private void jLblVoltarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblVoltarMousePressed
        // TODO add your handling code here:
        jLblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reply (2).png")));
    }//GEN-LAST:event_jLblVoltarMousePressed

    private void jLblVoltarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblVoltarMouseReleased
        // TODO add your handling code here:
        jLblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reply (1).png")));
    }//GEN-LAST:event_jLblVoltarMouseReleased

    private void jLblMinimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMinimizarMousePressed
        jLblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minimizar cinza.png")));
    }//GEN-LAST:event_jLblMinimizarMousePressed

    private void jLblMinimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblMinimizarMouseReleased
        jLblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minus.png")));
    }//GEN-LAST:event_jLblMinimizarMouseReleased

    private void jBntVerificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBntVerificar1ActionPerformed
        modificar_senha();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBntVerificar1ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EsqueciSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsqueciSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntVerificar;
    private javax.swing.JButton jBntVerificar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLblFechar;
    private javax.swing.JLabel jLblMinimizar;
    private javax.swing.JLabel jLblVoltar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}