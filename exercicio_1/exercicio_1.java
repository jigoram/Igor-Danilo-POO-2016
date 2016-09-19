package exercicio_1;

import javax.swing.JOptionPane;

public class exercicio_1 {


	public static void multiplicador(int[][] array1, int[][] array2) {

		int[][] array3 = new int[array1.length][array2[0].length];
		String exibe = "";
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				for (int k = 0; k < array1[i].length; k++) {
					array3[i][j] += array1[i][k] * array2[k][j];
				}
			}
		}

		
		
		for(int i=0; i<array3.length; i++){
			
			exibe += "\n" ;
			for (int j = 0; j < array3[i].length; j++) {
		
				exibe += array3[i][j] + " ";
				
		}
			
			
		}
		
		JOptionPane.showMessageDialog(null, exibe);
	}

	public static void main(String[] args) {

		int linhas = 0;
		int colunas = 0;
		int linhas2 = 0;
		int colunas2 = 0;

		linhas = Integer
				.parseInt(JOptionPane
						.showInputDialog("digite o numero de linhas do primeiro array"));
		colunas = Integer
				.parseInt(JOptionPane
						.showInputDialog("digite o numero de colunas do primeiro array"));

		linhas2 = Integer.parseInt(JOptionPane
				.showInputDialog("digite o numero de linhas do segundo array"));
		colunas2 = Integer
				.parseInt(JOptionPane
						.showInputDialog("digite o numero de colunas do segundo array"));

		int[][] array1 = new int[linhas][colunas];
		int[][] array2 = new int[linhas2][colunas2];

		for (int m = 0; m < array1.length; m++) {
			for (int n = 0; n < array1[0].length; n++) {
				array1[m][n] = Integer.parseInt(JOptionPane
						.showInputDialog("digite o valor array 1"));
			}
		}

		for (int m = 0; m < array2.length; m++) {
			for (int n = 0; n < array2[0].length; n++) {
				array2[m][n] = Integer.parseInt(JOptionPane
						.showInputDialog("digite o valor array 2"));
			}
		}

		multiplicador(array1, array2);

	}
}
