/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_crc;

import domain.AlgoritmoCRC;
import static interface_crc.EmisorCRC.rolLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class PanelEmisor extends javax.swing.JPanel {

    /**
     * Creates new form PanelEmisor
     */
    AlgoritmoCRC crc = new AlgoritmoCRC();
    PanelReceptor pr = new PanelReceptor();

    public String mensaje;
    public String pGnerador;
    public String tx;
    public String valorCRC;

    public PanelEmisor(String mensaje, String generador, String crc, String tx) {
        this();
        mensajeText.setText(mensaje);
        generadorText.setText(generador);
        crcText.setText(crc);
        txText.setText(tx);
        mensajeText.setForeground(Color.black);
        generadorText.setForeground(Color.black);
        crcText.setForeground(Color.black);
        txText.setForeground(Color.black);
        generarCRC();
        mensajeText.setEnabled(true);
        generadorText.setEnabled(true);
        mensajeText.setText(mensaje);
        generadorText.setText(generador);
        crcText.setText(crc);
        txText.setText(tx);
        mensajeText.setForeground(Color.black);
        generadorText.setForeground(Color.black);
        crcText.setForeground(Color.black);
        txText.setForeground(Color.black);
        panelBotonCRC.setEnabled(true);
        generadorCRCLabel.setEnabled(true);
    }

    public PanelEmisor() {
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

        backGround = new javax.swing.JPanel();
        mensajeLabel = new javax.swing.JLabel();
        mensajeText = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        generador = new javax.swing.JLabel();
        generadorText = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        panelBotonCRC = new javax.swing.JPanel();
        generadorCRCLabel = new javax.swing.JLabel();
        crcLabel = new javax.swing.JLabel();
        crcText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txLabel = new javax.swing.JLabel();
        txText = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panelBotonEnviar = new javax.swing.JPanel();
        enviarLabel = new javax.swing.JLabel();

        setName("PanelEmisor"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backGround.setBackground(new java.awt.Color(255, 255, 255));
        backGround.setForeground(new java.awt.Color(255, 255, 255));
        backGround.setName(""); // NOI18N

        mensajeLabel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(0, 0, 0));
        mensajeLabel.setText("D");

        mensajeText.setBackground(new java.awt.Color(255, 255, 255));
        mensajeText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        mensajeText.setForeground(new java.awt.Color(204, 204, 204));
        mensajeText.setText("Ingrese mensaje en binario");
        mensajeText.setBorder(null);
        mensajeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mensajeTextMousePressed(evt);
            }
        });
        mensajeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensajeTextActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        generador.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        generador.setForeground(new java.awt.Color(0, 0, 0));
        generador.setText("G");

        generadorText.setBackground(new java.awt.Color(255, 255, 255));
        generadorText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        generadorText.setForeground(new java.awt.Color(204, 204, 204));
        generadorText.setText("Ingrese generador en binario");
        generadorText.setBorder(null);
        generadorText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                generadorTextMousePressed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        panelBotonCRC.setBackground(new java.awt.Color(13, 134, 134));

        generadorCRCLabel.setBackground(new java.awt.Color(255, 255, 255));
        generadorCRCLabel.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        generadorCRCLabel.setForeground(new java.awt.Color(255, 255, 255));
        generadorCRCLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        generadorCRCLabel.setText("GENERAR CRC");
        generadorCRCLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generadorCRCLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generadorCRCLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                generadorCRCLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                generadorCRCLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBotonCRCLayout = new javax.swing.GroupLayout(panelBotonCRC);
        panelBotonCRC.setLayout(panelBotonCRCLayout);
        panelBotonCRCLayout.setHorizontalGroup(
            panelBotonCRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonCRCLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(generadorCRCLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonCRCLayout.setVerticalGroup(
            panelBotonCRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(generadorCRCLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        crcLabel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        crcLabel.setForeground(new java.awt.Color(0, 0, 0));
        crcLabel.setText("CRC");

        crcText.setBackground(new java.awt.Color(255, 255, 255));
        crcText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        crcText.setForeground(new java.awt.Color(204, 204, 204));
        crcText.setText("CRC en binario");
        crcText.setBorder(null);
        crcText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crcTextActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        txLabel.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txLabel.setForeground(new java.awt.Color(0, 0, 0));
        txLabel.setText("TX");

        txText.setBackground(new java.awt.Color(255, 255, 255));
        txText.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txText.setForeground(new java.awt.Color(204, 204, 204));
        txText.setText("TX en binario");
        txText.setBorder(null);
        txText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTextActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        panelBotonEnviar.setBackground(new java.awt.Color(13, 134, 134));

        enviarLabel.setBackground(new java.awt.Color(255, 255, 255));
        enviarLabel.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        enviarLabel.setForeground(new java.awt.Color(255, 255, 255));
        enviarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enviarLabel.setText("ENVIAR");
        enviarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enviarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enviarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enviarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBotonEnviarLayout = new javax.swing.GroupLayout(panelBotonEnviar);
        panelBotonEnviar.setLayout(panelBotonEnviarLayout);
        panelBotonEnviarLayout.setHorizontalGroup(
            panelBotonEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonEnviarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(enviarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonEnviarLayout.setVerticalGroup(
            panelBotonEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(enviarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensajeLabel)
                    .addComponent(mensajeText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generador)
                    .addComponent(generadorText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crcLabel)
                    .addComponent(crcText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txLabel)
                    .addComponent(txText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBotonCRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBotonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mensajeLabel)
                .addGap(8, 8, 8)
                .addComponent(mensajeText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(generador)
                .addGap(18, 18, 18)
                .addComponent(generadorText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelBotonCRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(crcLabel)
                .addGap(8, 8, 8)
                .addComponent(crcText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txLabel)
                .addGap(8, 8, 8)
                .addComponent(txText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBotonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void mensajeTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mensajeTextMousePressed
        if (mensajeText.getText().equals("Ingrese mensaje en binario")) {
            mensajeText.setText("");
            mensajeText.setForeground(Color.black);
        }
        if (generadorText.getText().isEmpty()) {
            generadorText.setText("Ingrese generador en binario");
            generadorText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_mensajeTextMousePressed

    private void mensajeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensajeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mensajeTextActionPerformed

    private void generadorTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generadorTextMousePressed
        if (generadorText.getText().equals("Ingrese generador en binario")) {
            generadorText.setText("");
            generadorText.setForeground(Color.black);

        }
        if (mensajeText.getText().isEmpty()) {
            mensajeText.setText("Ingrese mensaje en binario");
            mensajeText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_generadorTextMousePressed

    private void generadorCRCLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generadorCRCLabelMouseEntered
        panelBotonCRC.setBackground(new Color(12, 99, 93));
    }//GEN-LAST:event_generadorCRCLabelMouseEntered

    private void generadorCRCLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generadorCRCLabelMouseExited
        panelBotonCRC.setBackground(new Color(13, 134, 134));
    }//GEN-LAST:event_generadorCRCLabelMouseExited

    private void crcTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crcTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crcTextActionPerformed

    private void txTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTextActionPerformed

    /**
     * Accion programada del para enviar la informacion al receptor llamando al
     * metodo enviarPanelReceptor
     */

    private void enviarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarLabelMouseClicked

        mostrarPanelReceptor();
        rolLabel.setText("RECEPTOR");
    }//GEN-LAST:event_enviarLabelMouseClicked
    /**
     * Metodo implementado para que cambie al panel Receptor y pase la
     * informacion de del tx y el crc, asi como tambien valide si se realizo
     * algun cambio el tx desde el panel emisor si es asi muestre un mensaje si
     * este fue modificado
     */
    public void mostrarPanelReceptor() {

        try {
            /**
             * Se extrae con la variable tx el texto respetivo se realiza el
             * proceso convertirlo a arreglo y llmamar al metodo algoritmoCRC
             * pasando como parametro el arreglo convertido a Integer
             */
            this.tx = txText.getText();
            Integer[] txEnteros = crc.convertirStringToArray(this.tx);
            Integer[] resultadoCRC = crc.algoritmoCRC(txEnteros);
            String dato = crc.ArrayToString(resultadoCRC);
            int validador = Integer.parseInt(dato);
            /**
             * Se valida si el dato del validador es 0 si es asi manda el
             * mensaje correctos de lo contrario mensaje incorrecto
             */
            if (validador == 0) {
                pr = new PanelReceptor("Mensaje Correcto!", String.valueOf(validador), tx, this.mensaje, this.pGnerador);
                mostrarPanel(pr);

            } else {
                pr = new PanelReceptor("Mensaje Incorrecto!", String.valueOf(validador), tx, this.mensaje, this.pGnerador);
                mostrarPanel(pr);

            }
            this.setVisible(false);
            pr.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede modificar el tamaño del TX");
        }
    }

    public void mostrarPanel(JPanel p) {
        p.setSize(510, 430);
        p.setLocation(0, 0);
        EmisorCRC.contenedor.removeAll();
        EmisorCRC.contenedor.add(p, BorderLayout.CENTER);
        EmisorCRC.contenedor.revalidate();
        EmisorCRC.contenedor.repaint();
    }

    private void enviarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarLabelMouseEntered
        panelBotonEnviar.setBackground(new Color(12, 99, 93));
    }//GEN-LAST:event_enviarLabelMouseEntered

    private void enviarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarLabelMouseExited
        panelBotonEnviar.setBackground(new Color(13, 134, 134));
    }//GEN-LAST:event_enviarLabelMouseExited


    private void generadorCRCLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generadorCRCLabelMouseClicked
        generarCRC();
    }//GEN-LAST:event_generadorCRCLabelMouseClicked

    public void generarCRC() {
        this.mensaje = mensajeText.getText();
        this.pGnerador = generadorText.getText();
        /**
         * Se llama a al metodo validador para verificar los String ingresados
         */
        boolean validadorMensaje = crc.validador(this.mensaje);
        boolean valiadadorPgenerador = crc.validador(this.pGnerador);
        /**
         * Si el metodo validador regresa true en ambos caso que procede a crear
         * el arreglo en tiempo de ejecucion asi como tambien a ejecutar el
         * metodo para convertir el String en un arreglo numerico para asi poder
         * realizar el calculo de crc
         */
        if (validadorMensaje) {
            if (valiadadorPgenerador) {
                /**
                 * Se habilitan la cajas de texto para el crc y tx se
                 * deshabilant el boton de generar crc, d y g
                 */
                mensajeText.setText("");
                generadorText.setText("");
                mensajeText.setEnabled(false);
                generadorText.setEnabled(false);
                panelBotonCRC.setEnabled(false);
                generadorCRCLabel.setEnabled(false);
                crcText.setEnabled(false);
                crcText.setDisabledTextColor(Color.black);
                txText.setEnabled(true);
                txText.setForeground(Color.black);
                panelBotonEnviar.setEnabled(true);
                enviarLabel.setEnabled(true);
                /**
                 * Se obtiene los tamaños y se manda a llamar al metodo para
                 * crear el vector en tiempo de ejecucion
                 */
                int tamanioMensaje = mensaje.length();
                int tamanioPGenerador = pGnerador.length();
                crc.crearArreglos(tamanioMensaje, tamanioPGenerador);
                /**
                 * Se llama al metodo convertirStringToArray(String mensaje,
                 * String generador) para pasar como parametros la cadena del
                 * mensaje y generador para convertirlos en arreglos de enteros
                 */
                crc.convertirStringToArray(this.mensaje, this.pGnerador);
                /**
                 * Se llama al metodo combinar arreglo para que genere el
                 * arreglo del mensaje junto al r
                 */
                Integer[] nuevoMensaje = crc.combinarArreglos(crc.mensajes, crc.r);
                /**
                 * Se llama al metodo algoritmoCRC()para obtener el crc
                 */
                Integer[] resultadoCRC = crc.algoritmoCRC(nuevoMensaje);
                /**
                 * El resultado del crc se combina con el mensaje para obtener
                 * el TX
                 */
                Integer[] TX = crc.combinarArreglos(crc.mensajes, resultadoCRC);

                /**
                 * Se envian a los JtextFiield los datos con los string
                 * correspondientes a el crc y tx
                 */
                this.valorCRC = crc.ArrayToString(resultadoCRC);
                crcText.setText(this.valorCRC);
                txText.setText(crc.ArrayToString(TX));

            } else {
                JOptionPane.showMessageDialog(null, "El Polinomio generador ingresador tiene un caracter invalido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El mensaje ingresador tiene un caracter invalido");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel backGround;
    public javax.swing.JLabel crcLabel;
    public javax.swing.JTextField crcText;
    public javax.swing.JLabel enviarLabel;
    public javax.swing.JLabel generador;
    public javax.swing.JLabel generadorCRCLabel;
    public javax.swing.JTextField generadorText;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel mensajeLabel;
    public javax.swing.JTextField mensajeText;
    public javax.swing.JPanel panelBotonCRC;
    public javax.swing.JPanel panelBotonEnviar;
    public javax.swing.JLabel txLabel;
    public javax.swing.JTextField txText;
    // End of variables declaration//GEN-END:variables
}