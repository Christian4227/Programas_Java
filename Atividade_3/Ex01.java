package Atividade_3;
import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Circunferencia raio = new Circunferencia();
		Integer vraio = raio.getRaio();
		Double perimetro = 2 * 3.14 * vraio;
		Double area = 3.14 * Math.pow(vraio, 2);
		Integer diametro = 2 * vraio;	
		System.out.println("Di�metro: " + diametro);
		System.out.printf("Per�metro: %.1f \n", perimetro);
		System.out.println("�rea: " + area);
	}
}