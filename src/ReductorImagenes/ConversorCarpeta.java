/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReductorImagenes;

import com.sun.java.swing.plaf.windows.WindowsFileChooserUI;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ConversorCarpeta extends javax.swing.JFrame {

    JFileChooser fc;
    File dir;
    String tipo, ext, dato, extension, ruta;
    String num, num2;
    ArrayList<File> arr = new ArrayList<File>();
    Image img, imagenrecogida;
    ImageIcon imagen, gimg;
    int nancho, nalto, alto, ancho;
    int percent = 0;
    boolean hayimagenes;
    Thread t;

    public ConversorCarpeta() {        
        initComponents();
        getContentPane().setBackground(Color.WHITE);   
        this.setLocationRelativeTo(null);
        jButton1.setEnabled(true);
        detener.setVisible(false);
        pasarEnabled(false);
        cambiarTabla();
        centrar_datos(0);
        centrar_datos(1);
        centrar_datos(2);
        centrar_datos(3);
    }

    public void pasarEnabled(boolean xvar) {
        jButton2.setEnabled(xvar);
        jnuevoalto.setEnabled(xvar);
        jnuevoancho.setEnabled(xvar);
        jComboBox2.setEnabled(xvar);
        jCheckBox2.setEnabled(xvar);
        toriginal.setEnabled(xvar);
    }

    public void centrar_datos(int col) {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);
    }
    
    public void cambiarTabla() {
        DefaultTableCellRenderer renderer;
        renderer = (DefaultTableCellRenderer) tabla.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(JLabel.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblImagen2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jnuevoalto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jnuevoancho = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        porcentaje = new javax.swing.JLabel();
        toriginal = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        detener = new javax.swing.JButton();

        jLabel8.setText("Progreso");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton2.setText("Convertir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Elegir Carpeta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Extensión", "Peso", "Ancho X Alto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setEnabled(false);
        jScrollPane1.setViewportView(tabla);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nuevo alto");

        jnuevoalto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jnuevoaltoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jnuevoaltoKeyReleased(evt);
            }
        });

        jLabel2.setText("Nuevo Ancho");

        jnuevoancho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jnuevoanchoKeyReleased(evt);
            }
        });

        jLabel3.setText("px");

        jLabel4.setText("px");

        jLabel6.setText("Tipo de Formato");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "jpg", "png", "gif" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Formato Original");

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Activado");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        toriginal.setSelected(true);
        toriginal.setText("Tamaño Original");
        toriginal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toriginalActionPerformed(evt);
            }
        });

        jButton3.setText("Modo 1 foto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        detener.setBackground(new java.awt.Color(255, 51, 51));
        detener.setText("Detener");
        detener.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jnuevoalto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jnuevoancho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(toriginal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox2))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(detener, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jnuevoalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jnuevoancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(toriginal))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jCheckBox2))
                .addGap(16, 16, 16)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detener))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(102, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fc = new JFileChooser();
        WindowsFileChooserUI wui = new WindowsFileChooserUI(fc);
        wui.installUI(fc);
        fc.setDialogTitle("Elige la imagen a convertir");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            jButton1.setEnabled(false);
            arr.clear();
            porcentaje.setText("Abriendo carpeta ...");
            DefaultTableModel mod = (DefaultTableModel) tabla.getModel(); 
            mod.setRowCount(0);  
            dir = fc.getSelectedFile();
            dato = dir.getPath();
            String dire[];
            dire = dir.list();
            hayimagenes = false;
            if (dire == null) {
                JOptionPane.showMessageDialog(this, "No hay nada en el directorio");
            } else {
                t = new Thread() {
                    public void run() {
                        detener.setVisible(true);
                        for (int x = 0; x < dire.length; x++) { 
                            percent = (x * 100) / dire.length;
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    jProgressBar1.setValue(percent);                                    
                                }
                            });

                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                            }
                            
                            File nuevo = new File(dato + "/" + dire[x]);
                            ext = nuevo.getName();
                            int index = ext.lastIndexOf('.');
                            if (index == -1) {
                                ext = "";
                            } else {
                                ext = ext.substring(index);
                            }
                            if (ext.equalsIgnoreCase(".jpg") || ext.equalsIgnoreCase(".png") || ext.equalsIgnoreCase(".gif")) {
                                double bytes = nuevo.length();
                                double kilobytes = (bytes / 1024);
                                double megabytes = (kilobytes / 1024);

                                int aux = (int) (kilobytes * 100);
                                kilobytes = aux / 100d;

                                imagen = new ImageIcon(nuevo.getPath());
                                alto = imagen.getIconHeight();
                                ancho = imagen.getIconWidth();

                                mod.addRow(new Object[]{nuevo.getName(), ext, kilobytes + " Kbs", ancho + " x " + alto});
                                arr.add(nuevo);
                                hayimagenes = true;
                            }
                        }
                        if (hayimagenes) {
                            pasarEnabled(true);
                            jComboBox2.setEnabled(false);
                            jnuevoalto.setEnabled(false);
                            jnuevoancho.setEditable(false);                    
                        } else {
                            JOptionPane.showMessageDialog(ConversorCarpeta.this, "No hay imagenes en esta carpeta");
                        }
                        jProgressBar1.setValue(0);
                        porcentaje.setText("");
                        jButton1.setEnabled(true);
                        detener.setVisible(false);
                    }
                };
                t.start();
            }                        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!arr.isEmpty()) {           
            fc.setDialogTitle("Elige la carpeta donde quieres guardar");
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int respuesta = fc.showSaveDialog(this);            

            t = new Thread() {
                public void run() {
                    jButton1.setEnabled(false);
                    pasarEnabled(false);
                    jProgressBar1.setValue(0);
                    porcentaje.setText("Convirtiendo... ");
                    detener.setVisible(true);
                    for (int i = 0; i < arr.size(); i++) {

                        percent = (i * 100) / arr.size();

                        SwingUtilities.invokeLater(new Runnable() {
                            public void run() {
                                jProgressBar1.setValue(percent);
                                porcentaje.setText(percent + "%");
                            }
                        });

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }

                        File aa = arr.get(i);
                        imagen = new ImageIcon(aa.getPath());
                        alto = imagen.getIconHeight();
                        ancho = imagen.getIconWidth();

                        if (ancho > alto) {
                            nancho = 300;
                            nalto = (300 * alto) / ancho;
                        } else {
                            nalto = 300;
                            nancho = (300 * ancho) / alto;
                        }

                        if (!toriginal.isSelected()) {
                            try {
                                alto = Integer.parseInt(jnuevoalto.getText().toString());
                                ancho = Integer.parseInt(jnuevoancho.getText().toString());
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(ConversorCarpeta.this, "Error de tamaño");
                            }                            
                        }

                        imagenrecogida = imagen.getImage();
                        img = imagenrecogida.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                        ImageIcon fin = new ImageIcon(img);
                        lblImagen2.setIcon(fin);
                        lblImagen2.setHorizontalAlignment(SwingConstants.CENTER);

                        Image a = imagenrecogida.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
                        gimg = new ImageIcon(a);

                        if (jCheckBox2.isSelected()) {
                            extension = aa.getName().substring(aa.getName().lastIndexOf(".") + 1);
                            ruta = aa.getName();
                        } else {
                            extension = jComboBox2.getSelectedItem().toString();
                            ruta = aa.getName().substring(0, aa.getName().lastIndexOf(".") + 1) + extension;
                        }
                        File guardarprev = fc.getSelectedFile();
                        String subcarpeta = guardarprev.getPath();
                        File b = new File(subcarpeta + "/" + ruta);
                        FiltroBalanceBlanco fbb = new FiltroBalanceBlanco();

                        try {
                            BufferedImage bii = new BufferedImage(a.getWidth(null), a.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                            BufferedImage bi = fbb.filtrar(bii);
                            Graphics2D g2 = bi.createGraphics();
                            g2.drawImage(a, 0, 0, null);
                            g2.dispose();
                            ImageIO.write(bi, extension, b);
                        } catch (IOException ex) {
                            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                    arr.clear();
                    jProgressBar1.setValue(100);
                    porcentaje.setText("100%");
                    JOptionPane.showMessageDialog(ConversorCarpeta.this, "Terminado");
                    detener.setVisible(false);
                    DefaultTableModel mod = (DefaultTableModel) tabla.getModel();
                    mod.setRowCount(0);
                    jProgressBar1.setValue(0);
                    porcentaje.setText("");
                    jButton1.setEnabled(true);                    
                    pasarEnabled(false);                    
                }
            };
            
            if (respuesta == JFileChooser.APPROVE_OPTION) {
                t.start();
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {
            jComboBox2.setEnabled(false);
        } else {
            jComboBox2.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void toriginalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toriginalActionPerformed
        if (toriginal.isSelected()) {
            jnuevoalto.setEnabled(false);
            jnuevoancho.setEditable(false);
        } else {
            jnuevoalto.setEnabled(true);
            jnuevoancho.setEditable(true);
        }
    }//GEN-LAST:event_toriginalActionPerformed

    private void jnuevoaltoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnuevoaltoKeyReleased
        num = jnuevoalto.getText();
        try {
            Integer.parseInt(num);
        } catch (Exception e) {
            if(num.length() > 0){
                num = num.substring(0,num.length()-1);
                jnuevoalto.setText(num);
            }
        }
    }//GEN-LAST:event_jnuevoaltoKeyReleased

    private void jnuevoaltoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnuevoaltoKeyPressed

    }//GEN-LAST:event_jnuevoaltoKeyPressed

    private void jnuevoanchoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jnuevoanchoKeyReleased
        num2 = jnuevoancho.getText();
        try {
            Integer.parseInt(num2);
        } catch (Exception e) {
            if(num2.length() > 0){
                num2 = num2.substring(0,num2.length()-1);
                jnuevoancho.setText(num2);
            }            
        }
    }//GEN-LAST:event_jnuevoanchoKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Ventana cc = new Ventana();
        cc.setVisible(true);
        cc.setTitle("Reductor de imagenes");
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerActionPerformed
        t.stop();
        arr.clear();
        jProgressBar1.setValue(0);
        porcentaje.setText("");
        pasarEnabled(true);
        jComboBox2.setEnabled(false);
        jnuevoalto.setEnabled(false);
        jnuevoancho.setEditable(false);
        detener.setVisible(false);
        jButton2.setEnabled(false);
        jButton1.setEnabled(true);
        DefaultTableModel mod = (DefaultTableModel) tabla.getModel();
        mod.setRowCount(0);
    }//GEN-LAST:event_detenerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton detener;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jnuevoalto;
    private javax.swing.JTextField jnuevoancho;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel porcentaje;
    private javax.swing.JTable tabla;
    private javax.swing.JCheckBox toriginal;
    // End of variables declaration//GEN-END:variables
}
