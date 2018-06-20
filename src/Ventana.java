
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cristian
 */
public class Ventana extends javax.swing.JFrame {

    Game g1, g2, g3;

    public Ventana() {
        initComponents();
        BT2.setEnabled(false);
        BT3.setEnabled(false);
    }

    public void recibirGames(Game g1, Game g2, Game g3) {
        this.g1 = g1;
        this.g2 = g2;
        this.g3 = g3;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL1 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        JL3 = new javax.swing.JLabel();
        BT1 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        BT3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JL1.setText("jLabel1");

        JL2.setText("jLabel2");

        JL3.setText("jLabel3");

        BT1.setText("Parar");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BT2.setText("Parar");
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });

        BT3.setText("Parar");
        BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL1)
                    .addComponent(BT1))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BT3)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JL3)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL1)
                    .addComponent(JL2)
                    .addComponent(JL3))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT1)
                    .addComponent(BT2)
                    .addComponent(BT3))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cambiarJL1(int i) {
        JL1.setText(String.valueOf(i));
    }

    public void cambiarJL2(int i) {
        JL2.setText(String.valueOf(i));
    }

    public void cambiarJL3(int i) {
        JL3.setText(String.valueOf(i));
    }
    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed
        g1.stopThread();
        BT1.setEnabled(false);
        BT2.setEnabled(true);
    }//GEN-LAST:event_BT1ActionPerformed

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT2ActionPerformed
        g2.stopThread();
        BT2.setEnabled(false);
        BT3.setEnabled(true);
    }//GEN-LAST:event_BT2ActionPerformed

    private void BT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT3ActionPerformed
        g3.stopThread();
        BT3.setEnabled(false);
        comprobar();
    }//GEN-LAST:event_BT3ActionPerformed

    private void comprobar() {
        int a, b, c;
        a = Integer.parseInt(JL1.getText());
        b = Integer.parseInt(JL2.getText());
        c = Integer.parseInt(JL3.getText());
        if (a == b && b == c) {
            JOptionPane.showMessageDialog(null, "Gano el juego", "Resultado", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Perdio el juego", "Resultado", JOptionPane.WARNING_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
    private javax.swing.JButton BT3;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel JL3;
    // End of variables declaration//GEN-END:variables

    public JLabel getJL1() {
        return JL1;
    }

    public void setJL1(JLabel JL1) {
        this.JL1 = JL1;
    }

    public JLabel getJL2() {
        return JL2;
    }

    public void setJL2(JLabel JL2) {
        this.JL2 = JL2;
    }

    public JLabel getJL3() {
        return JL3;
    }

    public void setJL3(JLabel JL3) {
        this.JL3 = JL3;
    }

}
