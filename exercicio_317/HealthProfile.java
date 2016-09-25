package exercicio_317;

public class HealthProfile {

	String nome;
	String sobrenome;
	int dia;
	int mes;
	int ano;
	double altura;
	double peso;

	public HealthProfile(String nome, String sobrenome, int dia, int mes, int ano, double altura, double peso) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.altura = altura;
		this.peso = peso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static int calculaIdade(int ano) {

		int idade = 2016 - ano;

		return idade;
	}

	public int frequenciaCardiacaMaxima(int idade) {

		int frequencia = 220 - idade;

		return frequencia;
	}

	public double[] frequenciaAlvo(int frequencia) {

		double[] resultado = new double[2];

		resultado[0] = (frequencia * 50) / 100;
		resultado[1] = (frequencia * 85) / 100;

		return resultado;
	}

	public static double calculaIMC(double altura, double peso) {
		double alturaConvertida = altura * 0.0254;
		double pesoConvertido = peso* 0.453592;
		
		double imc = pesoConvertido/ (alturaConvertida * alturaConvertida);
		
		return imc;
	}
}
