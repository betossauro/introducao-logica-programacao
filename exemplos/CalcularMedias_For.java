package exemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularMedias_For {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		for(int contador = 0; contador < 2; contador++) {
			System.out.print("Informe o nome do aluno: ");
			String nome = teclado.nextLine();
			System.out.print("Informe a primeira nota: ");
			double nota1 = teclado.nextDouble();
			System.out.print("Informe a segunda nota: ");
			double nota2 = teclado.nextDouble();
			double media = (nota1 + nota2)/2;
			System.out.println("Aluno: " + nome + ", teve m�dia: " + formatador.format(media));
			teclado.nextLine();
			System.out.println();
		}
		teclado.close();
	}
}
