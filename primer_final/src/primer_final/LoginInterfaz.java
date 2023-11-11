
package primer_final;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author alanalcaraz
 */
public class LoginInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form LoginInterfaz
     */
    private ImageIcon imagen;
    private Icon icono;
    
    public LoginInterfaz() {
        initComponents();
        this.setLocationRelativeTo(this); //Ubicar la interfaz en el centro
        //this.tamano_imagen(this.usuario, "/imagenes/usuario.png");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        logo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        box_cuenta = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        box_cedula = new javax.swing.JTextPane();
        boton_iniciarSesion = new java.awt.Button();
        label1 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        ojo_clave = new javax.swing.JLabel();
        box_clave = new javax.swing.JPasswordField();
        label5 = new java.awt.Label();
        logo1 = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(825, 550));
        setMinimumSize(new java.awt.Dimension(825, 550));
        setPreferredSize(new java.awt.Dimension(825, 550));
        setResizable(false);

        jDesktopPane1.setMaximumSize(new java.awt.Dimension(825, 466));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(825, 466));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        label2.setText("Sistema Web Backing");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario_login 150x150.png"))); // NOI18N

        box_cuenta.setBackground(new java.awt.Color(255, 255, 255));
        box_cuenta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        box_cuenta.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(box_cuenta);

        box_cedula.setBackground(new java.awt.Color(255, 255, 255));
        box_cedula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        box_cedula.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(box_cedula);

        boton_iniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_iniciarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        boton_iniciarSesion.setLabel("Iniciar Sesion");

        label1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label1.setText("Cédula");

        label3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label3.setText("Número de Cuenta");

        label4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label4.setText("Clave");

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ojo_clave.setBackground(new java.awt.Color(255, 255, 255));
        ojo_clave.setForeground(new java.awt.Color(255, 255, 255));
        ojo_clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_cerrarOjo.png"))); // NOI18N
        ojo_clave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ojo_clave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ojo_clave.setMaximumSize(new java.awt.Dimension(22, 22));
        ojo_clave.setMinimumSize(new java.awt.Dimension(22, 22));
        ojo_clave.setPreferredSize(new java.awt.Dimension(22, 22));
        ojo_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ojo_claveMouseClicked(evt);
            }
        });
        jLayeredPane1.add(ojo_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 7, 26, 37));

        box_clave.setBackground(new java.awt.Color(255, 255, 255));
        box_clave.setForeground(new java.awt.Color(0, 0, 0));
        box_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_claveActionPerformed(evt);
            }
        });
        box_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                box_claveKeyTyped(evt);
            }
        });
        jLayeredPane1.add(box_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 220, 39));

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(204, 0, 0));
        label5.setText("Ingresaste mal algo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(boton_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 520));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo 500x500.png"))); // NOI18N
        logo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo1.setVerifyInputWhenFocusTarget(false);
        jDesktopPane1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 420, 350));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo1020x641.png"))); // NOI18N
        fondo1.setToolTipText("");
        fondo1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        fondo1.setMinimumSize(new java.awt.Dimension(1020, 640));
        fondo1.setOpaque(true);
        fondo1.setPreferredSize(new java.awt.Dimension(1020, 640));
        jDesktopPane1.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 310, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean claveVisible = false;

    private void box_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_claveActionPerformed
        // Que se visualize la contraseña
        char echoChar = claveVisible ? '\u0000' : '*';
        box_clave.setEchoChar(echoChar);
    }//GEN-LAST:event_box_claveActionPerformed

    private void box_claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_box_claveKeyTyped
        // Que se visualize la contraseña
        char echoChar = claveVisible ? '\u0000' : '*';
        box_clave.setEchoChar(echoChar);
    }//GEN-LAST:event_box_claveKeyTyped

    private void ojo_claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ojo_claveMouseClicked
        // Cambiar la visibilidad de la contraseña
        if (claveVisible) {
            box_clave.setEchoChar('*'); // Si es visible, ocultar
            ojo_clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_cerrarOjo.png")));
        } else {
            box_clave.setEchoChar((char) 0); // Si está oculta, hacer visible
            ojo_clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono_ojo.png")));
        }

        claveVisible = !claveVisible; // Invertir el estado
    }//GEN-LAST:event_ojo_claveMouseClicked
    
       
    


    
    
    /*
        private void tamano_imagen(JLabel lbl, String ruta) {
        java.net.URL url = getClass().getResource(ruta);

        if (url != null) {
            this.imagen = new ImageIcon(url);
            this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_DEFAULT));
            lbl.setIcon(this.icono);
            this.repaint();
        } else {
            System.err.println("No se pudo encontrar la imagen: " + ruta);
        }
    }
    /*

    
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
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button boton_iniciarSesion;
    private javax.swing.JTextPane box_cedula;
    private javax.swing.JPasswordField box_clave;
    private javax.swing.JTextPane box_cuenta;
    private javax.swing.JLabel fondo1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel ojo_clave;
    // End of variables declaration//GEN-END:variables
}