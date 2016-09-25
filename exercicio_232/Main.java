package exercicio_232;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro numero"));
		int numero4 = Integer.parseInt(JOptionPane.showInputDialog("digite o quarto numero"));
		int numero5 = Integer.parseInt(JOptionPane.showInputDialog("digite o quinto numero"));
		
		
		int positivos = 0;
		int zeros = 0;
		int negativos = 0;
		
		
		if(numero1 > 0){
			positivos ++;
		}
		if(numero1 < 0){
			negativos ++;
		}
		if(numero1 == 0){
			zeros ++;
		}
		
		
		if(numero2> 0){
			positivos ++;
		}
		if(numero2 < 0){
			negativos ++;
		}
		if(numero2 == 0){
			zeros ++;
		}
		
		
		if(numero3 > 0){
			positivos ++;
		}
		if(numero3 < 0){
			negativos ++;
		}
		if(numero3 == 0){
			zeros ++;
		}
	
	
		if(numero4 > 0){
			positivos ++;
		}
		if(numero4 < 0){
			negativos ++;
		}
		if(numero4 == 0){
			zeros ++;
		}
	
	
		
		if(numero5 > 0){
			positivos ++;
		}
		if(numero5 < 0){
			negativos ++;
		}
		if(numero5 == 0){
			zeros ++;
		}
	
		String result  = "Positivos: " + positivos +"\nNegativos: " + negativos + "\nZeros: " + zeros;
		
		JOptionPane.showMessageDialog(null, result);
	
	}
}
