package Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjercicioMenu extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1, mi2, mi3;

    public EjercicioMenu() {
        setTitle("Ejemplo de Menú con JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        mb = new JMenuBar();
        setJMenuBar(mb);
        menu1 = new JMenu("Clientes");
        mb.add(menu1);

        mi1 = new JMenuItem("Añadir");
        mi1.addActionListener(this);
        menu1.add(mi1);

        mi2 = new JMenuItem("Listado");
        mi2.addActionListener(this);
        menu1.add(mi2);

        mi3 = new JMenuItem("Salir");
        mi3.addActionListener(this);
        menu1.add(mi3);
    }

    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane();
        if (e.getSource() == mi1) {
            contentPane.setBackground(new Color(255, 0, 0));
        }
        if (e.getSource() == mi2) {
            contentPane.setBackground(new Color(0, 255, 0));
        }
        if (e.getSource() == mi3) {
            contentPane.setBackground(new Color(0, 0, 255));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	EjercicioMenu formulario1 = new EjercicioMenu();
            formulario1.setBounds(10, 20, 300, 200);
            formulario1.setVisible(true);
        });
    }
}