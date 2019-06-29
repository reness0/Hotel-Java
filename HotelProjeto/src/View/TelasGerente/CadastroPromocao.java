/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.TelasGerente;

import View.TelasRecepcionista.MenuRecepcionista;
import com.placeholder.PlaceHolder;
import conexao.ConnectionFactory;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.bean.Quarto;
import model.bean.Servico;
import model.dao.QuartoDAO;
import model.dao.ServicoDAO;

/**
 *
 * @author sousa
 */
public class CadastroPromocao extends javax.swing.JFrame {
PlaceHolder texto;
    /**
     * Creates new form CadastroPromocao
     */
    public CadastroPromocao() {
        initComponents();
        listarQuartos();
        listarServicos();
        
        texto = new PlaceHolder(txtPreco, "Preço (00.00)");
        
    }

 

    public void setar_servicos() {
        int setarSer = jTable5.getSelectedRow();
        Integer valorSer = (Integer) jTable5.getModel().getValueAt(setarSer, 0);
        Servico s = new Servico();
        ServicoDAO sdao = new ServicoDAO();

        s.setId(valorSer);
        s.setPreco(Float.parseFloat(txtPreco.getText()));
        s.setPromocao("Promoção");

        sdao.promocao(s);

    }

   

    public void listarQuartos() {
        DefaultTableModel tabela = (DefaultTableModel) jTable4.getModel();
        QuartoDAO qDAO = new QuartoDAO();

        for (Quarto h : qDAO.listar()) {
            tabela.addRow(new Object[]{
                h.getId(),
                h.getPreco(),
                h.getAndar(),
                h.getNumQuarto(),});

        }

    }

    public void listarServicos() {
        DefaultTableModel tabela = (DefaultTableModel) jTable5.getModel();
        ServicoDAO qDAO = new ServicoDAO();

        for (Servico q : qDAO.listar()) {
            tabela.addRow(new Object[]{
                q.getId(),
                q.getPreco(),
                q.getHorario(),
                q.getCategoria(),});

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

        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLblLogo2 = new javax.swing.JLabel();
        jLblFechar = new javax.swing.JLabel();
        jLblMinimizar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel7.setPreferredSize(new java.awt.Dimension(840, 591));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("SUNN", 1, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Selecione no que deseja cadastrar: ");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, 30));

        jButton4.setBackground(new java.awt.Color(144, 238, 144));
        jButton4.setFont(new java.awt.Font("SUNN", 0, 26)); // NOI18N
        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 150, -1));

        jLabel14.setFont(new java.awt.Font("SUNN", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Servicos:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, 30));

        jLabel13.setFont(new java.awt.Font("SUNN", 1, 30)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quartos:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 30));

        jLabel11.setFont(new java.awt.Font("SUNN", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cadastrar Promocão");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jTable5.setBackground(new java.awt.Color(176, 224, 230));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Preço", "Horário", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setResizable(false);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setResizable(false);
            jTable5.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 610, 160));

        jLabel1.setFont(new java.awt.Font("SUNN", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Novo preco: ");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel7.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 190, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quarto", "Serviço" }));
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 190, 30));

        jTable4.setBackground(new java.awt.Color(176, 224, 230));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Preço", "Andar", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 610, 110));

        jPanel8.setBackground(new java.awt.Color(70, 130, 180));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblLogo2.setFont(new java.awt.Font("SUNN", 1, 24)); // NOI18N
        jLblLogo2.setForeground(new java.awt.Color(255, 255, 255));
        jLblLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/star.png"))); // NOI18N
        jLblLogo2.setText("Hotel");
        jPanel8.add(jLblLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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
        jPanel8.add(jLblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 30, 30));

        jLblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/minus.png"))); // NOI18N
        jLblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblMinimizarMouseClicked(evt);
            }
        });
        jPanel8.add(jLblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reply (1).png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel12MouseReleased(evt);
            }
        });
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/painel.png"))); // NOI18N
        jLabel4.setText("jLabel2");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 670, 560));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/265-swimming-pool-22-hotel-barcelo-costa-cancun_tcm7-126728.jpg"))); // NOI18N
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:

    }//GEN-LAST:event_jLblMinimizarMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        MenuGerente l = new MenuGerente();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reply (2).png")));
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseReleased
        // TODO add your handling code here:
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/reply (1).png")));
    }//GEN-LAST:event_jLabel12MouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
         if (jComboBox1.getSelectedItem().equals("Quarto")) {
            
            int setar = jTable4.getSelectedRow();

            Integer valor = (Integer) jTable4.getModel().getValueAt(setar, 0);

            Quarto q = new Quarto();
            QuartoDAO qdao = new QuartoDAO();

            q.setDisponivel("Promoção");
            q.setId(valor);
            q.setPreco(Float.valueOf(txtPreco.getText()));
            qdao.promocao(q);

        } else {
            jTable4.setVisible(false);
            setar_servicos();

        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPromocao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPromocao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblFechar;
    private javax.swing.JLabel jLblLogo2;
    private javax.swing.JLabel jLblMinimizar;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
