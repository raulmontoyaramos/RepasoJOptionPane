package interfaces;

import javax.swing.JOptionPane;

public class JOptionPaneRepaso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//null indica que es independiente y no está vinculada a ninguna ventana existente
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales",
				JOptionPane.QUESTION_MESSAGE);
		if (nombre != null) {
			System.out.println("Bienvenido :" + nombre);
		} else {
			System.out.println("Has pulsado cancelar");
		}

	}

}
