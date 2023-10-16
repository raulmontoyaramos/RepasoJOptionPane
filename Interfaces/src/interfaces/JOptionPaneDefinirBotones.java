package interfaces;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class JOptionPaneDefinirBotones {

	public static void main(String[] args) {
		// Configura los textos de los botones
		String nombre = JOptionPane.showInputDialog(null, "Dime tu nombre", "Datos personales",
				JOptionPane.QUESTION_MESSAGE);
		if (nombre != null) {
			JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
		} else {
			JOptionPane.showMessageDialog(null, "Has pulsado cancelar");
		}

		UIManager.put("OptionPane.yesButtonText", "Si");
		UIManager.put("OptionPane.noButtonText", "No");

		int codigo = JOptionPane.showConfirmDialog(null, "¿Niño dame argo, no?", "ARFAVO",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (codigo == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Grasia manoo ", "olee", JOptionPane.INFORMATION_MESSAGE);
		} else if (codigo == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "TOPOTAMADRE", "PROBLEMAS", JOptionPane.INFORMATION_MESSAGE);
		} else {
			System.out.println("ILLO TU MASCUCHAO??");
		}
	}

}
