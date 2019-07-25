/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import classes.Filiere;
import classes.Frais_academique;
import dao.FiliereDao;
import dao.Frais_academiqueDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class PanelFrais_aca extends javax.swing.JPanel {

    /**
     * Creates new form PanelFrais_aca
     */
    public PanelFrais_aca() {
        initComponents();
        list_fil();
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
        txt_mon = new javax.swing.JTextField();
        btn_enregistrer = new javax.swing.JButton();
        btn_modifier = new javax.swing.JButton();
        btn_supprimer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enregistrement des frais academique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Montant");

        txt_mon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btn_enregistrer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_enregistrer.setText("Enregistrer");
        btn_enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enregistrerActionPerformed(evt);
            }
        });

        btn_modifier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_modifier.setText("Modifier");
        btn_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifierActionPerformed(evt);
            }
        });

        btn_supprimer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_supprimer.setText("Supprimer");
        btn_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_mon, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_enregistrer)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_supprimer)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, txt_mon});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_mon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_enregistrer)
                    .addComponent(btn_modifier)
                    .addComponent(btn_supprimer))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, txt_mon});

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des frais academique", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Idf_a", "Montant"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_enregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enregistrerActionPerformed
        String montant = txt_mon.getText();
        if(montant.equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez bien remplir les champs...");
        }else{
            Frais_academique c = new Frais_academique(Integer.parseInt(montant));
            Frais_academiqueDao fdao = new Frais_academiqueDao();
            fdao.inserer(c);
            vider();
            list_fil();
        }
    }//GEN-LAST:event_btn_enregistrerActionPerformed

    private void btn_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifierActionPerformed
        int index = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(index, 0);
        Frais_academiqueDao fdao = new Frais_academiqueDao();
        String montant = txt_mon.getText();
        if(montant.equals("")){
            JOptionPane.showMessageDialog(this, "Veuillez cliquer sur la ligne a modifier...");
        }else{
            Frais_academique f = new Frais_academique(Integer.parseInt(montant));
            fdao.modifier(f, id);
            vider();
            list_fil();
        }
    }//GEN-LAST:event_btn_modifierActionPerformed

    private void btn_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimerActionPerformed
        int index = jTable1.getSelectedRow();
        if(index>=0){
            int id = (int) jTable1.getValueAt(index, 0);
            Frais_academiqueDao fdao = new Frais_academiqueDao();
            fdao.supprimer(id);
            vider();
            list_fil();
        }
        else{
            JOptionPane.showMessageDialog(this, "Veuillez selectionnez une ligne SVP...");
        }
    }//GEN-LAST:event_btn_supprimerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        int idf_a = (int) jTable1.getValueAt(index, 0);
        Frais_academiqueDao fdao = new Frais_academiqueDao();
        Frais_academique f = fdao.rechercher(idf_a);
        if(f!=null){
            txt_mon.setText(String.valueOf(f.getMontant()));
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enregistrer;
    private javax.swing.JButton btn_modifier;
    private javax.swing.JButton btn_supprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_mon;
    // End of variables declaration//GEN-END:variables
private void list_fil(){
        Frais_academiqueDao fdao = new Frais_academiqueDao();
        List<Frais_academique> lf =  fdao.liste();
        for(int i=0; i<lf.size();i++){
            ((DefaultTableModel) jTable1.getModel()).addRow(new Object[]{
                lf.get(i).getIdf_a(),
                lf.get(i).getMontant()
            });
        }
    }
    private void vider(){
        txt_mon.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int n = model.getRowCount();
        for(int i=n-1;i>=0;--i){
            model.removeRow(i);
        }
    }
}
