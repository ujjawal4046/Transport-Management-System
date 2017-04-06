package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import database.*;
/**
 *Main Display Frame of the application.All subsequent frames return to this frame
 * @author ujjawal
 */
public class WelcomeFrame extends javax.swing.JFrame {

   
    public WelcomeFrame() {
        initComponents();
        //DataLoader.printall();
        optionPanel.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        optionsGroup = new javax.swing.ButtonGroup();
        frontPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        sourceLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        optionButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        optionPanel = new javax.swing.JPanel();
        loginOptionButton = new javax.swing.JButton();
        searchOptionButton = new javax.swing.JButton();
        complaintOptionButton = new javax.swing.JButton();
        citySelectionLabel = new javax.swing.JLabel();
        citySelectionBox = new javax.swing.JComboBox<>();
        sourceCombo = new javax.swing.JComboBox<>();
        destinationCombo = new javax.swing.JComboBox<>();
        infoButton = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Bus Management System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/gui/resources/Bus.png")));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        frontPanel.setBackground(new java.awt.Color(51, 51, 51));
        frontPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        frontPanel.setForeground(new java.awt.Color(255, 255, 255));

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/login.png"))); // NOI18N
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        sourceLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sourceLabel.setForeground(new java.awt.Color(255, 255, 255));
        sourceLabel.setText("Source:");

        destinationLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        destinationLabel.setForeground(new java.awt.Color(255, 255, 255));
        destinationLabel.setText("Destination:");

        optionButton.setForeground(new java.awt.Color(255, 255, 255));
        optionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/options.jpg"))); // NOI18N
        optionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButtonActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/searchIcon.png"))); // NOI18N
        searchButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        optionPanel.setBackground(new java.awt.Color(51, 51, 51));

        loginOptionButton.setText("Login/New User");
        loginOptionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginOptionButtonActionPerformed(evt);
            }
        });

        searchOptionButton.setText("Search Type");
        searchOptionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOptionButtonActionPerformed(evt);
            }
        });

        complaintOptionButton.setText("Complaints");
        complaintOptionButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        complaintOptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintOptionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginOptionButton)
            .addComponent(searchOptionButton)
            .addComponent(complaintOptionButton)
        );

        optionPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {complaintOptionButton, loginOptionButton, searchOptionButton});

        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addComponent(loginOptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchOptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(complaintOptionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        citySelectionLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        citySelectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        citySelectionLabel.setText("Current city selected:");

        citySelectionBox.setBackground(new java.awt.Color(204, 204, 204));
        citySelectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Kharagpur" , "Indore"}));
        citySelectionBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        citySelectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citySelectionBoxActionPerformed(evt);
            }
        });
        citySelectionBox.setSelectedIndex(0);

        sourceCombo.setEditable(true);
        sourceCombo.setModel(new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray()));
        sourceCombo.setSelectedItem("");
        sourceCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        destinationCombo.setEditable(true);
        destinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray()));
        destinationCombo.setSelectedItem("");
        destinationCombo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/info.png"))); // NOI18N
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frontPanelLayout = new javax.swing.GroupLayout(frontPanel);
        frontPanel.setLayout(frontPanelLayout);
        frontPanelLayout.setHorizontalGroup(
            frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frontPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(frontPanelLayout.createSequentialGroup()
                        .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(frontPanelLayout.createSequentialGroup()
                        .addComponent(optionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frontPanelLayout.createSequentialGroup()
                        .addComponent(citySelectionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(citySelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(frontPanelLayout.createSequentialGroup()
                        .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sourceLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(frontPanelLayout.createSequentialGroup()
                                .addGap(0, 290, Short.MAX_VALUE)
                                .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(sourceCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinationCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        frontPanelLayout.setVerticalGroup(
            frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frontPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frontPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(frontPanelLayout.createSequentialGroup()
                                .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sourceLabel)
                                    .addComponent(sourceCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(destinationLabel))
                            .addComponent(destinationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addGroup(frontPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(optionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citySelectionLabel)
                    .addComponent(citySelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        searchButton.setContentAreaFilled(false);
        searchButton.setBorderPainted(false);
        searchButton.setFocusPainted(true);
        sourceCombo.setSelectedItem("");
        destinationCombo.setSelectedItem("");
        infoButton.setContentAreaFilled(false);
        infoButton.setBorderPainted(false);
        infoButton.setFocusPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frontPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(frontPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String source = (String)sourceCombo.getSelectedItem();
        String destination = (String)destinationCombo.getSelectedItem();
        PairSearchDisplay  pairFrame = new PairSearchDisplay(this,source.toUpperCase(),destination.toUpperCase());
        if(!DataLoader.isStop(source) || !DataLoader.isStop(destination))
            JOptionPane.showMessageDialog(this,"Invalid Source or Destination.Try Again","Error",JOptionPane.ERROR_MESSAGE);
        else if(source.equalsIgnoreCase(destination))JOptionPane.showMessageDialog(this,"Source can't be same as Destination.Try again","Error",JOptionPane.ERROR_MESSAGE);
        else
        {
            pairFrame.setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButtonActionPerformed
        // TODO add your handling code here:
       optionPanel.setVisible(!optionPanel.isVisible());

    }//GEN-LAST:event_optionButtonActionPerformed

    private void searchOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOptionButtonActionPerformed
        // TODO add your handling code here:
        SearchFrame searchFrame = new SearchFrame(this);
        searchFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_searchOptionButtonActionPerformed

    private void complaintOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintOptionButtonActionPerformed
        // TODO add your handling code here:
        JFrame complaintFrame = new ComplaintsFrame(this);
        complaintFrame.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_complaintOptionButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
       if (JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to exit the application?", "Really Closing?", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void citySelectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citySelectionBoxActionPerformed
               
        
        JComboBox selectionBox = (JComboBox)evt.getSource();
        String selectedCity = (String)selectionBox.getSelectedItem();        
        DataLoader.CITY = selectedCity;
        DataLoader.openFile();
        sourceCombo.setModel((new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray())));
        destinationCombo.setModel((new javax.swing.DefaultComboBoxModel<>(DataLoader.getStopArray())));
        sourceCombo.setSelectedItem("");
        destinationCombo.setSelectedItem("");
        //System.out.println(selectedCity);
    }//GEN-LAST:event_citySelectionBoxActionPerformed

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        InfoFrame infoFrame = new InfoFrame();
        infoFrame.setVisible(true);
    }//GEN-LAST:event_infoButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginFrame loginFrame = new LoginFrame(this);
        loginFrame.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginOptionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginOptionButtonActionPerformed
        loginButtonActionPerformed(evt);
    }//GEN-LAST:event_loginOptionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> citySelectionBox;
    private javax.swing.JLabel citySelectionLabel;
    private javax.swing.JButton complaintOptionButton;
    private javax.swing.JComboBox<String> destinationCombo;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JPanel frontPanel;
    private javax.swing.JButton infoButton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginOptionButton;
    private javax.swing.JButton optionButton;
    private javax.swing.JPanel optionPanel;
    private javax.swing.ButtonGroup optionsGroup;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchOptionButton;
    private javax.swing.JComboBox<String> sourceCombo;
    private javax.swing.JLabel sourceLabel;
    // End of variables declaration//GEN-END:variables
    

}