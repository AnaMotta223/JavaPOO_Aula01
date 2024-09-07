package diversos;

import javax.swing.JOptionPane;

public class ExercicioAula1 {
	//Fazer a leitura de 2 valores: altura e idade
	//se idade >= 18 ou altura maior que 1.76 participará da maratona
	//senao nao participará
	
	public static void main(String[] args) {
		int idade;
		double altura;
		
		//! é o operador not (true vira false)
		boolean a = !(1==1);
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		
		/*if(idade>=18 || altura>1.70) {
			JOptionPane.showMessageDialog(null, "Você participará da maratona!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Você não participará da maratona!");
		}*/
		
		//Ternario p/ encurtar o if e else 
		String resultado = (idade>=18 || altura>1.70 ? "Você participará da maratona!": "Você não participará da maratona!" );
		System.out.println("O atleta:" + resultado);
		
		int mes = 1;
		System.out.println((mes==1 ? "Janeiro": "Fevereiro"));
		
		String dia = "Domingo";
		
		//Exemplo switch case específico
		String result = switch (dia) {
		case "Domingo" -> "Fim de semana";
		case "Segunda" -> "Dia util";
		default -> "Dia inválido";
		};
		System.out.println("Resultado: " + result);
		
		//Exemplo switch case específico
		String time = "Vasco";
		String resposta = switch (time) {
		case "Flamengo", "Vasco", "Botafogo", "Fluminense" -> "Rio de Janeiro";
		case "Cruzeiro", "Atlético-MG" -> "Minas Gerais";
		default -> "Time inválido";
		};
		System.out.println(resposta);
	}
}
