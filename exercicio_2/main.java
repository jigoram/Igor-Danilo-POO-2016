package exercicio_2;

import javax.swing.JOptionPane;

public class main {

	public static void fatorial(int numero){
		int result = 1;
		for(int i= numero; i >0; i--){
			result *= i;
		}
		
		
		JOptionPane.showMessageDialog(null, result);
	}
	
	
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite o numero para o fatorial"));
		
		fatorial(numero);
		
	}
}
