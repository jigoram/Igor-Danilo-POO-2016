package exercicio_313;

import javax.swing.JOptionPane;

public class InvoiceTest {
	public static void main(String[] args) {

		String numero = "";
		String descricao = "";
		int quantidadeComprada = 0;
		double precoItem = 0;
		int opc = 99;
		
		Invoice fatura = new Invoice(numero, descricao, quantidadeComprada, precoItem);

		
		while (opc !=0){
		
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Numero do produto \n"
															+ "2- Descrição do produto \n"
															+ "3- Quantidade de produtos comprada \n"
															+ "4- Preço do item \n"
															+ "5- Calcular quantidade da fatura \n"
															+ "0- Sair"));
			
			
			if(opc == 1){
				numero = JOptionPane.showInputDialog("Numero do produto");
				fatura.setNumero(numero);
			}
		
			if(opc == 2){
				descricao = JOptionPane.showInputDialog("Descrição do produto");
				fatura.setDescricao(descricao);
			}
			if(opc == 3){
				quantidadeComprada = Integer.parseInt(JOptionPane.showInputDialog("Quantidade comprada"));
				fatura.setQuantidadeComprada(quantidadeComprada);
			}
			if(opc == 4){
				precoItem = Integer.parseInt(JOptionPane.showInputDialog("Preço do produto"));
				fatura.setPrecoItem(precoItem);;
			}
			if(opc == 5){
				
				double result = fatura.getInvoiceAmount(quantidadeComprada, precoItem);
				
				JOptionPane.showMessageDialog(null, result);
				
			}
		
	
		}
	}

}