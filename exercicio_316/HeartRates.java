package exercicio_316;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class HeartRates {

	String nome;
	String sobrenome;
	int dia;
	int mes;
	int ano;

	public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public static int calculaIdade(int ano) {


		int idade = 2016 - ano;
		
		return idade;
	}

	public int frequenciaCardiacaMaxima(int idade) {


		
		int frequencia = 220 - idade;

		return frequencia ;
	}
	
	public  double[] frequenciaAlvo(int frequencia) {

		double[] resultado = new double[2];

		resultado[0] = (frequencia *50 )/100;
		resultado[1] = (frequencia *85 )/100;
		
		
		return resultado;
	}
}
