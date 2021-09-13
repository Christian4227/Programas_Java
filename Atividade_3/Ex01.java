package Atividade_3;
import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Circunferencia circulo = new Circunferencia();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio com uma casa decimal.");
		Double raio = entrada.nextDouble();
		
		System.out.printf("O valor da área da circunferência é: %.2f\n", circulo.getArea(raio));
		System.out.printf("O valor do perímetro da circunferência é: %.2f\n", circulo.getPerimetro(raio));
	}
}