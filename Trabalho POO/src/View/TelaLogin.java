/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import static java.awt.Event.ENTER;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Leticia
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamJan = getSize();
          setLocation(new Point((tamTela.width - tamJan.width)/2,
          (tamTela.height - tamJan.height)/2));
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
        lblUSUARIO = new javax.swing.JLabel();
        lblSENHA = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelChavelLogin = new javax.swing.JLabel();
        FUNDO = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(null);

        lblUSUARIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUSUARIO.setText("Usuário:");
        getContentPane().add(lblUSUARIO);
        lblUSUARIO.setBounds(210, 100, 60, 17);

        lblSENHA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSENHA.setText("Senha:");
        getContentPane().add(lblSENHA);
        lblSENHA.setBounds(210, 150, 60, 17);

        jTextFieldUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(270, 100, 140, 21);

        jPasswordFieldSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPasswordFieldSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(270, 150, 140, 21);

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEntrar);
        jButtonEntrar.setBounds(210, 200, 80, 30);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(340, 200, 70, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuário (4).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 130, 130);

        jLabelChavelLogin.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelChavelLogin.setText("Broad Business");
        getContentPane().add(jLabelChavelLogin);
        jLabelChavelLogin.setBounds(140, 20, 160, 24);

        FUNDO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FUNDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Img1.jpg"))); // NOI18N
        FUNDO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(FUNDO);
        FUNDO.setBounds(0, 0, 470, 320);

        setBounds(0, 0, 465, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
     if(jTextFieldUsuario.getText().equals("Elimar")&&jPasswordFieldSenha.getText().equals("1234")
        ||jTextFieldUsuario.getText().equals("Luis")&&jPasswordFieldSenha.getText().equals("1234")
        ||jTextFieldUsuario.getText().equals("Solange")&&jPasswordFieldSenha.getText().equals("1234")
        ||jTextFieldUsuario.getText().equals("Cassia")&&jPasswordFieldSenha.getText().equals("1234")){
        TelaPrincipal tela = new TelaPrincipal();
                      tela.setVisible(true);
        dispose();
    }                                              
        else{
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!");
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
   System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jPasswordFieldSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaKeyPressed
  if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        if(jTextFieldUsuario.getText().equals("Elimar")&&jPasswordFieldSenha.getText().equals("1234")
           ||jTextFieldUsuario.getText().equals("Luiz")&&jPasswordFieldSenha.getText().equals("1234")
           ||jTextFieldUsuario.getText().equals("Cassia")&&jPasswordFieldSenha.getText().equals("1234")
           ||jTextFieldUsuario.getText().equals("Solange")&&jPasswordFieldSenha.getText().equals("1234")){
        TelaPrincipal tela = new TelaPrincipal();
                      tela.setVisible(true);
        dispose();
    }                                              
        else{
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado!");
        }
    }//GEN-LAST:event_jPasswordFieldSenhaKeyPressed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FUNDO;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelChavelLogin;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JLabel lblSENHA;
    private javax.swing.JLabel lblUSUARIO;
    // End of variables declaration//GEN-END:variables
}
