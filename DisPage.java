/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author niharika
 */
public class DisPage extends javax.swing.JFrame {
 
    Connection		con = null;
    Statement		 st = null;
    ResultSet		 rs = null;
    PreparedStatement	pat = null;
    /**
     * Creates new form DisPage
     */
    public DisPage() {
	initComponents();
	btnGetDetails.setVisible(false);
	con = Connect.ConnectDB();
	comboItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnGetDetails = new javax.swing.JButton();
        DList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Juice ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Disease Name");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        btnGetDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnGetDetails.setFont(new java.awt.Font("Juice ITC", 0, 36)); // NOI18N
        btnGetDetails.setText("Get Details!");
        btnGetDetails.setContentAreaFilled(false);
        btnGetDetails.setOpaque(true);
        btnGetDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGetDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnGetDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        DList.setBackground(new java.awt.Color(255, 204, 204));
        DList.setEditable(true);
        DList.setFont(new java.awt.Font("Papyrus", 0, 22)); // NOI18N
        DList.setMaximumRowCount(10);
        DList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select a Disease>" }));
        DList.setToolTipText("Select a Disease!");
        DList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DList.setMinimumSize(new java.awt.Dimension(260, 45));
        DList.setPreferredSize(new java.awt.Dimension(260, 45));
        DList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DListItemStateChanged(evt);
            }
        });
        DList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DListActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 0, 51));
        jLabel1.setFont(new java.awt.Font("Juice ITC", 0, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("Click on the box below to select a disease :");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DList, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDetailsActionPerformed
        // TODO add your handling code here:
        ShowDis sd=new ShowDis(DList.getSelectedItem().toString());
        sd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGetDetailsActionPerformed

    private void DListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DListActionPerformed
        jPanel3.setBackground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_DListActionPerformed

    private void DListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DListItemStateChanged
        // TODO add your handling code here:
	
	if(DList.getSelectedIndex()!=0)	{
	    btnGetDetails.setVisible(true);
	    btnGetDetails.setText("Click for '"+DList.getSelectedItem().toString()+"'");
	}
	else btnGetDetails.setVisible(false);
    }//GEN-LAST:event_DListItemStateChanged
    
    
    private void comboItems()	{
	String rq_dname = "SELECT DName FROM diseases";
	System.out.println("Query at comboBox is: '"+rq_dname+"'");
	try {
	    st = con.createStatement();
	    rs = st.executeQuery(rq_dname);
	    
	    DList.removeAll();
	    while(rs.next())	{
		DList.addItem(rs.getString(1));
//		System.out.println(rs.getString(1));
	    }
	}
	catch (SQLException ex) {
	    Logger.getLogger(DisPage.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
//    public void sendsql()   {
//    int i=1;
//    //if(back!=1)	
//    {    
//	try {
//	    String sql="Select DiseaseName from Diseases where Disease='D1'";
//
//	    pat=con.prepareStatement(sql);
//	    pat.execute();
//	    i++;
//	}
//	catch(Exception E)  {
//	    JOptionPane.showMessageDialog(null," Ah! :  "+E);
//	} 
//    //        if(i==2)	
//    this.dispose();
//    }
//}

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
		java.util.logging.Logger.getLogger(DisPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(DisPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(DisPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(DisPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	    }
	    //</editor-fold>

	    /* Create and display the form */
	    java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {
		    DisPage dp = new DisPage();
		    dp.setVisible(true);
		}
	    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DList;
    private javax.swing.JButton btnGetDetails;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
