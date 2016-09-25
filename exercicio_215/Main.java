package exercicio_215;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		
		int soma = numero1 + numero2;
		int produto = numero1 * numero2;
		int diferenca = numero1 - numero2;
		double quociente = numero1 / numero2;
		
		JOptionPane.showMessageDialog(null, soma + "\n" + produto + "\n" + diferenca + "\n" + quociente);
	}

}