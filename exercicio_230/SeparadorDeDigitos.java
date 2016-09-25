package exercicio_230;

import javax.swing.JOptionPane;

//show esse exercicio, mt util e so tinha feito uma vez anos atras

public class SeparadorDeDigitos {
	public static void main(String[] args) {
		
		String digitos = JOptionPane.showInputDialog("digirte numeros (ex: 54321)");
		String novoValor = "";
		String numDeDigitos = String.valueOf(digitos);
		
		
		for(int i =0; i<numDeDigitos.length(); i++ ){
			novoValor = novoValor + numDeDigitos.substring(i, i+1) + "   ";
		}
		
		JOptionPane.showMessageDialog(null, novoValor);
	}

}