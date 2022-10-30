/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.CrudFuncionarios;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;

public class Cadastro_Funcionarios extends javax.swing.JFrame {

    ResultSet rs;
    int q, i, id, deleteItem;

    ButtonGroup bg = new ButtonGroup();
  
    String image_path = null; 
    
    public Cadastro_Funcionarios() {
        initComponents();
         
//        Funcionario f = new Funcionario();
//        String data[] ={f.getNome(),f.getApelido(),f.getSexo(),f.getCategoria(),f.getMorada(),f.getContacto()};
//            DefaultTableModel tabel = (DefaultTableModel)tabela.getModel();
//            tabel.addRow(data);
//        
//        addItems();
//        
        bg.add(opM);
        bg.add(opF);
//        preecherDadosTabel();
    }

//    public void upDateDB() {
//        try {
//
//            ResultSetMetaData stData = rs.getMetaData();
//
//            q = stData.getColumnCount();
//
//            DefaultTableModel recordTable = (DefaultTableModel) tabela.getModel();
//            recordTable.setRowCount(0);//Atencao
//
//            while (rs.next()) {
//                Vector columnData = new Vector();
//
//                for (i = 1; i <= q; i++) {
//
//                    columnData.add(rs.getString("id"));
//                    columnData.add(rs.getString("Nome"));
//                    columnData.add(rs.getString("Apelido"));
//                    columnData.add(rs.getString("Sexo"));
//                    columnData.add(rs.getString("Categoria"));
//                    columnData.add(rs.getString("Morada"));
//                    columnData.add(rs.getString("Contacto"));
//
//                }
//                recordTable.addRow(columnData);
//
//            }
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.toString());
//
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
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
        btnAdicionar = new javax.swing.JButton();
        lbOnlyNumbers = new javax.swing.JLabel();
        comboCategorias = new javax.swing.JComboBox<>();
        perfil = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnImprimir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        iconPesquisa = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        labelFoto = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestao de Funcionarios");
        setBackground(new java.awt.Color(153, 51, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(54, 156, 175));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 233, 246), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 13, -1, -1));

        jPanel2.setBackground(new java.awt.Color(54, 156, 175));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("Gestao de Funcionarios");

        btnVoltar.setBackground(new java.awt.Color(54, 76, 109));
        btnVoltar.setText("Back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 60));

        jPanel3.setBackground(new java.awt.Color(54, 156, 175));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtNome.setToolTipText("Digite o nome neste campo");
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNomeMouseEntered(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        jPanel3.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apelido");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtApelido.setToolTipText("Digite o apelio neste campo");
        txtApelido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApelidoKeyPressed(evt);
            }
        });
        jPanel3.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 250, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categoria");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblPerfilFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Medical-Nurse-Female-Dark-icon.png"))); // NOI18N
        jPanel3.add(lblPerfilFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 30, 50, 60));

        opM.setText("Masculino");
        jPanel3.add(opM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        opF.setText("Feminino");
        jPanel3.add(opF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        txtMorada.setToolTipText("Digite a morada neste campo");
        txtMorada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMoradaKeyPressed(evt);
            }
        });
        jPanel3.add(txtMorada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Morada");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        txtContacto.setToolTipText("Digite apenas nrs validos, +25");
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
        jPanel3.add(txtContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contacto");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

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
        jPanel3.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 40, 40));

        btnAdicionar.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/User-Interface-Plus-icon (1).png"))); // NOI18N
        btnAdicionar.setToolTipText("Addicionar funcionario");
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseEntered(evt);
            }
        });
        jPanel3.add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 40, 40));

        lbOnlyNumbers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbOnlyNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 250, 10));

        comboCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enfermeiro", "Medico", "Dentista", "Farmaceutico", "Ortopedista", "Genicologista" }));
        jPanel3.add(comboCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 580, 330));

        perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Places-user-identity-icon.png"))); // NOI18N
        perfil.setToolTipText("Usuario");
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilMouseEntered(evt);
            }
        });
        jPanel5.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 60));

        tabela.setBackground(new java.awt.Color(145, 227, 246));
        tabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabela.setForeground(new java.awt.Color(0, 213, 213));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tabela.setToolTipText("");
        tabela.setGridColor(new java.awt.Color(145, 227, 246));
        tabela.setSelectionBackground(new java.awt.Color(145, 227, 246));
        tabela.setSelectionForeground(new java.awt.Color(145, 227, 246));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 930, 230));

        btnImprimir.setBackground(new java.awt.Color(255, 255, 255));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_print_black_24dp.png"))); // NOI18N
        btnImprimir.setToolTipText("Documentar os dados em pdf");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnImprimirMouseEntered(evt);
            }
        });
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel5.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 40, 40));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_refresh_black_24dp.png"))); // NOI18N
        btnLimpar.setToolTipText("Limpar os campos");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimparMouseEntered(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel5.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 40, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_delete_black_24dp.png"))); // NOI18N
        btnEliminar.setToolTipText("Excluir funcionario dos registros");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel5.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, 40, 40));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        iconPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        iconPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        iconPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ic_search_black_24dp.png"))); // NOI18N

        jTextField1.setToolTipText("pesquisar");
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
            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(iconPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 240, 40));

        labelFoto.setText(" ");
        jPanel5.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 160, 140));

        btnFoto.setText("Escolha foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel5.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 860));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_perfilMouseEntered

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtNome.getText().equals("") || txtApelido.getText().equals("") || txtCategoria.getText().equals("") || txtMorada.getText().equals("")
                || txtContacto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txtNome.setForeground(Color.red);
            txtApelido.setForeground(Color.red);
            txtCategoria.setForeground(Color.red);
            txtMorada.setForeground(Color.red);
            txtContacto.setForeground(Color.red);
        } else {

             txtNome.setForeground(Color.white);
            txtApelido.setForeground(Color.white);
            txtCategoria.setForeground(Color.white);
            txtMorada.setForeground(Color.white);
            txtContacto.setForeground(Color.white);
            
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
            addItems();            
            
//            upDateDB();
            
            txtNome.setText("");
            txtApelido.setText("");
            txtCategoria.setText("");
            txtMorada.setText("");
            txtContacto.setText("");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    //Metodo que adiciona os dados na tabela
    public void addItems(){
        String data[] ={txtNome.getText(),txtApelido.getText(),txtCategoria.getText(),txtContacto.getText()};
            DefaultTableModel tabel = (DefaultTableModel)tabela.getModel();
            tabel.addRow(data);
    }
    
    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparMouseEntered

    private void btnImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirMouseEntered

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

    private void txtMoradaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMoradaKeyPressed

        //Slatar de campo ao se clicar enter
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtContacto.requestFocus();
        }

    }//GEN-LAST:event_txtMoradaKeyPressed

    private void txtContactoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactoKeyPressed
        char a = evt.getKeyChar();
        if (Character.isLetter(a)) {
            txtContacto.setEditable(false);
            //o campo fica desabilitado ao ser digitado caracteres
            txtContacto.setBackground(Color.red);
            lbOnlyNumbers.setText("Digite apenas numeros");
            lbOnlyNumbers.setForeground(Color.red);

        } else {
            txtContacto.setEditable(true);
            lbOnlyNumbers.setVisible(false);
            txtContacto.setBackground(Color.white);
        }
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
            if (opM.isSelected()) {
                func.setSexo(opM.getText());
            } else if (opF.isSelected()) {
                func.setSexo(opF.getText());
            }
           
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

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //A ideia reside em limpar os campos
        txtNome.setText("");
        txtApelido.setText("");
        txtCategoria.setText("");
        txtMorada.setText("");
        txtContacto.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        //Metodo para colocar em pdf os dados salvos

        MessageFormat header = new MessageFormat("Baixando o arquivo...");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            tabela.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {

            System.err.format("No printer ", e.getMessage());
        }


    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        //Selecione  alguma imagem e adicione na label
        String diretorio =null;
        JFileChooser chooser = new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //extensao do ficheiro
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*Images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        
        //Verificar se o usuario de facto selecionou alguma imagem
        if(filestate == JFileChooser.APPROVE_OPTION){
            
            File selectedImage = chooser.getSelectedFile();
            diretorio = selectedImage.getAbsolutePath();
            labelFoto.setText(diretorio);
                    
            
        }
        
        
//        public ImageIcon resetImageSize (String foto,byte[] photo){ 
//             ImageIcon myPhoto = null;
//             if(foto!=null){
//                 myPhoto = new ImageIcon (foto);
//             }else{
//                  myPhoto = new ImageIcon(foto);
//                 
//             }
//             Image img = myPhoto.getImage();
//             Image img1 = img.getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(),
//                     Image.SCALE_SMOOTH);
//             ImageIcon ph = new ImageIcon(img1);
//             return ph;
//        
//
//
//
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DefaultTableModel recordTable = (DefaultTableModel)tabela.getModel();
        int selectedRows = tabela.getSelectedRow();
        
        try {
             id = Integer.parseInt(recordTable.getValueAt(selectedRows, 0).toString());
             
             deleteItem = JOptionPane.showConfirmDialog(null,"pretende de facto eliminar estes dados?","Warning",JOptionPane.YES_NO_OPTION);
             
             if(deleteItem == JOptionPane.YES_OPTION){
                 
                 Funcionario func = new Funcionario();
                 CrudFuncionarios crud = new CrudFuncionarios();
                 
//                 func.setId(1, id);
                 crud.delete(func);
                 
             }
             
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        DefaultTableModel recordTable = (DefaultTableModel)tabela.getModel();
        int selectedRows = tabela.getSelectedRow();
        txtNome.setText(recordTable.getValueAt(selectedRows, 0).toString());
        txtApelido.setText(recordTable.getValueAt(selectedRows, 1).toString());
//       
//            opM
//        } else if (opF.isSelected()) {
//            func.setSexo(opF.getText());
//        }
//        txtCategoria.setText(recordTable.getValueAt(selectedRows, 3).toString());
        txtMorada.setText(recordTable.getValueAt(selectedRows, 4).toString());
        txtContacto.setText(recordTable.getValueAt(selectedRows, 5).toString());
        
    }//GEN-LAST:event_tabelaMouseClicked

    private void txtNomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMouseEntered

    public void preecherDadosTabel(){
        DefaultTableModel modelo = (DefaultTableModel)tabela.getModel();
        ArrayList<Funcionario> f = new CrudFuncionarios().read();
//        crud.read();
        for(Funcionario fuc: f){
            
            modelo.addRow(new Object[]{
                    fuc.getId(),
                    fuc.getNome(),
                    fuc.getApelido(),
                    fuc.getSexo(),
                    fuc.getCategoria(),
                    fuc.getMorada(),
                    fuc.getContacto()
                    
                    
                    
            }
                    );
            
        }
            tabela.setModel(modelo);
            
    }
    
    
    
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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> comboCategorias;
    private javax.swing.JLabel iconPesquisa;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel lbOnlyNumbers;
    private javax.swing.JLabel lblPerfilFuncionarios;
    private javax.swing.JRadioButton opF;
    private javax.swing.JRadioButton opM;
    private javax.swing.JLabel perfil;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

