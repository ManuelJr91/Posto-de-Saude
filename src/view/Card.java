/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;


public class Card extends javax.swing.JPanel {

    
    private Color color1;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    public Color getColor4() {
        return color4;
    }

    public void setColor4(Color color4) {
        this.color4 = color4;
    }

    public JLabel getLblDescricao() {
        return lblDescricao;
    }

    public void setLblDescricao(JLabel lblDescricao) {
        this.lblDescricao = lblDescricao;
    }

    public JLabel getLblIcon() {
        return lblIcon;
    }

    public void setLblIcon(JLabel lblIcon) {
        this.lblIcon = lblIcon;
    }

    public JLabel getLblMedicamentos() {
        return lblMedicamentos;
    }

    public void setLblMedicamentos(JLabel lblMedicamentos) {
        this.lblMedicamentos = lblMedicamentos;
    }

    public JLabel getLblPacientes() {
        return lblPacientes;
    }

    public void setLblPacientes(JLabel lblPacientes) {
        this.lblPacientes = lblPacientes;
    }
    private Color color2;
    private Color color3;
    private Color color4;
    
    
    public Card() {
        initComponents();
        setOpaque(false);
        color1=Color.BLACK;
        color2=Color.WHITE;
        
        
        
    }
    public void setData(Model_Card data){
        lblIcon.setIcon(data.getIcon());
        lblMedicamentos.setText(data.getTitle());
        lblPacientes.setText(data.getValues());
        lblDescricao.setText(data.getDescriptions());
        
    }
    
    protected void paintComponent(Graphics grpes){
        
        super.paintComponent(grpes);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblMedicamentos = new javax.swing.JLabel();
        lblPacientes = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/People-Doctor-Female-icon (2).png"))); // NOI18N

        lblMedicamentos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblMedicamentos.setForeground(new java.awt.Color(255, 255, 255));
        lblMedicamentos.setText("Medicamentos");

        lblPacientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientes.setText("Pacientes");

        lblDescricao.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setText("Descricao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPacientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricao)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblMedicamentos;
    private javax.swing.JLabel lblPacientes;
    // End of variables declaration//GEN-END:variables
}
