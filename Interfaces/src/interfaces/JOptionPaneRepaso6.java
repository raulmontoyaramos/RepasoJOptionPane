package interfaces;

import javax.swing.JOptionPane;

public class JOptionPaneRepaso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo = JOptionPane.showConfirmDialog(null, "¿Niño dame argo, no?", "ARFAVO",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (codigo == JOptionPane.YES_OPTION) {
			System.out.println("Grasia supolla");
		} else if (codigo == JOptionPane.NO_OPTION) {
			System.out.println("TOPOTAMADRE");
		} else {
			System.out.println("ILLO TU MASCUCHAO??");
		}

	}

}
