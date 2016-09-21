package exercicio_315;

import javax.swing.JOptionPane;

public class Date {

	int mes;
	int dia;
	int ano;

	public Date(int mes,int dia,int ano){
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public void displayDate(){
		JOptionPane.showMessageDialog(null, dia + "/" + mes +"/" + ano);
	}
	
}
