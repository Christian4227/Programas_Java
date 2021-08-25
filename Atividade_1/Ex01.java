package Atividade_1;
import java.util.Scanner;

public class Ex01 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		double dolar = 5.24;
		System.out.println("Digite algum valor em real para converter em dólares");
		double real = entrada.nextDouble();
		System.out.println("Valor em Real: " + real + " Valor em Dólar: " + real * dolar);
	}
}
