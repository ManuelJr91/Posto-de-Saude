/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Maloa Jr
 */
public class Login_Form extends javax.swing.JFrame {

    /**
     * Creates new form Login_Form
     */
    public Login_Form() {
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
        painelLogo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        painelComponentes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblNotifica = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRecoverSenha = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnFormulario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        painelLogo.setBackground(new java.awt.Color(0, 51, 153));
        painelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        painelLogo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 218, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registe-se para aceder ao sistema");
        jLabel6.setToolTipText("");
        painelLogo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("O Nosso Maior valor e a vida");
        painelLogo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 260, 40));

        jLabel3.setBackground(new java.awt.Color(0, 51, 153));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Health-Sign-blue-icon.png"))); // NOI18N
        jLabel3.setText("Bem Vindo");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        painelLogo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 430));

        painelComponentes.setBackground(new java.awt.Color(255, 255, 255));
        painelComponentes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N
        painelComponentes.setForeground(new java.awt.Color(0, 51, 153));
        painelComponentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/avatar-de-perfil (1).png"))); // NOI18N
        painelComponentes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, 70));

        lblUsuario.setText("Usuario");
        painelComponentes.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        lblSenha.setText("Senha");
        painelComponentes.add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 40, -1));

        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        painelComponentes.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, 30));

        txtSenha.setBorder(null);
        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaMouseClicked(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        painelComponentes.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, 30));

        btnLogin.setBackground(new java.awt.Color(0, 51, 153));
        btnLogin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Entrar");
        painelComponentes.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 51, 153));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelComponentes.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        lblNotifica.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblNotifica.setForeground(new java.awt.Color(255, 255, 255));
        lblNotifica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNotifica.setText("O Nosso Maior valor e a vida");
        painelComponentes.add(lblNotifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("Esqueceu a senha?/");
        painelComponentes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 110, -1));

        btnRecoverSenha.setBackground(new java.awt.Color(255, 255, 255));
        btnRecoverSenha.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRecoverSenha.setText("Click aqui");
        btnRecoverSenha.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        painelComponentes.add(btnRecoverSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));
        painelComponentes.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 30, 30));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/olhos-abertos.png"))); // NOI18N
        painelComponentes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 240, 20, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        painelComponentes.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        painelComponentes.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 192, 220, 10));

        painelLogo.add(painelComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 0, 300, 430));

        btnFormulario.setBackground(new java.awt.Color(0, 51, 204));
        btnFormulario.setForeground(new java.awt.Color(255, 255, 255));
        btnFormulario.setText("Criar Conta");
        btnFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormularioActionPerformed(evt);
            }
        });
        painelLogo.add(btnFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bem Vindo");
        painelLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormularioActionPerformed
        
        Formulario_Cadastro f = new Formulario_Cadastro();
        f.show();
        dispose();
    }//GEN-LAST:event_btnFormularioActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
      int response = JOptionPane.showConfirmDialog(this,"Deseja sair e encerrar o sistema?","Sim",JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
      
      if(response==JOptionPane.YES_OPTION){
          System.out.println("Sitema encerrado!");
          System.exit(0);
      }else{
          
      }


    }//GEN-LAST:event_btnSairActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked

        Ocultar(true);

    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked

        Ocultar(false);
    }//GEN-LAST:event_txtSenhaMouseClicked

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }
    
    public void Ocultar(boolean isUsername){
        if(isUsername){
            lblUsuario.setVisible(false);
            if(txtSenha.getText().length()==0){
                lblSenha.setVisible(true);
            }
        }else{
            lblSenha.setVisible(false);
            if(txtUsuario.getText().length()==0){
                lblUsuario.setVisible(true);
            }
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormulario;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRecoverSenha;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNotifica;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painelComponentes;
    private javax.swing.JPanel painelLogo;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
