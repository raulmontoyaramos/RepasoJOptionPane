package interfaces;

import javax.swing.JOptionPane;

public class JOptionPane1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Raul";
		//null indica que es independiente, y no está vinculado a ninguna ventana ex...
		JOptionPane.showMessageDialog(null, "Bienvenido "+nombre);
	}

}
