/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.integrador;

import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Freddy
 */
public class moscuro extends javax.swing.JFrame {

    /**
     * Creates new form moscuro
     */
    public moscuro() {
        initComponents();
         gato_arriba.setVisible(false);
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icono_proyecto_integrador.png")));
    }
 int xMouse,yMouse;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Minimizar = new javax.swing.JButton();
        btn_Cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        gato_arriba = new javax.swing.JLabel();
        lb_gato_superposicion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Minimizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_Minimizar.setForeground(new java.awt.Color(22, 22, 22));
        btn_Minimizar.setText("—");
        btn_Minimizar.setBorder(null);
        btn_Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Minimizar.setDefaultCapable(false);
        btn_Minimizar.setFocusPainted(false);
        btn_Minimizar.setFocusable(false);
        btn_Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_MinimizarMouseExited(evt);
            }
        });
        btn_Minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 30));

        btn_Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Cerrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btn_Cerrar.setForeground(new java.awt.Color(22, 22, 22));
        btn_Cerrar.setText("X");
        btn_Cerrar.setBorder(null);
        btn_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cerrar.setDefaultCapable(false);
        btn_Cerrar.setFocusPainted(false);
        btn_Cerrar.setFocusable(false);
        btn_Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_CerrarMousePressed(evt);
            }
        });
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crated by CatBones ©");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 690, 170, 30));

        jPanel2.setBackground(new java.awt.Color(107, 55, 95));
        jPanel2.setForeground(new java.awt.Color(107, 55, 95));

        jLabel3.setFont(new java.awt.Font("Montserrat Thin", 2, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("M É T O D O ");

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SUSTITUCIÓN ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 430, 160));

        jButton4.setBackground(new java.awt.Color(107, 55, 95));
        jButton4.setForeground(new java.awt.Color(107, 55, 95));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones de seleccion(iNGRESAR)-NOCHE.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 500, 210, 50));

        jButton5.setBackground(new java.awt.Color(107, 55, 95));
        jButton5.setForeground(new java.awt.Color(107, 55, 95));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones de seleccion(ACERCA DE)-noche.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 560, 210, 50));

        jButton1.setBackground(new java.awt.Color(107, 55, 95));
        jButton1.setForeground(new java.awt.Color(107, 55, 95));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BOTON NOCHE.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        gato_arriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/gato kite_1.gif"))); // NOI18N
        gato_arriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gato_arribaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gato_arribaMouseExited(evt);
            }
        });
        jPanel1.add(gato_arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 260, 140));

        lb_gato_superposicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gifs/Pantalla(Monitor).gif"))); // NOI18N
        lb_gato_superposicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_gato_superposicionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_gato_superposicionMouseExited(evt);
            }
        });
        jPanel1.add(lb_gato_superposicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 260, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OSCURO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mclaro frmmclaro = new mclaro();
        frmmclaro.setLocationRelativeTo(null);
        frmmclaro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        integral_oscuro frmintegral_oscuro = new integral_oscuro();
        frmintegral_oscuro.setLocationRelativeTo(null);
        frmintegral_oscuro.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri = new java.net.URI("https://github.com/elskeleton69/Proyecto-Integrador-Calculadora-de-Integrales-Indefinidas-por-M-todo-de-Sustituci-n.-");
                    desktop.browse(uri);
                    
                }catch(Exception e){
                    
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_CerrarMouseClicked

    private void btn_CerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseEntered

        // TODO add your handling code here:
        btn_Cerrar.setBackground(red);
    }//GEN-LAST:event_btn_CerrarMouseEntered

    private void btn_CerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMouseExited
        // TODO add your handling code here:
        btn_Cerrar.setBackground(white);
    }//GEN-LAST:event_btn_CerrarMouseExited

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void gato_arribaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gato_arribaMouseEntered
        // TODO add your handling code here:
        gato_arriba.setVisible(true);
    }//GEN-LAST:event_gato_arribaMouseEntered

    private void gato_arribaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gato_arribaMouseExited
        // TODO add your handling code here:
        gato_arriba.setVisible(false);
    }//GEN-LAST:event_gato_arribaMouseExited

    private void lb_gato_superposicionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_gato_superposicionMouseEntered
        // TODO add your handling code here:
        gato_arriba.setVisible(true);

    }//GEN-LAST:event_lb_gato_superposicionMouseEntered

    private void lb_gato_superposicionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_gato_superposicionMouseExited
        // TODO add your handling code here:
        gato_arriba.setVisible(false);
    }//GEN-LAST:event_lb_gato_superposicionMouseExited

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse= evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void btn_MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_MinimizarMouseClicked

    private void btn_MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseEntered
        // TODO add your handling code here:
        btn_Minimizar.setBackground(new java.awt.Color(98,98,98));
    }//GEN-LAST:event_btn_MinimizarMouseEntered

    private void btn_MinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizarMouseExited
        // TODO add your handling code here:
        btn_Minimizar.setBackground(Color.white);
    }//GEN-LAST:event_btn_MinimizarMouseExited

    private void btn_MinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MinimizarActionPerformed

    private void btn_CerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CerrarMousePressed
        // TODO add your handling code here:
        btn_Cerrar.setBackground(red);
    }//GEN-LAST:event_btn_CerrarMousePressed

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
            java.util.logging.Logger.getLogger(moscuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moscuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moscuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moscuro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moscuro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Minimizar;
    private javax.swing.JLabel gato_arriba;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lb_gato_superposicion;
    // End of variables declaration//GEN-END:variables
}
