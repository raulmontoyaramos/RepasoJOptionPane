package RecordarInterfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VentanaJFrameCódigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame("mi primera ventana en código 2DAM");
		ventana.setSize(400, 400);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JLabel texto = new JLabel("Hola Raul");
//		ventana.getContentPane().add(texto);
		JButton boton = new JButton("Haz click");
		ventana.add(boton);

		boton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// al asociar el JOptionPane con la ventana ésta aparece en el mismo sitio
				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos personales",
						JOptionPane.QUESTION_MESSAGE);
			}

		});

		ventana.setVisible(true);

	}

}
