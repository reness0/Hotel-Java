/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TelasGerente;

import View.TelasGerais.Login;
import conexao.ConnectionFactory;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rebeca
 */
public class MenuGerente extends javax.swing.JFrame {

    /**
     * Creates new form MenuADM
     */
    public MenuGerente() {
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

        jPanel3 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLblVoltar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jBtnMaisUsados = new javax.swing.JButton();
        jBtnRecepcionista = new javax.swing.JButton();
        jBtnQuarto = new javax.swing.JButton();
        jBtnConsultaRecepcionista = new javax.swing.JButton();
        jBtnServico = new javax.swing.JButton();
        jBtnPromocoes = new javax.swing.JButton();
        jBtnEditarHospede = new javax.swing.JButton();
        jBtnEditarReserva = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jBtnRelatorio = new javax.swing.JButton();
        jBtnRelatorio1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLblLogo = new javax.swing.JLabel();
        jLblFechar = new javax.swing.JLabel();
        jLblMinimizar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane2.setOpaque(false);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel3.add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 550, 430));

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
        jPanel3.add(jLblVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 40, 30));

        jPanel4.setBackground(new java.awt.Color(70, 130, 180));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnMaisUsados.setBackground(new java.awt.Color(70, 130, 180));
        jBtnMaisUsados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnMaisUsados.setForeground(new java.awt.Color(255, 255, 255));
        jBtnMaisUsados.setText("Listas de quartos mais usados");
        jBtnMaisUsados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMaisUsadosActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnMaisUsados, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 210, 30));

        jBtnRecepcionista.setBackground(new java.awt.Color(70, 130, 180));
        jBtnRecepcionista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnRecepcionista.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRecepcionista.setText("Recepcionista");
        jBtnRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRecepcionistaActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 150, -1));

        jBtnQuarto.setBackground(new java.awt.Color(70, 130, 180));
        jBtnQuarto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnQuarto.setForeground(new java.awt.Color(255, 255, 255));
        jBtnQuarto.setText("Quarto");
        jBtnQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnQuartoActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnQuarto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 120, -1));

        jBtnConsultaRecepcionista.setBackground(new java.awt.Color(70, 130, 180));
        jBtnConsultaRecepcionista.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnConsultaRecepcionista.setForeground(new java.awt.Color(255, 255, 255));
        jBtnConsultaRecepcionista.setText("Consultar Recepcionista");
        jBtnConsultaRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultaRecepcionistaActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnConsultaRecepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 180, 20));

        jBtnServico.setBackground(new java.awt.Color(70, 130, 180));
        jBtnServico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnServico.setForeground(new java.awt.Color(255, 255, 255));
        jBtnServico.setText("Serviço");
        jBtnServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnServicoActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 30));

        jBtnPromocoes.setBackground(new java.awt.Color(70, 130, 180));
        jBtnPromocoes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnPromocoes.setForeground(new java.awt.Color(255, 255, 255));
        jBtnPromocoes.setText("Promoções");
        jBtnPromocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPromocoesActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnPromocoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, 30));

        jBtnEditarHospede.setBackground(new java.awt.Color(70, 130, 180));
        jBtnEditarHospede.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnEditarHospede.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEditarHospede.setText("Editar Hóspede");
        jBtnEditarHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarHospedeActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnEditarHospede, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 180, 30));

        jBtnEditarReserva.setBackground(new java.awt.Color(70, 130, 180));
        jBtnEditarReserva.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnEditarReserva.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEditarReserva.setText("Editar Reservas");
        jBtnEditarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarReservaActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnEditarReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 130, 50));

        jLabel4.setFont(new java.awt.Font("SUNN", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Relatórios e listas");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 20));

        jLabel5.setFont(new java.awt.Font("SUNN", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastros:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -11, -1, 40));

        jLabel9.setFont(new java.awt.Font("SUNN", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consultar e editar: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, -1, 40));

        jBtnRelatorio.setBackground(new java.awt.Color(70, 130, 180));
        jBtnRelatorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRelatorio.setText("Hóspedes");
        jBtnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRelatorioActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 100, 20));

        jBtnRelatorio1.setBackground(new java.awt.Color(70, 130, 180));
        jBtnRelatorio1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBtnRelatorio1.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRelatorio1.setText("Quartos");
        jBtnRelatorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRelatorio1ActionPerformed(evt);
            }
        });
        jPanel4.add(jBtnRelatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 110, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 70));

        jLabel6.setFont(new java.awt.Font("SUNN", 1, 52)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gerente");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        jPanel5.setBackground(new java.awt.Color(70, 130, 180));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblLogo.setFont(new java.awt.Font("SUNN", 1, 24)); // NOI18N
        jLblLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jLblLogo.setText("Hotel");
        jPanel5.add(jLblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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
        jPanel5.add(jLblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        jLblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minus.png"))); // NOI18N
        jLblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblMinimizarMouseClicked(evt);
            }
        });
        jPanel5.add(jLblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/painel.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 690, 530));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/265-swimming-pool-22-hotel-barcelo-costa-cancun_tcm7-126728.jpg"))); // NOI18N
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void jBtnMaisUsadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMaisUsadosActionPerformed
        // TODO add your handling code here:
        ListarQuartosMaisUsados ch = new ListarQuartosMaisUsados();
        ch.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnMaisUsadosActionPerformed

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
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLblMinimizarMouseClicked

    private void jBtnRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRecepcionistaActionPerformed
        // TODO add your handling code here:
        CadastroRecepcionista cr = new CadastroRecepcionista();
        jDesktopPane2.add(cr);
        cr.setVisible(true);
        ((BasicInternalFrameUI)cr.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jBtnRecepcionistaActionPerformed

    private void jBtnQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnQuartoActionPerformed
        // TODO add your handling code here:
        CadastroQuarto cs = new CadastroQuarto();
        jDesktopPane2.add(cs);
        cs.setVisible(true);
        ((BasicInternalFrameUI)cs.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jBtnQuartoActionPerformed

    private void jBtnConsultaRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConsultaRecepcionistaActionPerformed
        // TODO add your handling code here:
        ConsultarRecepcionista cr = new ConsultarRecepcionista();
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnConsultaRecepcionistaActionPerformed

    private void jBtnServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnServicoActionPerformed
        // TODO add your handling code here:
        CadastroServico cs = new CadastroServico();
        jDesktopPane2.add(cs);
        cs.setVisible(true);
        ((BasicInternalFrameUI)cs.getUI()).setNorthPane(null);
    }//GEN-LAST:event_jBtnServicoActionPerformed

    private void jBtnPromocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPromocoesActionPerformed
        // TODO add your handling code here:
        CadastroPromocao cp = new CadastroPromocao();
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnPromocoesActionPerformed

    private void jBtnEditarHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarHospedeActionPerformed
        // TODO add your handling code here:
        EditarHospede eh = new EditarHospede();
        eh.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnEditarHospedeActionPerformed

    private void jBtnEditarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarReservaActionPerformed
        // TODO add your handling code here:
        EditarReservas eh = new EditarReservas();
        eh.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtnEditarReservaActionPerformed

    private void jBtnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRelatorioActionPerformed
        
        Connection con = ConnectionFactory.getConnection();
        
        try {
            
            JasperPrint print = JasperFillManager.fillReport("C:/Users/rene_/Documents/Programação/Reports/tabelaHospede.jasper",null,con);
            
            
            JasperViewer.viewReport(print, false);
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            ConnectionFactory.closeConnection(con);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnRelatorioActionPerformed

    private void jBtnRelatorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRelatorio1ActionPerformed
        // TODO add your handling code here:
        
        Connection con = ConnectionFactory.getConnection();
        
        try {
            
            JasperPrint print = JasperFillManager.fillReport("C:/Users/rene_/Documents/Programação/Reports/tabelaQuarto.jasper",null,con);
            
            
            JasperViewer.viewReport(print, false);
            
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            ConnectionFactory.closeConnection(con);
        }
    }//GEN-LAST:event_jBtnRelatorio1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConsultaRecepcionista;
    private javax.swing.JButton jBtnEditarHospede;
    private javax.swing.JButton jBtnEditarReserva;
    private javax.swing.JButton jBtnMaisUsados;
    private javax.swing.JButton jBtnPromocoes;
    private javax.swing.JButton jBtnQuarto;
    private javax.swing.JButton jBtnRecepcionista;
    private javax.swing.JButton jBtnRelatorio;
    private javax.swing.JButton jBtnRelatorio1;
    private javax.swing.JButton jBtnServico;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLblFechar;
    private javax.swing.JLabel jLblLogo;
    private javax.swing.JLabel jLblMinimizar;
    private javax.swing.JLabel jLblVoltar;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
