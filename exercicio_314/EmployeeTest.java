package exercicio_314;

import javax.swing.JOptionPane;

public class EmployeeTest {

	public static void main(String[] args){
		
		 Employee empregado1 = new Employee("jaquelino", "silvestre", 1000);
		 Employee empregado2 = new Employee("marcos", "pilao", 2000);
		 
		 JOptionPane.showMessageDialog(null,"salario anual de " + empregado1.getPrimeiroNome() + "\n" + empregado1.getSalarioMensal() * 12);
		 JOptionPane.showMessageDialog(null,"salario anual de " + empregado2.getPrimeiroNome() + "\n" + empregado2.getSalarioMensal() * 12);
		 
		 double aumento1 = 0;
		 aumento1 += empregado1.getSalarioMensal() + empregado1.getSalarioMensal()/10 ;
		 empregado1.setSalarioMensal(aumento1);

		 double aumento2 = 0;
		 aumento2 += empregado2.getSalarioMensal() + empregado2.getSalarioMensal()/10 ;
		 empregado2.setSalarioMensal(aumento2);
		 
		 
		 JOptionPane.showMessageDialog(null,"salario anual de " + empregado1.getPrimeiroNome() + "\n" + empregado1.getSalarioMensal() * 12);
		 JOptionPane.showMessageDialog(null,"salario anual de " + empregado2.getPrimeiroNome() + "\n" + empregado2.getSalarioMensal() * 12);
		 

	}
}
