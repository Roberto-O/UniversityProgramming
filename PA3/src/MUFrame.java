/* CSC xxx Project/Lab # x
 * Samantha Student
 * Today's Date
 *
 * Project Description:
 *
 * Acknowledgements:
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUFrame extends javax.swing.JFrame {

    private MUPanel muPanel;
    private int hr = 12;
    private String pmam = "PM";


    // constructor method
    public MUFrame() {
        initComponents();
        muPanel = new MUPanel();
        drawingPanel.add(muPanel);

        
    } // end of constructor
    
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawingPanel = new javax.swing.JPanel();
        dayButton = new javax.swing.JButton();
        nightButton = new javax.swing.JButton();
        creatorLabel = new javax.swing.JLabel();
        busLabel = new javax.swing.JLabel();
        busForwardButton = new javax.swing.JButton();
        busBackButton = new javax.swing.JButton();
        bikeForwardButton = new javax.swing.JButton();
        bikeBackButton = new javax.swing.JButton();
        bikeLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        pmamLabel = new javax.swing.JLabel();
        plusHourButton = new javax.swing.JButton();
        minusHourButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout drawingPanelLayout = new javax.swing.GroupLayout(drawingPanel);
        drawingPanel.setLayout(drawingPanelLayout);
        drawingPanelLayout.setHorizontalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingPanelLayout.setVerticalGroup(
            drawingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );

        dayButton.setText("Day");
        dayButton.setFocusPainted(false);
        dayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayButtonActionPerformed(evt);
            }
        });

        nightButton.setText("Night");
        nightButton.setFocusPainted(false);
        nightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightButtonActionPerformed(evt);
            }
        });

        creatorLabel.setText("Created By: Roberto Olivera");

        busLabel.setText("School Bus");

        busForwardButton.setText("Forward");
        busForwardButton.setFocusPainted(false);
        busForwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busForwardButtonActionPerformed(evt);
            }
        });

        busBackButton.setText("Back");
        busBackButton.setFocusPainted(false);
        busBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busBackButtonActionPerformed(evt);
            }
        });

        bikeForwardButton.setText("Forward");
        bikeForwardButton.setFocusPainted(false);
        bikeForwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeForwardButtonActionPerformed(evt);
            }
        });

        bikeBackButton.setText("Back");
        bikeBackButton.setFocusPainted(false);
        bikeBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bikeBackButtonActionPerformed(evt);
            }
        });

        bikeLabel.setText("Bicycle");

        timeLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        timeLabel.setText("12:00");

        pmamLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pmamLabel.setText("PM");

        plusHourButton.setText("+1 Hour");
        plusHourButton.setFocusPainted(false);
        plusHourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusHourButtonActionPerformed(evt);
            }
        });

        minusHourButton.setText("-1 Hour");
        minusHourButton.setFocusPainted(false);
        minusHourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusHourButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creatorLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(timeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pmamLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(plusHourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minusHourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bikeBackButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bikeForwardButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(bikeLabel)
                                .addGap(71, 71, 71)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(busBackButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busForwardButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(busLabel)
                                .addGap(59, 59, 59)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(drawingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayButton)
                            .addComponent(busLabel)
                            .addComponent(bikeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nightButton)
                            .addComponent(busForwardButton)
                            .addComponent(busBackButton)
                            .addComponent(bikeForwardButton)
                            .addComponent(bikeBackButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plusHourButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(minusHourButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pmamLabel))
                                .addComponent(creatorLabel)))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayButtonActionPerformed
        muPanel.Day(new Color(135, 206, 235));
        pmam = "PM";
        pmamLabel.setText(pmam);
        muPanel.sunColors();
        repaint();
    }//GEN-LAST:event_dayButtonActionPerformed

    private void nightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightButtonActionPerformed
        muPanel.Night(new Color(41,15,90));
        pmam = "AM";
        pmamLabel.setText(pmam);
        muPanel.moonColors();
        repaint();
    }//GEN-LAST:event_nightButtonActionPerformed

    private void busForwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busForwardButtonActionPerformed
        muPanel.moveBusForward();
        repaint();
    }//GEN-LAST:event_busForwardButtonActionPerformed

    private void busBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busBackButtonActionPerformed
        muPanel.moveBusBackward();
        repaint();
    }//GEN-LAST:event_busBackButtonActionPerformed

    private void bikeForwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeForwardButtonActionPerformed
        muPanel.moveBikeForward();
        repaint();
    }//GEN-LAST:event_bikeForwardButtonActionPerformed

    private void bikeBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bikeBackButtonActionPerformed
        muPanel.moveBikeBackward();
        repaint();
    }//GEN-LAST:event_bikeBackButtonActionPerformed

    private void plusHourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusHourButtonActionPerformed
        if(hr == 11 && pmam.equals("AM")){
            hr++;
            pmam = "PM";
        }else if(hr == 11 && pmam.equals("PM")){
            hr++;
            pmam = "AM";
        }else{
            hr++;
            if(hr > 12){
                hr = 1;
            }
        }//end else
        
        switch(hr){
            case 7:
                if(pmam.equals("PM")){
                    muPanel.Night(new Color(41,15,90));
                    break;
                }
                break;
            case 6: 
                if(pmam.equals("AM")){
                    muPanel.Day(new Color(135, 206, 235));
                    break;
                }
                break;
        }//end switch
        
        timeLabel.setText(hr + ":00");
        pmamLabel.setText(pmam);
        muPanel.addHours();
        repaint();
    }//GEN-LAST:event_plusHourButtonActionPerformed

    private void minusHourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusHourButtonActionPerformed
        if(hr == 12 && pmam.equals("AM")){
            hr--;
            pmam = "PM";
        }else if(hr == 12 && pmam.equals("PM")){
            hr--;
            pmam = "AM";
        }else{
            hr--;
            if(hr < 1){
                hr = 12;
            }
        }
        switch(hr){
            case 6:
                if(pmam.equals("PM")){
                    muPanel.Day(new Color(135, 206, 235));
                    break;
                }
                break;
            case 5: 
                if(pmam.equals("AM")){
                    muPanel.Night(new Color(41,15,90));
                    break;
                }
                break;
        }//end switch
        timeLabel.setText(hr + ":00");
        pmamLabel.setText(pmam);
        muPanel.minusHours();
        repaint();
    }//GEN-LAST:event_minusHourButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MUFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bikeBackButton;
    private javax.swing.JButton bikeForwardButton;
    private javax.swing.JLabel bikeLabel;
    private javax.swing.JButton busBackButton;
    private javax.swing.JButton busForwardButton;
    private javax.swing.JLabel busLabel;
    private javax.swing.JLabel creatorLabel;
    private javax.swing.JButton dayButton;
    private javax.swing.JPanel drawingPanel;
    private javax.swing.JButton minusHourButton;
    private javax.swing.JButton nightButton;
    private javax.swing.JButton plusHourButton;
    private javax.swing.JLabel pmamLabel;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
