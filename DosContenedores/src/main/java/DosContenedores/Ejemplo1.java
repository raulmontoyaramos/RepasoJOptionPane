package DosContenedores;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Ejemplo1 extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaMensaje2;
	
	public Ejemplo1() {
		setTitle("Ejemplo con Dos Contenedores"); // ponemos titulo a la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // al cerrar la ventana, cerramos la aplicacion

		// creamos los contenedores
		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel panelMensaje2 = new JPanel();

		// el mensaje que aparece en la ventana
		etiquetaMensaje = new JLabel("Mensaje: ");
		etiquetaMensaje2 = new JLabel("Bienvenido: ");
		String text = etiquetaMensaje.getText();
		String text2 = etiquetaMensaje2.getText();
		// bucle donde creamos los diferentes botones
		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);
			// le añadimos el listener, para cada boton
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// extraemos el nombre del boton
					String textoBoton = ((JButton) e.getSource()).getText();
					
					etiquetaMensaje.setText(text + textoBoton);
					etiquetaMensaje2.setText(text2 + textoBoton + " Otra vez");
				}
			});
			panelBotones.add(boton);
		}
		// añadimos el layout, en este caso, borderLayout en east, west, north, south y
		// center Y AÑADIMOS
		// TANTO LOS BOTONES COMO EL PANELMENSAJE, ASI COMO EL MENSAJE DEL BOTON
		// PULSADO, 1,2,3
		setLayout(new BorderLayout());
		add(panelBotones, BorderLayout.SOUTH);
		add(panelMensaje, BorderLayout.CENTER);
		add(panelMensaje2, BorderLayout.NORTH);
		panelMensaje.add(etiquetaMensaje);
		panelMensaje2.add(etiquetaMensaje2);

		pack();// ajusta el tamaño de los elementos del jframe
		// setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// programa tareas que deben ejecutarse de manera segura, y evita concurrencia
		// que se ejecutan varias acciones al mismo tiempo e interfieran entre si
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Ejemplo1();
			}
		});

	}
}