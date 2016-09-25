package exercicio_216;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {

		
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		
		
		if(numero1 > numero2){
			JOptionPane.showMessageDialog(null, numero1 + " is larger");
		}
		

		if(numero1 < numero2){
			JOptionPane.showMessageDialog(null, numero2 + " is larger");
		}
		

		if(numero1 == numero2){
			JOptionPane.showMessageDialog(null, "these numbers are equal");
		}
		
		
}
}
