package Atividade_5;
import java.util.Scanner;

public class Ex01 {
	public static void main (String[] args) {
		int vetor[] = new int[20];
		
		for (int i = 0; i < 20; i++) {
			vetor[i] = i + 2;
		}
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número para pesquisar se existe dentro do nosso banco de dados.");
		int num = entrada.nextInt();
		boolean encontrou = false;
		int s = 0;
		
		for (int j  = 0; j < 19; j++) {
			if (num == vetor[j]) {
				encontrou = true;
				s = j;
			}
		}
		
		if (encontrou) {
			System.out.println("O número que você pesquisou, " + num + " existe no nosso banco de dados!");
			System.out.println("Ele se encontra na posição " + s + " do array.");
		}
		else {
			System.out.println("O número " + num + " que você pesquisou não existe no nosso banco de dados.");
		}
	}
}
