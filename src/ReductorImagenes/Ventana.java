/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReductorImagenes;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsFileChooserUI;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author ignacio
 */
public class Ventana extends javax.swing.JFrame {

    JFileChooser fc, fc2;
    Image img, imagenrecogida;
    ImageIcon imagen, gimg;
    int alto, ancho;
    File archivoElegido;
    String num, num2;

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        pasarEnabled(false);        
    }
    
    public void pasarEnabled(boolean xvar){
        jButton2.setEnabled(xvar);
        nuevoancho.setEnabled(xvar);
        nuevoalto.setEnabled(xvar);
        check.setEnabled(xvar);
        check2.setEnabled(xvar);
        jComboBox1.setEnabled(xvar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jalto = new javax.swing.JTextField();
        jancho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpeso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nuevoalto = new javax.swing.JTextField();
        nuevoancho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        check2 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reductor de imágenes");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jButton1.setText("Abrir imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar Imagen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jalto.setEditable(false);

        jancho.setEditable(false);

        jLabel1.setText("Alto");

        jLabel2.setText("Ancho");

        jLabel3.setText("Peso");

        jpeso.setEditable(false);

        jLabel4.setText("Nuevo alto");

        jLabel5.setText("Nuevo Ancho");

        nuevoalto.setText("0");
        nuevoalto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nuevoaltoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nuevoaltoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoaltoKeyTyped(evt);
            }
        });

        nuevoancho.setText("0");
        nuevoancho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nuevoanchoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nuevoanchoKeyReleased(evt);
            }
        });

        jLabel6.setText("Relación aspecto");

        check.setSelected(true);
        check.setText("Activado");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel7.setText("px");

        jLabel8.setText("px");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "jpg", "png", "gif" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de formato");

        jLabel10.setText("Formato original");

        check2.setSelected(true);
        check2.setText("Activado");
        check2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modo Carpeta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jalto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jancho, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(check2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nuevoalto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nuevoancho, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(check))))
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(nuevoalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(check)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(check2))
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int nancho = 0, nalto = 0;

        fc = new JFileChooser();
        WindowsFileChooserUI wui = new WindowsFileChooserUI(fc);
        wui.installUI(fc);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "bmp", "gif", "jpg", "png");
        fc.setFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Elige la imagen a convertir");
        int respuesta = fc.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {

            pasarEnabled(true);
            jComboBox1.setEnabled(false);            

            archivoElegido = fc.getSelectedFile();
            double bytes = archivoElegido.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);

            int aux = (int) (kilobytes * 100);
            kilobytes = aux / 100d;

            aux = (int) (megabytes * 100);
            megabytes = aux / 100d;

            imagen = new ImageIcon(archivoElegido.getPath());
            alto = imagen.getIconHeight();
            ancho = imagen.getIconWidth();

            if (ancho > alto) {
                nancho = 300;
                nalto = (300 * alto) / ancho;
            } else {
                nalto = 300;
                nancho = (300 * ancho) / alto;
            }

            imagenrecogida = imagen.getImage();
            img = imagenrecogida.getScaledInstance(nancho, nalto, Image.SCALE_SMOOTH);
            ImageIcon fin = new ImageIcon(img);
            lblImagen.setIcon(fin);
            lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

            jancho.setText(String.valueOf(ancho) + " px");
            jalto.setText(String.valueOf(alto) + " px");
            nuevoancho.setText(String.valueOf(ancho));
            nuevoalto.setText(String.valueOf(alto));
            jpeso.setText(kilobytes + " Kbs    " + megabytes + " Mbs");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        fc2 = new JFileChooser();
        WindowsFileChooserUI wui = new WindowsFileChooserUI(fc2);
        wui.installUI(fc2);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes", "bmp", "gif", "jpg", "png");
        fc2.setFileFilter(filter);
        fc2.setAcceptAllFileFilterUsed(false);
        fc.setDialogTitle("Guardar imagen");

        String extension = "";
        String clm = jComboBox1.getSelectedItem().toString();

        if (Integer.parseInt(nuevoancho.getText()) > 0 && Integer.parseInt(nuevoalto.getText()) > 0) {

            int respuesta = fc2.showSaveDialog(this);

            Image a = imagenrecogida.getScaledInstance(Integer.parseInt(nuevoancho.getText()), Integer.parseInt(nuevoalto.getText()), Image.SCALE_SMOOTH);
            gimg = new ImageIcon(a);

            if (respuesta == JFileChooser.APPROVE_OPTION) {
                pasarEnabled(false);
                jButton1.setEnabled(false);
                jButton3.setEnabled(false);
                File guardarprev = fc2.getSelectedFile();
                String ruta = guardarprev.getPath();

                if (check2.isSelected()) {
                    extension = archivoElegido.getName().substring(archivoElegido.getName().lastIndexOf(".") + 1);
                    ruta = ruta.substring(ruta.lastIndexOf(".") + 1);
                    ruta = ruta + "." + extension;
                    clm = extension;
                } else {
                    if (guardarprev.getName().endsWith(".jpg") || guardarprev.getName().endsWith(".png") || guardarprev.getName().endsWith(".gif")) {
                        ruta = ruta.substring(0, ruta.lastIndexOf(".") + 1);
                        ruta = ruta + clm;
                    } else {
                        ruta = ruta + "." + clm;
                    }
                }
                FiltroBalanceBlanco fbb = new FiltroBalanceBlanco();
                File guardar = new File(ruta);

                try {
                    BufferedImage bii = new BufferedImage(a.getWidth(null), a.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                    BufferedImage bi = fbb.filtrar(bii);
                    Graphics2D g2 = bi.createGraphics();
                    g2.drawImage(a, 0, 0, null);
                    g2.dispose();
                    ImageIO.write(bi, clm, guardar);
                    JOptionPane.showMessageDialog(null, "La imagen se guardo con éxito.");
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
                pasarEnabled(true);
                jButton1.setEnabled(true);
                jButton3.setEnabled(true);
            }

        } else {

            JOptionPane.showMessageDialog(null, "Debes elegir tamaño y formato para la redimensión");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nuevoaltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoaltoKeyTyped

    }//GEN-LAST:event_nuevoaltoKeyTyped

    private void nuevoaltoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoaltoKeyPressed

    }//GEN-LAST:event_nuevoaltoKeyPressed

    private void nuevoaltoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoaltoKeyReleased
        num = nuevoalto.getText();
        try {
            Integer.parseInt(num);
        } catch (Exception e) {
            if(num.length() > 0){
                num = num.substring(0,num.length()-1);
                nuevoalto.setText(num);
            }
        }
        if (check.isSelected()) {
            try {
                int esc = (ancho * Integer.parseInt(nuevoalto.getText())) / alto;
                nuevoancho.setText(esc + "");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_nuevoaltoKeyReleased

    private void nuevoanchoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoanchoKeyReleased
        num2 = nuevoancho.getText();
        try {
            Integer.parseInt(num2);
        } catch (Exception e) {
            if(num2.length() > 0){
                num2 = num2.substring(0,num2.length()-1);
                nuevoancho.setText(num2);
            }            
        }
        if (check.isSelected()) {
            try {
                int esc = (alto * Integer.parseInt(nuevoancho.getText())) / ancho;
                nuevoalto.setText(esc + "");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_nuevoanchoKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void check2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check2ActionPerformed
        if (check2.isSelected()) {
            jComboBox1.setEnabled(false);
        } else {
            jComboBox1.setEnabled(true);
        }
    }//GEN-LAST:event_check2ActionPerformed

    private void nuevoanchoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoanchoKeyPressed

    }//GEN-LAST:event_nuevoanchoKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConversorCarpeta cc = new ConversorCarpeta();
        cc.setVisible(true);
        cc.setTitle("Reductor de imagenes");
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            Properties props = new Properties();            
            props.put("controlColorDark", "180 240 197");
            props.put("buttonColorDark", "244 242 232");
            props.put("rolloverColorDark", "180 240 197");
            props.put("windowTitleColorDark", "180 240 197");
            SmartLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JCheckBox check2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jalto;
    private javax.swing.JTextField jancho;
    private javax.swing.JTextField jpeso;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField nuevoalto;
    private javax.swing.JTextField nuevoancho;
    // End of variables declaration//GEN-END:variables
}
