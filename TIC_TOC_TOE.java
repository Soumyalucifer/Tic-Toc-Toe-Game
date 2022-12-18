
import static java.awt.Color.*;
import javax.swing.JButton;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author soumya
 */
public class TIC_TOC_TOE extends javax.swing.JFrame {

    private String turn;
    private int xCount;
    private int oCount;
    private int totalcount;
    
    public TIC_TOC_TOE() {
        initComponents();
        turn = "O";
        xCount = 0;
        oCount = 0;
        totalcount=0;
    }

    private void choosePlayer(){
        if(turn.equals("O"))
        {
            turn="X";
        }
        else
        {
            turn="O";
        }
    }
   
    public void updateScore()
    {
        xbtm.setText(String.valueOf(xCount));
        obtm.setText(String.valueOf(oCount));

    }
    
    public void checkwin()
    {
        String b1 = btm1.getText();
        String b2 = btm2.getText();
        String b3 = btm3.getText();
        String b4 = btm4.getText();
        String b5 = btm5.getText();
        String b6 = btm6.getText();
        String b7 = btm7.getText();
        String b8 = btm8.getText();
        String b9 = btm9.getText();
        
        if((b1.equals(b2) && b2.equals(b3)) && !b1.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm1.setBackground(orange);
            btm2.setBackground(orange);
            btm3.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        else if((b4.equals(b5) && b5.equals(b6)) && !b4.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm4.setBackground(orange);
            btm5.setBackground(orange);
            btm6.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        if((b7.equals(b8) && b8.equals(b9)) && !b7.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm7.setBackground(orange);
            btm8.setBackground(orange);
            btm9.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        if((b1.equals(b4) && b4.equals(b7)) && !b1.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm1.setBackground(orange);
            btm4.setBackground(orange);
            btm7.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        if((b2.equals(b5) && b5.equals(b8)) && !b2.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm2.setBackground(orange);
            btm5.setBackground(orange);
            btm8.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        if((b3.equals(b6) && b6.equals(b9)) && !b3.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm3.setBackground(orange);
            btm6.setBackground(orange);
            btm9.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        if((b1.equals(b5) && b5.equals(b9)) && !b1.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm1.setBackground(orange);
            btm5.setBackground(orange);
            btm9.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            
            updateScore();
        }
        if((b3.equals(b5) && b5.equals(b7)) && !b3.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Player " + turn + " Wins"," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            btm3.setBackground(orange);
            btm5.setBackground(orange);
            btm7.setBackground(orange);
            
            if(turn.equals("O"))
            {
                oCount++;
            }
            else
            {
                xCount++;
            }
            updateScore();
        }
        else if(totalcount == 9)
        {
            JOptionPane.showMessageDialog(this,"Draw ! "," Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            reset();
        }
    }
    
    public void invokeButton(JButton btm)
    {
         if(!btm.getText().equals(""))
        {
            return;
        }
         totalcount++;
         
        btm.setText(turn);
        if(turn.equals("O"))
        {
            btm.setForeground(magenta); 
        }
        else
        {
            btm.setForeground(red);
        }
        
        checkwin();
        choosePlayer();
    }
    
    public void reset()
    {
        btm1.setText("");
        btm2.setText("");
        btm3.setText("");
        btm4.setText("");
        btm5.setText("");
        btm6.setText("");
        btm7.setText("");
        btm8.setText("");
        btm9.setText("");
        
        btm1.setBackground(white);
        btm2.setBackground(white);
        btm3.setBackground(white);
        btm4.setBackground(white);
        btm5.setBackground(white);
        btm6.setBackground(white);
        btm7.setBackground(white);
        btm8.setBackground(white);
        btm9.setBackground(white);
        
        totalcount=0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btm2 = new javax.swing.JButton();
        btm3 = new javax.swing.JButton();
        btm1 = new javax.swing.JButton();
        btm6 = new javax.swing.JButton();
        btm4 = new javax.swing.JButton();
        btm5 = new javax.swing.JButton();
        btm9 = new javax.swing.JButton();
        btm7 = new javax.swing.JButton();
        btm8 = new javax.swing.JButton();
        exitbtm = new javax.swing.JButton();
        resetbtm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xbtm = new javax.swing.JLabel();
        obtm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TOC TOE");
        setBackground(new java.awt.Color(255, 255, 0));
        setPreferredSize(new java.awt.Dimension(600, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 5, 37));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        btm2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm2ActionPerformed(evt);
            }
        });

        btm3.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm3ActionPerformed(evt);
            }
        });

        btm1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm1ActionPerformed(evt);
            }
        });

        btm6.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm6ActionPerformed(evt);
            }
        });

        btm4.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm4ActionPerformed(evt);
            }
        });

        btm5.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm5ActionPerformed(evt);
            }
        });

        btm9.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm9ActionPerformed(evt);
            }
        });

        btm7.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm7ActionPerformed(evt);
            }
        });

        btm8.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm8ActionPerformed(evt);
            }
        });

        exitbtm.setBackground(new java.awt.Color(255, 51, 0));
        exitbtm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtm.setText("EXIT");
        exitbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtmActionPerformed(evt);
            }
        });

        resetbtm.setBackground(new java.awt.Color(51, 255, 0));
        resetbtm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtm.setText("RESET");
        resetbtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtmActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel3.setText("PLAYER  X");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jLabel4.setText("PLAYER  O");

        xbtm.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        xbtm.setText("0");

        obtm.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        obtm.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xbtm)
                    .addComponent(obtm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(xbtm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(obtm))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btm9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetbtm, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitbtm, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btm2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btm5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btm4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetbtm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitbtm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btm8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btm7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm2ActionPerformed
           
       invokeButton(btm2); 
           
    }//GEN-LAST:event_btm2ActionPerformed

    private void btm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm3ActionPerformed
        
       invokeButton(btm3);
       
    }//GEN-LAST:event_btm3ActionPerformed

    private void btm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm1ActionPerformed
            
        invokeButton(btm1);
        
    }//GEN-LAST:event_btm1ActionPerformed

    private void btm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm6ActionPerformed
            
        invokeButton(btm6);
        
    }//GEN-LAST:event_btm6ActionPerformed

    private void btm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm4ActionPerformed
  
       invokeButton(btm4);
       
    }//GEN-LAST:event_btm4ActionPerformed

    private void btm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm5ActionPerformed
        
        invokeButton(btm5);
        
    }//GEN-LAST:event_btm5ActionPerformed

    private void btm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm9ActionPerformed
        
        invokeButton(btm9);
        
    }//GEN-LAST:event_btm9ActionPerformed

    private void btm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm7ActionPerformed
      
        invokeButton(btm7);
        
    }//GEN-LAST:event_btm7ActionPerformed

    private void btm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm8ActionPerformed
      
        invokeButton(btm8);
        
    }//GEN-LAST:event_btm8ActionPerformed

    private void exitbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtmActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit...","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtmActionPerformed

    private void resetbtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtmActionPerformed
        
        reset();
        
    }//GEN-LAST:event_resetbtmActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TOC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TOC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TOC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TOC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TOC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm1;
    private javax.swing.JButton btm2;
    private javax.swing.JButton btm3;
    private javax.swing.JButton btm4;
    private javax.swing.JButton btm5;
    private javax.swing.JButton btm6;
    private javax.swing.JButton btm7;
    private javax.swing.JButton btm8;
    private javax.swing.JButton btm9;
    private javax.swing.JButton exitbtm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel obtm;
    private javax.swing.JButton resetbtm;
    private javax.swing.JLabel xbtm;
    // End of variables declaration//GEN-END:variables
}
