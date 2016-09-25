package exercicio_224;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro numero"));
		int numero4 = Integer.parseInt(JOptionPane.showInputDialog("digite o quarto numero"));
		int numero5 = Integer.parseInt(JOptionPane.showInputDialog("digite o quinto numero"));

		int maior = numero1;
		int menor = numero1;

		if (numero2 > numero1) {
			maior = numero2;
		}

		if (numero3 > maior) {
			maior = numero3;
		}

		if (numero4 > maior) {
			maior = numero4;
		}

		if (numero5 > maior) {
			maior = numero5;
		}

		if (numero2 < numero1) {
		    menor = numero2;
		}

		if (numero3 < menor) {
			menor = numero3;
		}

		if (numero4 < menor) {
			menor = numero4;
		}

		if (numero5 < menor) {
			menor = numero5;
		}

		JOptionPane.showMessageDialog(null, maior + ", " + menor); 
	}
}
