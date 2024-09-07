package diversos;

import javax.swing.JOptionPane;

public class Calculo {

	public static void main(String[] args) {
		//Criar 2 variaveis, atribuir valores e retornar a media
		double valor1,valor2;
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		calcular(valor1,valor2);
	}
	
	public static void calcular(double valor1, double valor2) {
		JOptionPane.showMessageDialog(null, (valor1+valor2)/2);
	}
		
}

