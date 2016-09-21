package exercicio_314;

public class Employee {

	public Employee(String primeiroNome, String segundoNome, double salarioMensal) {
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.salarioMensal = salarioMensal;
	}

	String primeiroNome;
	String segundoNome;
	double salarioMensal;

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
