package Atividade_4;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cálculo da área do quadrado:");
		System.out.println("Digite o valor do lado do quadrado:");
		Double ladoQuadrado = entrada.nextDouble();
		Double areaQuadrado = calculaArea(ladoQuadrado);
		
		System.out.println("Cálculo da área do retângulo.");
		System.out.println("Digite o valor do lado maior do retângulo.");
		Double ladoMaior = entrada.nextDouble();
		
		System.out.println("Digite o valor do lado menor do retângulo.");
		Double ladoMenor = entrada.nextDouble();
		
		Double areaRetangulo = calculaArea(ladoMaior, ladoMenor);
		
		System.out.printf("A área do Quadrado é: %2f\n", areaQuadrado);
		System.out.printf("A área do Retângulo é: %2f\n", areaRetangulo);
	}
	
	public static double calculaArea(double lado) {
		return lado * lado;
	}
	
	public static double calculaArea(double ladoMaior, double ladoMenor) {
		return ladoMaior * ladoMenor;
	}
}
