/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protótipo;

import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick
 */
public class TelaMesa extends javax.swing.JDialog {
String[][] data = new String[][] {
        {"01", "R$ 50,00" },
        {"15", "R$ 5,00"  },
        
        {"40", "R$ 16,00"}
    };
DecimalFormat dc = new DecimalFormat();

/**
     * Creates new form TelaMesa
     */
    public TelaMesa() {
        
        initComponents();
        

        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
            atualizaConta();
        }
        });
      jTable1.setDefaultEditor(Object.class, null);
      jTextPane1.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jMoneyFieldValor1 = new protótipo.JMoneyFieldValor();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setAlwaysOnTop(true);
        jDialog1.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("Valor do Pagamento");

        jMoneyFieldValor1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jMoneyFieldValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMoneyFieldValor1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMoneyFieldValor1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jMoneyFieldValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextPane1.setFont(new java.awt.Font("Segoe UI Symbol", 2, 10)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "Mesa", "Parcial"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton1.setText("Conta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton3.setText("Encerrar");

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jButton2.setText("Pagamento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma mesa.");
            return;
        }  
        telaPagamento();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMoneyFieldValor1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMoneyFieldValor1KeyPressed
        // TODO add your handling code here:
        calculaTroco(evt);
        
    }//GEN-LAST:event_jMoneyFieldValor1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       if(jTable1.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar uma mesa.");
            return;
        } 
        JOptionPane.showConfirmDialog(rootPane, "Deseja imprimir?");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
       
 
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTable1KeyTyped
    private void atualizaConta(){
        
        int selecionada=jTable1.getSelectedRow();
        if(selecionada==-1){
            jTextPane1.setText("");
            return;
        }
        int mesa = Integer.parseInt((String)jTable1.getValueAt(selecionada, 0));
        //System.out.println(mesa);
        switch(mesa){
            case 1: jTextPane1.setText("Pedido 1002\r\nHorário 18:32\r\n\r\n1x ----- Filé a Parmegiana Médio  R$ 35,00\r\n\r\n2x ----- Coca-Cola Lata  R$ 5,00\r\n\r\nTotal R$ 45,00\r\n--------------------------------------\r\nPedido 1005\r\nHorário 19:00\r\n\r\n 1x ----- Pudim  R$ 5,00\r\n\r\nTotal R$ 5,00\r\n--------------------------------------");
                break;
            case 15: jTextPane1.setText("Pedido 1000\r\nHorário 18:00\r\n\r\n1x ----- Skol Garrafa  R$ 5,00\r\n\r\nTotal R$ 5,00\r\n--------------------------------------");
                break;
            case 40: jTextPane1.setText("Pedido 1010\r\nHorário 19:30\r\n\r\n2x ----- Skol Garrafa  R$ 5,00\r\n\r\n1x ----- Porção Torradas  R$ 6,00\r\n\r\nTotal R$ 16,00\r\n--------------------------------------");
                break;    
        
        }
    
    }
    
    
    private void calculaTroco(KeyEvent evt){
       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
    
        dc.setMinimumFractionDigits(2);
        String tot ="";
        double total = 0;
        double pagamento = 0;
        double troco = 0;
        int selecionada =jTable1.getSelectedRow();
        String format = jMoneyFieldValor1.getText();
        format =  format.replace(',', '.');
        pagamento = Double.parseDouble(format);
            
            tot = (String)jTable1.getValueAt(selecionada, 1);
            tot=tot.replace("R$", " ");
            tot=tot.trim();
            tot=tot.replace(',', '.');
            total = Double.parseDouble(tot);
            
            
               
           
        
        if(pagamento<total){
            String teste = (String)jTable1.getValueAt(selecionada, 1);
            teste=teste.replace("R$", " ");
            teste=teste.trim();
            teste=teste.replace(',', '.');
            double novo = Double.parseDouble(teste)-pagamento;
            
            jTable1.setValueAt("R$ "+dc.format(novo),selecionada ,1 );
           
            jDialog1.dispose();
            
        }
        else if(pagamento==total){
           jDialog1.dispose();
           if(jTable1.getRowCount()==1)
            
            jTable1.clearSelection();
        
        else if(selecionada==0 && jTable1.getRowCount()>1){
                jTable1.setRowSelectionInterval(selecionada+1, selecionada+1);
            }
            ((DefaultTableModel)jTable1.getModel()).removeRow(selecionada);
            
            
        }
        else{
        troco = pagamento - total;
        jDialog1.dispose();
        JOptionPane.showMessageDialog(rootPane, "Troco : R$ "+dc.format(troco));
        if(jTable1.getRowCount()==1)
            
            jTable1.clearSelection();
        
        else if(selecionada==0 && jTable1.getRowCount()>1){
                jTable1.setRowSelectionInterval(selecionada+1, selecionada+1);
            }
        ((DefaultTableModel)jTable1.getModel()).removeRow(selecionada);
            
    }
    }
    }
    private void telaPagamento(){
        jDialog1.pack();
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaMesa dialog = new TelaMesa();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private protótipo.JMoneyFieldValor jMoneyFieldValor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
