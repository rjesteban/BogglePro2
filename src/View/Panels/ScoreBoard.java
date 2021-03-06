/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author El Gato
 */
public class ScoreBoard extends javax.swing.JPanel {

    /**
     * Creates new form HighScores
     */
    private TreeMap<Integer, String> map;
    
    public ScoreBoard() {
        map = new TreeMap<>();
        initComponents();
        try {
            highScore();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScoreBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HSPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        HSLabel = new javax.swing.JLabel();
        highScoreTxtArea = new javax.swing.JTextArea();
        Background = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(520, 552));
        setMinimumSize(new java.awt.Dimension(520, 552));
        setPreferredSize(new java.awt.Dimension(520, 552));

        HSPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Resources/logo.png"))); // NOI18N
        HSPanel.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        HSLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Resources/highScoreIn.png"))); // NOI18N
        HSPanel.add(HSLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        highScoreTxtArea.setEditable(false);
        highScoreTxtArea.setColumns(20);
        highScoreTxtArea.setFont(new java.awt.Font("Boggle", 0, 24)); // NOI18N
        highScoreTxtArea.setRows(5);
        HSPanel.add(highScoreTxtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 450, 310));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Model/Resources/yeah_boy.jpg"))); // NOI18N
        Background.setToolTipText("");
        HSPanel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HSPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HSPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void highScore() throws FileNotFoundException{
        File highScores = new File("src/Model/Resources/highScores.txt");
        Scanner fileread = new Scanner(highScores);
        StringBuilder build = new StringBuilder();
        while(fileread.hasNextLine()){
            build.append(fileread.nextLine()).append("\n");
        }
        highScoreTxtArea.setText(build.toString());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel HSLabel;
    private javax.swing.JPanel HSPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextArea highScoreTxtArea;
    // End of variables declaration//GEN-END:variables
}
