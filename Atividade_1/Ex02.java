package Atividade_1;
import java.util.Scanner;

public class Ex02 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor em ºC: ");
		float celsius = input.nextFloat();
		float farenheint = 32 + celsius * 9 / 5;
		System.out.println("Temperatura em ºF: " + farenheint);
	}
}
