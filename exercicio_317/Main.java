package exercicio_317;

import javax.swing.JOptionPane;

import exercicio_316.HeartRates;

public class Main {
	public static void main(String[] args) {

		String nome = "";
		String sobrenome = "";
		int dia = 0;
		int mes = 0;
		int ano = 0;
		double altura = 0;
		double peso = 0;

		nome = JOptionPane.showInputDialog("digite o nome");

		sobrenome = JOptionPane.showInputDialog("digite o sobrenome");

		dia = Integer.parseInt(JOptionPane.showInputDialog("digite o dia do nascimento"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("digite o mes do nascimento"));
		ano = Integer.parseInt(JOptionPane.showInputDialog("digite o ano do nascimento"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("digite a altura (em polegadas))"));
		peso = Integer.parseInt(JOptionPane.showInputDialog("digite o peso (em libras)"));
		
		HealthProfile perfil = new HealthProfile(nome, sobrenome, dia, mes, ano, altura, peso);

		int idade = perfil.calculaIdade(ano);
		int frequenciaMaxima = perfil.frequenciaCardiacaMaxima(idade);
		double[] frequenciaAlvo = perfil.frequenciaAlvo(frequenciaMaxima);
		double imc = perfil.calculaIMC(altura, peso);
		JOptionPane.showMessageDialog(null,
				"Nome: " + nome + "\nSobrenome: " + sobrenome + "\nData de nascimento: " + dia + "/" + mes + "/" + ano
						+ "\n" + "Idade:" + idade + "\n" + "Frequencia cardiaca maxima:" + frequenciaMaxima + "\n"
						+ "Frequencia alvo: " + frequenciaAlvo[0] + " - " + frequenciaAlvo[1] +" \nIMC: " + imc);

	}
}
