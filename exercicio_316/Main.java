package exercicio_316;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		String nome = "";
		String sobrenome = "";
		int dia = 0;
		int mes = 0;
		int ano = 1993;

		nome = JOptionPane.showInputDialog("digite o nome");

		sobrenome = JOptionPane.showInputDialog("digite o sobrenome");

		dia = Integer.parseInt(JOptionPane.showInputDialog("digite o dia do nascimento"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("digite o mes do nascimento"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("digite o ano do nascimento"));

		HeartRates taxas = new HeartRates(nome, sobrenome, dia, mes, ano);
		
		
		int idade = taxas.calculaIdade(ano);
		int frequenciaMaxima = taxas.frequenciaCardiacaMaxima(idade);
		double[] frequenciaAlvo = taxas.frequenciaAlvo(frequenciaMaxima);
		
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nData de nascimento: " + dia + "/" + mes + "/" + ano + "\n"
				+ "Idade:" + idade + "\n"
						+ "Frequencia cardiaca maxima:"
						+ frequenciaMaxima + "\n"
								+ "Frequencia alvo: " + frequenciaAlvo[0] + " - " + frequenciaAlvo[1]);

	}
}
