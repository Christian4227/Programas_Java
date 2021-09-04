package Atividade_3;
import java.util.Scanner;

public class Circunferencia {
	public int getRaio() {
		System.out.println("Digite um valor inteiro para o raio.");
		Scanner entrada = new Scanner(System.in);
		Integer raio = entrada.nextInt();
		return raio;
	}
}
