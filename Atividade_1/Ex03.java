package Atividade_1;
import java.util.Scanner;

public class Ex03 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a sua data de nascimento no formato dd/mm/aaaa: ");
		System.out.println("Digite o dia do seu nascimento: ");
		String dia = input.nextLine();
		
		System.out.println("Digite o mês do seu nascimento: ");
		String mes = input.nextLine();
			
		System.out.println("Digite o ano do seu nascimento: ");
		Integer ano = input.nextInt();
		
		Integer parte1 = Integer.parseInt(dia + mes);
		Integer soma = parte1 + ano;
		
		Integer indice = soma % 5;
		switch (indice) {
		case 0:
			System.out.println("Você tem um perfil de uma pessoa tímida.");
			break;
		case 1:
			System.out.println("Você tem perfil de uma pessoa sonhadora.");
			break;
		case 2:
			System.out.println("Você tem perfil de uma pessoa paqueradora.");
			break;
		case 3:
			System.out.println("Você tem perfil de uma pessoa atraente.");
			break;
		case 4:
			System.out.println("Você tem perfil de uma pessoa irresistível.");
			break;
		}
	}
}
