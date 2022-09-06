/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy.management.system;

/**
 *
 * @author wawad
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Agent extends javax.swing.JFrame {

    /**
     * Creates new form Medcine
     */
    public Agent() {
        initComponents();
        SelectMed();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    Connection Con;
    Statement St;
    ResultSet Rs;
    java.util.Date Fdate,Edate;
    java.sql.Date MyFabDate,MyExpDate;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AgId = new javax.swing.JTextField();
        AgName = new javax.swing.JTextField();
        AgAge = new javax.swing.JTextField();
        AgPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgList = new javax.swing.JTable();
        UpdateBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        AgGander = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AgPass = new javax.swing.JTextField();
        ClearBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 650));

        CloseBtn.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("X");
        CloseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBtnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/office-building.png"))); // NOI18N
        jLabel1.setText("COMPANIES");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/pharmacy.png"))); // NOI18N
        jLabel2.setText("SELLING");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/medicine.png"))); // NOI18N
        jLabel3.setText("MEDICINES");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jPanel2.setDoubleBuffered(false);
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MANAGE AGENTS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("NAME");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("AGE");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("PHONE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("PASSWORD");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("GANDER");

        AgId.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        AgId.setForeground(new java.awt.Color(0, 153, 51));
        AgId.setToolTipText("ID accept only numbers");

        AgName.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        AgName.setForeground(new java.awt.Color(0, 153, 51));
        AgName.setToolTipText("NAME accept only characteres");

        AgAge.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        AgAge.setForeground(new java.awt.Color(0, 153, 51));
        AgAge.setToolTipText("AGE accept only numbers");

        AgPhone.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        AgPhone.setForeground(new java.awt.Color(0, 153, 51));
        AgPhone.setToolTipText("PHONE accept only numbers");

        AgList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AGE", "PHONE", "PASSWORD", "GENDER"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AgList.setRowHeight(25);
        AgList.setRowMargin(0);
        AgList.setSelectionBackground(new java.awt.Color(0, 153, 51));
        AgList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgList);

        UpdateBtn.setBackground(new java.awt.Color(0, 153, 51));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/exchange.png"))); // NOI18N
        UpdateBtn.setText("UPDATE");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setBackground(new java.awt.Color(0, 153, 51));
        RemoveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RemoveBtn.setForeground(new java.awt.Color(255, 255, 255));
        RemoveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/delete.png"))); // NOI18N
        RemoveBtn.setText("REMOVE");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(0, 153, 51));
        AddBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 255, 255));
        AddBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/add.png"))); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.setToolTipText("");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        AgGander.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Famele" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("AGENTS LIST");

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AgPass.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        AgPass.setForeground(new java.awt.Color(0, 153, 51));
        AgPass.setToolTipText("PASSWORD must be strong !!");

        ClearBtn.setBackground(new java.awt.Color(0, 153, 51));
        ClearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/eraser.png"))); // NOI18N
        ClearBtn.setText("CLEAR");
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AgName, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                            .addComponent(AgAge)
                                            .addComponent(AgId, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(RemoveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(AgPass)
                                            .addComponent(AgGander, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(AgPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(AgPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(AgPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(AgAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(AgGander, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RemoveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/management/system/ressources/user.png"))); // NOI18N
        jLabel8.setText("AGENTS");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(705, 705, 705)
                        .addComponent(CloseBtn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CloseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        if (AgId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter agent to be deleted !");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmadb", "root","");
                String Id = AgId.getText();
                String Querry = "Delete from agent where AgentId="+Id;
                Statement Remove = Con.createStatement();
                Remove.executeUpdate(Querry);
                SelectMed();
                JOptionPane.showMessageDialog(this, " agent deleted seccussfully !");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
            
            
            
        }
     
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    public void SelectMed()
    {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmadb", "root","");
            St =Con.createStatement();
            Rs= St.executeQuery("Select * from agent");
            AgList.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException ex) {
            Logger.getLogger(Agent.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    
    
    
    
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
            
            //Fdate = MedFab.getDate();
            String agid = AgId.getText();
            String agname = AgName.getText();
            String agage = AgAge.getText();
            String agphone = AgPhone.getText();
            String agpass = AgPass.getText();
            
        try {
            if (agid==null||agname.isEmpty()||agage.isEmpty()||agphone.isEmpty()||agpass.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Complete all medicine infomations !!");
            }
            
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmadb", "root","");
           //Con = DriverManager.getConnection("jdbc:derby://localhost:1527/pharmadb","wawadz2000","159874236");
            PreparedStatement Add = Con.prepareStatement("insert into agent values(?,?,?,?,?,?)");
            Add.setInt(1, Integer.valueOf(AgId.getText()));
            Add.setString(2, AgName.getText());
            Add.setInt(3,Integer.valueOf(AgAge.getText()));
            Add.setInt(4, Integer.valueOf(AgPhone.getText()));
            Add.setString(5, AgPass.getText());
           // Add.setDate(5, MyFabDate);
           // Add.setDate(6, MyExpDate);
            Add.setString(6, AgGander.getSelectedItem().toString());
            int row = Add.executeUpdate();
            AgList.updateUI();
            JOptionPane.showMessageDialog(this, "Medicine has been added seccufuly !");
            
            
             Con.close();
            SelectMed();
            // TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Agent.class.getName()).log(Level.SEVERE, null, ex);
          
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        
    }//GEN-LAST:event_AddBtnMouseClicked

    private void AgListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgListMouseClicked
        DefaultTableModel model = (DefaultTableModel)AgList.getModel();
        int Index = AgList.getSelectedRow();
        AgId.setText(model.getValueAt(Index, 0).toString());
        AgName.setText(model.getValueAt(Index, 1).toString());
        AgAge.setText(model.getValueAt(Index, 2).toString());
        AgPhone.setText(model.getValueAt(Index, 3).toString());
        AgPass.setText(model.getValueAt(Index, 4).toString());
        


        // TODO add your handling code here:
    }//GEN-LAST:event_AgListMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
   //   Fdate = MedFab.getDate();
          
           
           
        
        if (AgId.getText().isEmpty()||AgName.getText().isEmpty()||AgAge.getText().isEmpty()||AgPhone.getText().isEmpty()||AgPass.getText().isEmpty()) 
        {
            
            JOptionPane.showMessageDialog(this, "Missing informations !");
            
            
            
        }
        else
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Con = DriverManager.getConnection("jdbc:mysql://localhost/pharmadb", "root","");
                
           
           
                String UpdateQuerry = "Update agent set AgentName = '"+AgName.getText()
                        +"',AgentAge = "+AgAge.getText()
                        +",AgentPhone = '"+AgPhone.getText()
                        +"'"+",AgentPass = '"+AgPass.getText()
                        +"'"+ ",AgentGender = '"+AgGander.getSelectedItem().toString()
                        +"'"+" Where AgentId = "+AgId.getText();
             //   System.out.println(UpdateQuerry);
                Statement Update = Con.createStatement();
                Update.executeUpdate(UpdateQuerry);
                JOptionPane.showMessageDialog(this, "Agent has been updated seccufuly !");
                SelectMed();
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Agent.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(Agent.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }




        }        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        AgId.setText("");
        AgName.setText("");
        AgAge.setText("");
        AgPhone.setText("");
        AgPass.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
  new Company().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
  new Medcine().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void CloseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBtnMouseClicked
int Reponse = JOptionPane.showConfirmDialog(this, "Do you want to close the program ? ", "Confirm", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (Reponse == JOptionPane.YES_OPTION) {
        
            System.exit(0);        // TODO add your handling code here:

        }    }//GEN-LAST:event_CloseBtnMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
User use = new User();        
       // Selling a = new Selling(use.Users);
         //           a.hide();
                    new Selling(use.Users).setVisible(true);
                    this.dispose();
               // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        new Agent().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AgAge;
    private javax.swing.JComboBox<String> AgGander;
    private javax.swing.JTextField AgId;
    private javax.swing.JTable AgList;
    private javax.swing.JTextField AgName;
    private javax.swing.JTextField AgPass;
    private javax.swing.JTextField AgPhone;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JLabel CloseBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}