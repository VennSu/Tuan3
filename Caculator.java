/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author USER
 */
public class Caculator extends javax.swing.JFrame {

    private long a=0;
    private String pheptoan="";
    /**
     * Creates new form DemoJFrame
     */
    public Caculator() {
        initComponents();
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
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hienthi = new javax.swing.JTextPane();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel3 = new javax.swing.JPanel();
        so1 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        canbac2 = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        phantram = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        chiathapphan = new javax.swing.JButton();
        so0 = new javax.swing.JButton();
        congandchia = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        bang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        hienthi.setText("0");
        hienthi.setToolTipText("");
        hienthi.setMinimumSize(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(hienthi);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4);

        jPanel3.setLayout(new java.awt.GridLayout(4, 5));

        so1.setText("1");
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        jPanel3.add(so1);

        so2.setText("2");
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so2ActionPerformed(evt);
            }
        });
        jPanel3.add(so2);

        so3.setText("3");
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });
        jPanel3.add(so3);

        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });
        jPanel3.add(chia);

        canbac2.setText("sqrt");
        jPanel3.add(canbac2);

        so4.setText("4");
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });
        jPanel3.add(so4);

        so5.setText("5");
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });
        jPanel3.add(so5);

        so6.setText("6");
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });
        jPanel3.add(so6);

        nhan.setText("*");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        jPanel3.add(nhan);

        phantram.setText("%");
        jPanel3.add(phantram);

        so7.setText("7");
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });
        jPanel3.add(so7);

        so8.setText("8");
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });
        jPanel3.add(so8);

        so9.setText("9");
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });
        jPanel3.add(so9);

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });
        jPanel3.add(tru);

        chiathapphan.setText("1/x");
        jPanel3.add(chiathapphan);

        so0.setText("0");
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });
        jPanel3.add(so0);

        congandchia.setText("+/-");
        jPanel3.add(congandchia);

        xoa.setText("C");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        jPanel3.add(xoa);

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });
        jPanel3.add(cong);

        bang.setText("=");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });
        jPanel3.add(bang);

        jPanel1.add(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so1.getText());
            this.hienthi.setText(String.valueOf(so));
    }//GEN-LAST:event_so1ActionPerformed
    }
    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
         String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so2.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so2ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
          String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so3.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
         String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so4.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
           String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so5.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
         String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so6.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so6ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
           String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so7.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so7ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
          String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so8.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
           String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so9.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so9ActionPerformed

    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
          String gt =this.hienthi.getText();
        if(gt.length()<12){
            if (gt.equals("0")) gt="";
            long so = Long.parseLong(gt+ so0.getText());
            this.hienthi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so0ActionPerformed

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
      this.a=Long.parseLong(this.hienthi.getText());
        if (this.a!=0) {
            this.pheptoan="/";
            this.hienthi.setText("0");
        }
    }//GEN-LAST:event_chiaActionPerformed

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
        this.a=Long.parseLong(this.hienthi.getText());
        this.pheptoan= "*";this.hienthi.setText("0");
    }//GEN-LAST:event_nhanActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        this.a=Long.parseLong(this.hienthi.getText());
        this.pheptoan= "-";this.hienthi.setText("0");
    }//GEN-LAST:event_truActionPerformed

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
       this.a=Long.parseLong(this.hienthi.getText());
        this.pheptoan= "+";this.hienthi.setText("0");
    }//GEN-LAST:event_congActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
        if (this.pheptoan.length()>0) {
            long b=Long.parseLong(this.hienthi.getText());
            if (this.pheptoan.equals("+")){
                long kq=this.a+b;
                this.hienthi.setText(String.valueOf(kq));
            } else if (this.pheptoan.equals("-")) {
                long kq=this.a-b;
                this.hienthi.setText(String.valueOf(kq));
            }else if (this.pheptoan.equals("*")) {
                Long kq=this.a*b;
                this.hienthi.setText(String.valueOf(kq));
            }else if (this.pheptoan.equals("/")) {
                Long kq = this.a/b;
                this.hienthi.setText(String.valueOf(kq));
            }
            this.pheptoan="";this.a=0;
        }
    }//GEN-LAST:event_bangActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed

    }//GEN-LAST:event_xoaActionPerformed

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
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bang;
    private javax.swing.JButton canbac2;
    private javax.swing.JButton chia;
    private javax.swing.JButton chiathapphan;
    private javax.swing.JButton cong;
    private javax.swing.JButton congandchia;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextPane hienthi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nhan;
    private javax.swing.JButton phantram;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton tru;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
