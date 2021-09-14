package Atividade_4;
import java.util.Scanner;

public class Ex01 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("C�lculo da �rea do quadrado:");
		System.out.println("Digite o valor do lado do quadrado:");
		Double ladoQuadrado = entrada.nextDouble();
		Double areaQuadrado = calculaArea(ladoQuadrado);
		
		System.out.println("C�lculo da �rea do ret�ngulo.");
		System.out.println("Digite o valor do lado maior do ret�ngulo.");
		Double ladoMaior = entrada.nextDouble();
		
		System.out.println("Digite o valor do lado menor do ret�ngulo.");
		Double ladoMenor = entrada.nextDouble();
		
		Double areaRetangulo = calculaArea(ladoMaior, ladoMenor);
		
		System.out.printf("A �rea do Quadrado �: %2f\n", areaQuadrado);
		System.out.printf("A �rea do Ret�ngulo �: %2f\n", areaRetangulo);
	}
	
	public static double calculaArea(double lado) {
		return lado * lado;
	}
	
	public static double calculaArea(double ladoMaior, double ladoMenor) {
		return ladoMaior * ladoMenor;
	}
}
