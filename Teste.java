package diversos;

import javax.swing.JOptionPane;

public class Teste 
	{

	//Exemplos de entrada e saída com joptionpane e system out print
	public static void main(String[] args){
		final int valor = 1000; 
		double calculo = 0;
		boolean achei = false;
		char estadoCivil = 'S';
		String nome = "João";
		System.out.println("Hello World!");
		System.out.println("\nJava!"+ nome);
		JOptionPane.showMessageDialog(null, "Hello World!");
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		JOptionPane.showMessageDialog(null, nome);
	}
}
