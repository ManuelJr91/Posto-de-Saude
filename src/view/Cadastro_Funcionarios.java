/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CrudFuncionarios;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

public class Cadastro_Funcionarios extends javax.swing.JFrame {

    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    
    ButtonGroup bg = new ButtonGroup();

    public Cadastro_Funcionarios() {
        initComponents();
        JRadioButton opM = new JRadioButton("Masculino");

        JRadioButton opF = new JRadioButton("Feminino");

        bg.add(opM);
        bg.add(opF);
    }
    
    
    public void upDateDB() {
        try {
            
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();

            DefaultTableModel recordTable = (DefaultTableModel) tabela.getModel();
            recordTable.setRowCount(0);//Atencao

            while (rs.next()) {
                Vector columnData = new Vector();

                for (i = 1; i <= q; i++) {

                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("Nome"));
                    columnData.add(rs.getString("Apelido"));
                    columnData.add(rs.getString("Sexo"));
                    columnData.add(rs.getString("Categoria"));
                    columnData.add(rs.getString("Morada"));
                    columnData.add(rs.getString("Contacto"));

                }
                recordTable.addRow(columnData);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());

        }
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblPerfilFuncionarios = new javax.swing.JLabel();
        opM = new javax.swing.JRadioButton();
        opF = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtMorada = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        perfil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        iconPesquisa = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestao de Funcionarios");
        setBackground(new java.awt.Color(153, 51, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(54, 76, 109));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 13, -1, -1));

        jPanel2.setBackground(new java.awt.Color(54, 76, 109));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestao de Funcionarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 60));

        jPanel3.setBackground(new java.awt.Color(54, 76, 109));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apelido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtApelido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApelido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApelidoKeyPressed(evt);
            }
        });
        jPanel3.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 250, -1));

        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyPressed(evt);
            }
        });
        jPanel3.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Categoria");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblPerfilFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Medical-Nurse-Female-Dark-icon.png"))); // NOI18N
        jPanel3.add(lblPerfilFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 30, 50, 60));

        opM.setText("Masculino");
        jPanel3.add(opM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, -1, -1));

        opF.setText("Feminino");
        jPanel3.add(opF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Sexo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        txtMorada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMorada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMoradaKeyPressed(evt);
            }
        });
        jPanel3.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Morada");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txtContacto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContacto.setToolTipText("Digite um nr valido +25");
        txtContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtContactoMouseEntered(evt);
            }
        });
        txtContacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactoKeyPressed(evt);
            }
        });
        jPanel3.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Contacto");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_save_black_24dp.png"))); // NOI18N
        btnSave.setToolTipText("Gravar");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnSave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSaveKeyPressed(evt);
            }
        });
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 40, 40));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/User-Interface-Plus-icon (1).png"))); // NOI18N
        jButton5.setToolTipText("Addicionar funcionario");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 40, 40));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 580, 400));

        jPanel4.setBackground(new java.awt.Color(54, 76, 109));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 300, 220));

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Places-user-identity-icon.png"))); // NOI18N
        perfil.setToolTipText("Usuario");
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilMouseEntered(evt);
            }
        });
        jPanel5.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 60));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Apelido", "Sexo", "Categoria", "Morada", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 960, 230));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_print_black_24dp.png"))); // NOI18N
        jButton1.setToolTipText("Documentar os dados em pdf");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 40, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_refresh_black_24dp.png"))); // NOI18N
        jButton2.setToolTipText("Limpar os campos");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 40, 40));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_delete_black_24dp.png"))); // NOI18N
        jButton3.setToolTipText("Excluir funcionario dos registros");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 40, 40));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        iconPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        iconPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_search_black_24dp.png"))); // NOI18N

        jTextField1.setBorder(null);

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_clear_black_24dp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(iconPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(iconPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 240, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 860));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_perfilMouseEntered

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Funcionario func = new Funcionario();
        CrudFuncionarios crud = new CrudFuncionarios();

        func.setNome(txtNome.getText());
        func.setApelido(txtApelido.getText());
        if (opM.isSelected()) {
            func.setSexo(opM.getText());
        } else if (opF.isSelected()) {
            func.setSexo(opF.getText());
        }
        func.setCategoria(txtCategoria.getText());
        func.setMorada(txtMorada.getText());
        func.setContacto(txtContacto.getText());

        crud.save(func);
        upDateDB();
        JOptionPane.showMessageDialog(null, "Funcionario Registado com Sucesso");

        txtNome.setText("");
        txtApelido.setText("");
        txtCategoria.setText("");
        txtMorada.setText("");
        txtContacto.setText("");


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void txtContactoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContactoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactoMouseEntered

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApelido.requestFocus();
        }

    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtApelidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApelidoKeyPressed

        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCategoria.requestFocus();
        }


    }//GEN-LAST:event_txtApelidoKeyPressed

    private void txtCategoriaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyPressed
        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMorada.requestFocus();
        }


    }//GEN-LAST:event_txtCategoriaKeyPressed

    private void txtMoradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMoradaKeyPressed

        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContacto.requestFocus();
        }

    }//GEN-LAST:event_txtMoradaKeyPressed

    private void txtContactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyPressed

        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSave.requestFocus();
        }

    }//GEN-LAST:event_txtContactoKeyPressed

    private void btnSaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSaveKeyPressed
        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            Funcionario func = new Funcionario();
            CrudFuncionarios crud = new CrudFuncionarios();

            func.setNome(txtNome.getText());
            func.setApelido(txtApelido.getText());
            if () {

            }
            func.setSexo(sexo);
            func.setCategoria(txtCategoria.getText());
            func.setMorada(txtMorada.getText());
            func.setContacto(txtContacto.getText());

            crud.save(func);
            JOptionPane.showMessageDialog(null, "Funcionario Registado com Sucesso");

            txtNome.setText("");
            txtApelido.setText("");
            txtCategoria.setText("");
            txtMorada.setText("");
            txtContacto.setText("");

        }


    }//GEN-LAST:event_btnSaveKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //A ideia reside em limpar os campos
        txtNome.setText("");
        txtApelido.setText("");
        txtCategoria.setText("");
        txtMorada.setText("");
        txtContacto.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //Metodo para colocar em pdf os dados salvos
        
        MessageFormat header = new MessageFormat("Priting in progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            tabela.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {

            System.err.format("No printer ", e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Funcionarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel iconPesquisa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblPerfilFuncionarios;
    private javax.swing.JRadioButton opF;
    private javax.swing.JRadioButton opM;
    private javax.swing.JLabel perfil;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
