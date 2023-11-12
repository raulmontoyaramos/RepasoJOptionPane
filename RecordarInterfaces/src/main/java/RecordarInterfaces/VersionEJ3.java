package RecordarInterfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VersionEJ3 {

    public static void main(String[] args) {

        // Crear una instancia de JFrame
        JFrame ventana = new JFrame("Mi primera ventana en código 2DAM");
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();

        // Crear un botón
        JButton boton1 = new JButton("Haz click");
        JButton boton2 = new JButton("Otro botón");
        JButton boton3 = new JButton("Cerrar ventana");

        // Crear una etiqueta
        JLabel etiqueta = new JLabel("Hola Raúl");

        // Agregar la etiqueta y los botones al panel
        panel.add(etiqueta);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        // Agregar el panel a la ventana
        ventana.add(panel);

        // Acción al hacer clic en el primer botón
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
                        JOptionPane.QUESTION_MESSAGE);
                if (nombre != null) {
                    JOptionPane.showMessageDialog(ventana, "Hola " + nombre, "Saludo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Acción al hacer clic en el segundo botón
        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ventana, "Has presionado otro botón", "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // Acción al hacer clic en el tercer botón (cierra la ventana)
        boton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}