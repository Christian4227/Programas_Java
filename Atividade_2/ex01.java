package Atividade_2;
import java.util.Scanner;

public class ex01 {
	public static void main(String args[]) {
		Scanner entr = new Scanner(System.in);
		Integer voto = 0, quantVotos = 0;
		Integer monica = 0, cebolinha = 0, cascao = 0, magali = 0, branco = 0, nulo = 0;
		
		while (voto >= 0) {
			System.out.println("Digite o número da legenda do seu candidato: ");
			voto = entr.nextInt();
			switch(voto) {
			case 0:
				branco++;
				break;
			case 1:
				nulo++;
				break;
			case 10:
				monica++;
				break;
			case 20:
				cebolinha++;
				break;
			case 30:
				cascao++;
				break;
			case 40:
				magali++;
				break;
			}
			quantVotos++;
		}
		
		Integer maior = monica;
		String candidato = "Mônica";
		if (cebolinha/quantVotos > monica / quantVotos) candidato = "Cebolinha";
		if (cascao / quantVotos > cebolinha / quantVotos) candidato = "Cascão";
		if (magali / quantVotos > cascao / quantVotos) candidato = "Magali";
		
		System.out.println("O candidato vencedor desta eleição é o(a): " + candidato);
	}
}
