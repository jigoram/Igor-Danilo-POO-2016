package exercicio_225;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero"));

		if (numero % 2 != 0) {
			JOptionPane.showMessageDialog(null, "numero Impar");
		}

		else {
			JOptionPane.showMessageDialog(null, "numero par");
		}
	}
}
