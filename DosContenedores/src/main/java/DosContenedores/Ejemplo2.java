package DosContenedores;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Ejemplo2 extends JFrame {
    private JLabel etiquetaMensaje;
    private JLabel etiquetaMensaje2;

    public Ejemplo2() {
        setTitle("Ejemplo con Dos Contenedores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelBotones = new JPanel();
        JPanel panelVentanas = new JPanel(); // Nuevo panel para los botones ventana1, ventana2 y ventana3
        JPanel panelMensaje = new JPanel();
        JPanel panelMensaje2 = new JPanel();

        etiquetaMensaje = new JLabel("Mensaje: ");
        etiquetaMensaje2 = new JLabel("Bienvenido: ");

        String text = etiquetaMensaje.getText();
        String text2 = etiquetaMensaje2.getText();

        for (int i = 1; i <= 3; i++) {
            JButton boton = new JButton("Boton " + i);
            JButton botonVentana = new JButton("Ventana " + i);
            final int numVentana = i;
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String textoBoton = ((JButton) e.getSource()).getText();

                    etiquetaMensaje.setText(text + textoBoton);
                    etiquetaMensaje2.setText(text2 + textoBoton + " Otra vez");
                }
            });
            
            botonVentana.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    abrirNuevaVentana("Has pulsado la ventana" + numVentana);
                }
            });
            panelBotones.add(boton);
            panelVentanas.add(botonVentana);
        }

        setLayout(new BorderLayout());
        add(panelMensaje2, BorderLayout.NORTH);
        add(panelMensaje, BorderLayout.CENTER); 
        add(panelBotones, BorderLayout.SOUTH);
        add(panelVentanas, BorderLayout.AFTER_LAST_LINE);
        panelMensaje.add(etiquetaMensaje);
        panelMensaje2.add(etiquetaMensaje2);

        pack();
        setVisible(true);
    }

    public void abrirNuevaVentana(String mensaje) {
        JFrame nuevaVentana = new JFrame();
        nuevaVentana.setTitle("Nueva Ventana");
        nuevaVentana.setSize(250, 150);

        JLabel etiquetaNueva = new JLabel(mensaje);

        nuevaVentana.add(etiquetaNueva);

        nuevaVentana.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo2();
            }
        });
    }
}