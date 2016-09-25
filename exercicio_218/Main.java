package exercicio_218;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		String caixa = "*********\n*            *\n*            *\n*            *\n*            *\n*            *\n*            *\n*            *\n*********";
		
		String circulo = "              ***                    \n"
				       + "          *         *                \n"
				       + "        *             *              \n"
				       + "        *             *              \n"
				       + "        *             *              \n"
				       + "        *             *              \n"
				       + "        *             *              \n"
				       + "          *         *                \n"
				       + "             ***                     ";
		
		String seta = "       *      \n"
				     +"      ***     \n"
				     +"     *****    \n"
				     +"       *      \n"
				     +"       *      \n"
				     +"       *      \n"
				     +"       *      \n"
				     +"       *      \n"
				     +"       *      \n";
		
		
		String losango = "           *          \n"
					    +"          * *         \n"
					    +"         *   *        \n"
					    +"        *     *       \n"
					    +"       *       *      \n"
					    +"        *     *       \n"
					    +"         *   *        \n"
					    +"          * *         \n"
					    +"           *          ";
		
		JOptionPane.showMessageDialog(null, caixa);
		JOptionPane.showMessageDialog(null, circulo);
		JOptionPane.showMessageDialog(null, seta);
		JOptionPane.showMessageDialog(null, losango);
		
		
		
		
	}
}
