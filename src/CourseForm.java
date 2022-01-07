import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nazifa, moumita, mahfuz
 */

public class CourseForm extends javax.swing.JFrame {

    
    public CourseForm() {
        initComponents();
        setTitle("Student Management System");
        
    }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        sDept = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sFirstName = new javax.swing.JTextField();
        sMiddleName = new javax.swing.JTextField();
        sLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sCourseName = new javax.swing.JComboBox<>();
        sRegular = new javax.swing.JCheckBox();
        sSupply = new javax.swing.JRadioButton();
        sRetake = new javax.swing.JRadioButton();
        sSubmit = new javax.swing.JButton();
        sClear = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        sTermSpr = new javax.swing.JRadioButton();
        sTermSumm = new javax.swing.JRadioButton();
        sTermAut = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jRadioButton1.setText("jRadioButton1");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "SE", "EEE", "English", "LAW", "ECONOMICS", "BBA" }));
        sDept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sDeptFocusLost(evt);
            }
        });
        sDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDeptActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Department");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jLabel2.setLabelFor(sFirstName);
        jLabel2.setText("Student Name");

        sFirstName.setToolTipText("");
        sFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sFirstName.setName("nice"); // NOI18N
        sFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sFirstNameFocusLost(evt);
            }
        });
        sFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sFirstNameActionPerformed(evt);
            }
        });

        sMiddleName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sMiddleNameFocusGained(evt);
            }
        });

        sLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sLastNameFocusGained(evt);
            }
        });
        sLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sLastNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Student Email");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Course Registration Form");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Student ID (211-xxx-xxx)");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("List of Courses");

        sCourseName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE 111 - Computer Technology", "PHY 111 - Physics I", "MAT 112 - Differential & Integral Calculus", "GED 113 - English Language I", "CSE 121 - Structured Programming", "CSE 122 - Structured Programming Lab", "PHY 124 - Physics II", "GED 125 - English Language II", "MAT 216 - Geometry & Vector Analysis" }));

        buttonGroup1.add(sRegular);
        sRegular.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sRegular.setText("Regular");

        buttonGroup1.add(sSupply);
        sSupply.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sSupply.setText("Supply");

        buttonGroup1.add(sRetake);
        sRetake.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sRetake.setText("Retake");

        sSubmit.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        sSubmit.setText("Submit");
        sSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSubmitActionPerformed(evt);
            }
        });

        sClear.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        sClear.setText("Clear Form");
        sClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sClearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Term");

        buttonGroup10.add(sTermSpr);
        sTermSpr.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        sTermSpr.setText("Spring");
        sTermSpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTermSprActionPerformed(evt);
            }
        });

        buttonGroup10.add(sTermSumm);
        sTermSumm.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        sTermSumm.setText("Summer");

        buttonGroup10.add(sTermAut);
        sTermAut.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        sTermAut.setText("Autumn");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "ID", "Department", "Course", "Status", "Email", "Term"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MUlogo.png"))); // NOI18N

        jButton1.setText("Fetch Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("First Name");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setText("Middle Name");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Last Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sRegular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(sSupply)
                                .addGap(18, 18, 18)
                                .addComponent(sRetake))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(193, 193, 193)
                                    .addComponent(sClear)
                                    .addGap(38, 38, 38)
                                    .addComponent(sSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(sDept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sId)
                                        .addComponent(sCourseName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(2, 2, 2)
                                                            .addComponent(jLabel9)))
                                                    .addGap(189, 189, 189))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(sFirstName)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(135, 135, 135)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 27, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(sEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(sTermSpr)
                                    .addComponent(sTermSumm)
                                    .addComponent(sTermAut))
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(sTermSpr)
                .addGap(18, 18, 18)
                .addComponent(sTermSumm)
                .addGap(18, 18, 18)
                .addComponent(sTermAut)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(sCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sRegular)
                    .addComponent(sRetake)
                    .addComponent(sSupply))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sSubmit)
                    .addComponent(sClear)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sFirstName.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDeptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sDeptActionPerformed

    private void sFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sFirstNameActionPerformed

    private void sTermSprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTermSprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTermSprActionPerformed

    private void sFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sFirstNameFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_sFirstNameFocusLost

    private void sFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sFirstNameFocusGained
        // TODO add your handling code here:
        sFirstName.setText("");
    }//GEN-LAST:event_sFirstNameFocusGained

    private void sMiddleNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sMiddleNameFocusGained
        // TODO add your handling code here:
         sMiddleName.setText("");
    }//GEN-LAST:event_sMiddleNameFocusGained

    private void sLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sLastNameFocusGained
        // TODO add your handling code here:
         sLastName.setText("");
    }//GEN-LAST:event_sLastNameFocusGained

    private void sSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSubmitActionPerformed
        // TODO add your handling code here:
        String department = sDept.getSelectedItem().toString();
        //String term = sTermSpr.getSelectedItem().toString();
        String term = "";
        if(sTermSpr.isSelected())
        {
            term = "Spring";
        }
        if(sTermSumm.isSelected())
        {
            term = "Summer";
        }
        if(sTermAut.isSelected())
        {
            term = "Autumn";
        }
        
        
        String studentName = (sFirstName.getText().toString()+" "+sMiddleName.getText().toString()+" "+sLastName.getText().toString());
        String email = sEmail.getText().toString();
        String id = sId.getText().toString();
        String courseName = sCourseName.getSelectedItem().toString();
        String status = "";
        
        if(sRegular.isSelected())
        {
            status = "Regular";
        }
        
        if(sSupply.isSelected())
        {
            status = "Supply";
        }
        
        if(sRetake.isSelected())
        {
            status = "Retake";
        }
        
        
       
        
        String finalln = studentName + "/" + id + "/" + department + "/" + courseName + "/" + status + "/" +
                email + "/" + term;
        
        System.out.println(finalln);
         if ((department.equals("") )|| (term.equals("")) || (studentName.equals("")) || (email.equals("")) || (id.equals("")) || (courseName.equals(""))|| (status.equals(""))){
                JOptionPane.showMessageDialog(null, "Please don't leave any fields blank");
        }
         else
         {
             try
        {
            FileWriter Writer = new FileWriter ("course.txt",true);
            Writer.write(finalln);
            Writer.write(System.getProperty("line.separator"));
            Writer.close();
            JOptionPane.showMessageDialog(null, "Saved");
            setVisible(false);
            new CourseForm().setVisible(true);
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
             
         }
        
        
        
        
        
        
        
    }//GEN-LAST:event_sSubmitActionPerformed

    private void sClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sClearActionPerformed
        // TODO add your handling code here:
        sDept.setSelectedIndex(0);
        buttonGroup10.clearSelection();
        sFirstName.setText(null);
        sMiddleName.setText(null);
        sLastName.setText(null);
        sEmail.setText(null);
        sId.setText(null);
        buttonGroup1.clearSelection();
        sCourseName.setSelectedIndex(0);
        
        
        
    }//GEN-LAST:event_sClearActionPerformed

    private void sDeptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sDeptFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_sDeptFocusLost

    private void sLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sLastNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          String filePath = "course.txt";
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            
            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(CourseForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sClear;
    private javax.swing.JComboBox<String> sCourseName;
    private javax.swing.JComboBox<String> sDept;
    private javax.swing.JTextField sEmail;
    private javax.swing.JTextField sFirstName;
    private javax.swing.JTextField sId;
    private javax.swing.JTextField sLastName;
    private javax.swing.JTextField sMiddleName;
    private javax.swing.JCheckBox sRegular;
    private javax.swing.JRadioButton sRetake;
    private javax.swing.JButton sSubmit;
    private javax.swing.JRadioButton sSupply;
    private javax.swing.JRadioButton sTermAut;
    private javax.swing.JRadioButton sTermSpr;
    private javax.swing.JRadioButton sTermSumm;
    // End of variables declaration//GEN-END:variables
}
