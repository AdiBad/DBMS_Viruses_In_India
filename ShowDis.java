/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;

/**
 *
 * @author niharika
 */
public class ShowDis extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    private static String dName,dID;
    /**
     * Creates new form ShowDis
     */
    public ShowDis()	{   }
    public ShowDis(String dname) {
	initComponents();
	dName=dname;
	con = Connect.ConnectDB();
	updateValues();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVirus = new javax.swing.JButton();
        txtVname = new javax.swing.JTextField();
        txtDduration = new javax.swing.JTextField();
        txtDid = new javax.swing.JTextField();
        txtDname = new javax.swing.JTextField();
        btnStatistics = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        txtVAname = new javax.swing.JTextField();
        btnVaccine = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 51));

        jPanel1.setForeground(new java.awt.Color(204, 51, 0));

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel2.setText("Disease Name");

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel1.setText("Disease ID");

        jLabel3.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        jLabel3.setText("Average Duration Of Disease");

        btnVirus.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        btnVirus.setText("Virus Responsible?");
        btnVirus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirusActionPerformed(evt);
            }
        });

        txtVname.setBackground(new java.awt.Color(102, 51, 0));
        txtVname.setFont(new java.awt.Font("Rockwell Condensed", 0, 26)); // NOI18N
        txtVname.setForeground(new java.awt.Color(204, 204, 204));
        txtVname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDduration.setBackground(new java.awt.Color(153, 153, 0));
        txtDduration.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        txtDduration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDduration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDdurationActionPerformed(evt);
            }
        });

        txtDid.setBackground(new java.awt.Color(51, 51, 51));
        txtDid.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        txtDid.setForeground(new java.awt.Color(204, 204, 204));
        txtDid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDname.setBackground(new java.awt.Color(0, 102, 102));
        txtDname.setFont(new java.awt.Font("Rockwell Condensed", 0, 36)); // NOI18N
        txtDname.setForeground(new java.awt.Color(204, 204, 204));
        txtDname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnStatistics.setBackground(new java.awt.Color(255, 204, 102));
        btnStatistics.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        btnStatistics.setForeground(new java.awt.Color(51, 51, 51));
        btnStatistics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnStatistics.setText("STATISTICS");
        btnStatistics.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStatistics.setOpaque(true);
        btnStatistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStatisticsMouseClicked(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(51, 51, 51));
        btnBack.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 204, 102));
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        lblInfo.setBackground(new java.awt.Color(102, 0, 0));
        lblInfo.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("More Info");
        lblInfo.setOpaque(true);
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });

        txtVAname.setBackground(new java.awt.Color(102, 51, 0));
        txtVAname.setFont(new java.awt.Font("Rockwell Condensed", 0, 26)); // NOI18N
        txtVAname.setForeground(new java.awt.Color(204, 204, 204));
        txtVAname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnVaccine.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        btnVaccine.setText("Vaccine Available?");
        btnVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaccineActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 60)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("D I S E A S E  D E T A I L S");
        jLabel4.setFocusable(false);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDduration, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDid)
                                    .addComponent(txtDname)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnVaccine)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnVirus)
                                                .addGap(5, 5, 5)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtVname, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                            .addComponent(txtVAname))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDid, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDname, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDduration, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVname, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVirus, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVaccine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVAname, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnStatistics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    String getDiseaseName()	{
	return ShowDis.dName;
    }
    
    private void updateValues()   {
	try {
	    String rq_did = "SELECT DiseaseID from diseases WHERE DName='"+this.getDiseaseName()+"'";
	    System.out.println("Query for DiseaseID: '"+rq_did+"'");
	    st = con.createStatement();
	    rs = st.executeQuery(rq_did);
	    while(rs.next())	{
		txtDid.setText(rs.getString(1));
		ShowDis.dID = rs.getString(1);
	    }
	    txtDname.setText(this.getDiseaseName());
	
	    String rq_dur = "SELECT Infection_Duration FROM diseases WHERE DName= '"+this.getDiseaseName()+"'";
	    System.out.println("Query for Disease Duration: '"+rq_dur+"'");
	    rs = st.executeQuery(rq_dur);
	    while(rs.next())
		txtDduration.setText(rs.getString(1));
	} catch (SQLException ex) {
	    Logger.getLogger(ShowDis.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
    // TODO add your handling code here:
	ShowDis.dID=null;
	DisPage d=new DisPage();
	d.setVisible(true);
	this.dispose();
	
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnVirusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirusActionPerformed
        // TODO add your handling code here:	
	try {
	    String rq_vname = "SELECT VirusName FROM viruses WHERE VirusID=(SELECT VirusID from diseases WHERE DName='"+this.getDiseaseName()+"')";
	    System.out.println("Query for VirusName: '"+rq_vname+"'");
	    st = con.createStatement();
	    rs = st.executeQuery(rq_vname);
	    while(rs.next())
		txtVname.setText(rs.getString(1));
	} catch (SQLException ex) {
	    Logger.getLogger(ShowDis.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_btnVirusActionPerformed

    private void btnStatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStatisticsMouseClicked
        // TODO add your handling code here:
	ShowStats ss = new ShowStats(ShowDis.dID);
	ss.setVisible(true);
    }//GEN-LAST:event_btnStatisticsMouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        // TODO add your handling code here:
	vinfo v =new vinfo(txtDid.getText());
	v.setVisible(true);
    }//GEN-LAST:event_lblInfoMouseClicked

    private void btnVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccineActionPerformed
        // TODO add your handling code here:
	try {
	    String rq_vaName = "SELECT VaccineName FROM vaccines WHERE VaccineID=(SELECT VaccineID from diseases WHERE DiseaseID='"+ShowDis.dID+"')";
	    System.out.println("Query for VaccineName: '"+rq_vaName+"'");
	    st = con.createStatement();
	    rs = st.executeQuery(rq_vaName);
	    while(rs.next())
		txtVAname.setText(rs.getString(1));
	} catch (SQLException ex) {
	    Logger.getLogger(ShowDis.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_btnVaccineActionPerformed

    private void txtDdurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDdurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDdurationActionPerformed

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
	    java.util.logging.Logger.getLogger(ShowDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(ShowDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(ShowDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(ShowDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new ShowDis().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnStatistics;
    private javax.swing.JButton btnVaccine;
    private javax.swing.JButton btnVirus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtDduration;
    private javax.swing.JTextField txtDid;
    private javax.swing.JTextField txtDname;
    private javax.swing.JTextField txtVAname;
    private javax.swing.JTextField txtVname;
    // End of variables declaration//GEN-END:variables
}
