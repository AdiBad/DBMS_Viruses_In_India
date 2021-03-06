/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author niharika
 */
public class ShowStats extends javax.swing.JFrame {

    Connection		con=null;
    ResultSet		rs;
    PreparedStatement	pat;

    private static String dID;
    /**
     * Creates new form ShowStats
     */
    public ShowStats()	{
    
    }
    
    public ShowStats(String dID) {
	initComponents();
	ShowStats.dID = dID;
	updateRegionTable();
	updateSymptomTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCases = new javax.swing.JLabel();
        txtCases = new javax.swing.JTextField();
        lblDeaths = new javax.swing.JLabel();
        txtDeaths = new javax.swing.JTextField();
        lblPopulation = new javax.swing.JLabel();
        txtPopulation = new javax.swing.JTextField();
        lblRisk = new javax.swing.JLabel();
        txtRisk = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        txtIncidence = new javax.swing.JTextField();
        btnIncidence = new javax.swing.JButton();
        btnPrevalance = new javax.swing.JButton();
        txtPrevalance = new javax.swing.JTextField();
        btnDeath = new javax.swing.JButton();
        txtDeath = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabSymptoms = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRegion = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(756, 500));

        lblCases.setText("Number Of Cases Registered:");

        lblDeaths.setText("Number Of Deaths Recorded:");

        lblPopulation.setText("Population During Data Collection:");

        lblRisk.setText("Population That was at Risk:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnIncidence.setText("Calculate Incidence Rate?");
        btnIncidence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncidenceActionPerformed(evt);
            }
        });

        btnPrevalance.setText("Calculate Prevalance Rate?");
        btnPrevalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevalanceActionPerformed(evt);
            }
        });

        btnDeath.setText("Calculate Death Rate?");
        btnDeath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeathActionPerformed(evt);
            }
        });

        tabSymptoms.setBackground(new java.awt.Color(0, 51, 51));
        tabSymptoms.setForeground(new java.awt.Color(204, 255, 204));
        tabSymptoms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabSymptoms);

        tabRegion.setBackground(new java.awt.Color(0, 51, 51));
        tabRegion.setForeground(new java.awt.Color(204, 255, 204));
        tabRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabRegion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnIncidence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPrevalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPopulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeath, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRisk, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDeaths, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCases, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIncidence, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPopulation)
                                    .addComponent(txtCases)
                                    .addComponent(txtDeaths)
                                    .addComponent(txtRisk, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDeath, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(txtPrevalance))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCases)
                            .addComponent(txtCases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDeaths)
                            .addComponent(txtDeaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPopulation)
                            .addComponent(txtPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRisk)
                            .addComponent(txtRisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIncidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncidence))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrevalance)
                            .addComponent(txtPrevalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeath)
                            .addComponent(txtDeath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
	ShowStats.dID=null;
	this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
    private String getDiseaseID()   {
	    return ShowStats.dID;
    }    
    
    private void updateSymptomTable()	{
	try {
	    con = Connect.ConnectDB();
	    String rq_symp="SELECT SymptomName AS Symptoms FROM symptoms WHERE SymptomID IN (SELECT s_id from dis_symp "
		    + "WHERE d_id='"+this.getDiseaseID()+"')";
	    System.out.println("Query for Symptoms: '"+rq_symp+"'");
	    pat=con.prepareStatement(rq_symp);
	    rs = pat.executeQuery();
	    tabSymptoms.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (SQLException ex) {
	    Logger.getLogger(ShowStats.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    
    
    private void updateRegionTable()	{
	try {
	    con = Connect.ConnectDB();
	    String rq_data="SELECT Number_of_cases, Number_of_Deaths, Population_at_time_of_data_collection,Population_at_risk"
		    + " FROM disease_stats WHERE DiseaseID='"+this.getDiseaseID()+"'";
	    System.out.println("Query for Stats: '"+rq_data+"'");
	    pat=con.prepareStatement(rq_data);
	    rs = pat.executeQuery();

	    while(rs.next()) {
		txtCases.setText(rs.getString(1));
		txtDeaths.setText(rs.getString(2));
		txtPopulation.setText(rs.getString(3));
		txtRisk.setText(rs.getString(4));
	    }

	    String rq_region = "SELECT region_name as Regions_Affected FROM regions WHERE RegionID IN "
		    + "(SELECT R_ID FROM dis_region WHERE D_ID='"+this.getDiseaseID()+"')";
	    System.out.println("Query for Regions list: '"+rq_region+"'");
	    pat=con.prepareStatement(rq_region);
	    rs = pat.executeQuery();
	    tabRegion.setModel(DbUtils.resultSetToTableModel(rs));
	} catch (SQLException ex) {
	    Logger.getLogger(ShowStats.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
        
    private void btnIncidenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidenceActionPerformed
	try {
	    // TODO add your handling code here:
	    String rq_incidence = "SELECT calc_incidence('"+this.getDiseaseID()+"')";
	    System.out.println("Query for Incidence Rate Calculation: '"+rq_incidence+"'");
	    pat=con.prepareStatement(rq_incidence);
	    rs = pat.executeQuery();
	    
	    while(rs.next())
		txtIncidence.setText(rs.getString(1)+"%");
	} catch (SQLException ex) {
	    Logger.getLogger(ShowStats.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_btnIncidenceActionPerformed

    private void btnPrevalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevalanceActionPerformed
        try {
	    // TODO add your handling code here:
	    String rq_prevalance = "SELECT calc_prevalance('"+this.getDiseaseID()+"')";
	    System.out.println("Query for Prevalance Rate Calculation: '"+rq_prevalance+"'");
	    pat=con.prepareStatement(rq_prevalance);
	    rs = pat.executeQuery();
	    
	    while(rs.next())
		txtPrevalance.setText(rs.getString(1)+"%");
	} catch (SQLException ex) {
	    Logger.getLogger(ShowStats.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_btnPrevalanceActionPerformed

    private void btnDeathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeathActionPerformed
        try {
	    // TODO add your handling code here:
	    String rq_death = "SELECT calc_death('"+this.getDiseaseID()+"')";
	    System.out.println("Query for Death-Rate Calculation: '"+rq_death+"'");
	    pat=con.prepareStatement(rq_death);
	    rs = pat.executeQuery();
	    
	    while(rs.next())
		txtDeath.setText(rs.getString(1)+"%");
	} catch (SQLException ex) {
	    Logger.getLogger(ShowStats.class.getName()).log(Level.SEVERE, null, ex);
	}
    }//GEN-LAST:event_btnDeathActionPerformed

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
	    java.util.logging.Logger.getLogger(ShowStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(ShowStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(ShowStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(ShowStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new ShowStats().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeath;
    private javax.swing.JButton btnIncidence;
    private javax.swing.JButton btnPrevalance;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCases;
    private javax.swing.JLabel lblDeaths;
    private javax.swing.JLabel lblPopulation;
    private javax.swing.JLabel lblRisk;
    private javax.swing.JTable tabRegion;
    private javax.swing.JTable tabSymptoms;
    private javax.swing.JTextField txtCases;
    private javax.swing.JTextField txtDeath;
    private javax.swing.JTextField txtDeaths;
    private javax.swing.JTextField txtIncidence;
    private javax.swing.JTextField txtPopulation;
    private javax.swing.JTextField txtPrevalance;
    private javax.swing.JTextField txtRisk;
    // End of variables declaration//GEN-END:variables
}
