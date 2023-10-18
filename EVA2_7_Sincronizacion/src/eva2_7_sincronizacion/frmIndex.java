/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_sincronizacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class frmIndex extends javax.swing.JFrame {

    /**
     * Creates new form frmIndex
     */
    public frmIndex() {
        initComponents();
    }
    
    int valor = 0;
    
    public synchronized void modificar(int hilo, int tiempo)
    {
        
        if (hilo == 0)
        {
            txaA.append("A: Valor inicial = " + valor + "\n"); //apend sirve para conservar el texto previamente guardado, y en append(se agrega al texto anterior)
        }
        else
        {
            txaB.append("A: Valor inicial = " + valor + "\n"); //apend sirve para conservar el texto previamente guardado, y en append(se agrega al texto anterior)
        }
        valor++;
                
        try 
        {
            Thread.sleep(tiempo);
        }
        catch (InterruptedException ex)
        {
        }
        
        if (hilo == 0)
        {
            txaA.append("A: Valor final = " + valor + "\n"); //apend sirve para conservar el texto previamente guardado, y en append(se agrega al texto anterior)
        }
        else
        {
            txaB.append("A: Valor final = " + valor + "\n"); //apend sirve para conservar el texto previamente guardado, y en append(se agrega al texto anterior)
        }
        valor++;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaB = new javax.swing.JTextArea();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("HILO A");

        txaA.setColumns(20);
        txaA.setRows(5);
        jScrollPane1.setViewportView(txaA);

        jLabel2.setText("HILO B");

        txaB.setColumns(20);
        txaB.setRows(5);
        jScrollPane2.setViewportView(txaB);

        btnIniciar.setText("Iniciar");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(264, 264, 264))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciar)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciar)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        Runnable runA = new Runnable()
        {
            @Override
            public void run() {
                for(int i = 0;i < 10; i++)
                modificar(0, 100);
            }
        };
        
        Runnable runB = new Runnable()
        {
            @Override
            public void run() {
                for(int i = 0;i < 10; i++)
                modificar(0, 800);
            }
        };
        Thread thread1 = new Thread(runA);
        Thread thread2 = new Thread(runB);
        
        thread1.start();
        thread2.start();
    }//GEN-LAST:event_btnIniciarMouseClicked

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
            java.util.logging.Logger.getLogger(frmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaA;
    private javax.swing.JTextArea txaB;
    // End of variables declaration//GEN-END:variables
}
