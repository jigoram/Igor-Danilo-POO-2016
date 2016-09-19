package exercicio_313;

public class Invoice {

	public Invoice(String numero, String descricao, int quantidadeComprada, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.precoItem = precoItem;
	}

	String numero;
	String descricao;
	int quantidadeComprada;
	double precoItem;
	

	public static double getInvoiceAmount(int quantidade, double preco){
		double result = 0;
		
		
		if(quantidade < 0){
			quantidade = 0;
		}
		
		if(preco <0){
			preco = 0.0;
		}
		
		result = quantidade * preco;
		
		return result;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getNumero(){
		return this.numero;
	}

	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
	
	public void setQuantidadeComprada(int quantidadeComprada){
		this.quantidadeComprada = quantidadeComprada;
	}
	
	public int getQuantidadeComprada(){
		return this.quantidadeComprada;
	}

	
	public void setPrecoItem(double preco){
		this.precoItem = preco;
	}
	
	public double getPrecoItem(){
		return this.precoItem;
	}
	
	
}
