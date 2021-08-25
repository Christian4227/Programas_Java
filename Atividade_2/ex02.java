package Atividade_2;
import java.util.Scanner;

public class ex02 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o capital inicial investido:");
		Double capital = entrada.nextDouble();
		
		System.out.println("Agora digite o valor do juros mensal");
		float juros = entrada.nextFloat();
		
		Integer mes = 1;
		
		for (int i = 1; i <= 12; i++) {
			capital = capital * (juros / 100 + 1);
			
			String nomeMes = "Janeiro";
			if (mes == 2) nomeMes = "Fevereiro";
			if (mes == 3) nomeMes = "Março";
			if (mes == 4) nomeMes = "Abril";
			if (mes == 5) nomeMes = "Maio";
			if (mes == 6) nomeMes = "Junho";
			if (mes == 7) nomeMes = "Julho";
			if (mes == 8) nomeMes = "Agosto";
			if (mes == 9) nomeMes = "Setembro";
			if (mes == 10) nomeMes = "Outubro";
			if (mes == 11) nomeMes = "Novembro";
			if (mes == 12) nomeMes = "Dezembro";
			
			System.out.println("No mês de " + nomeMes + ",");
			System.out.printf("o valor total do capital investido é de: %.2f \n", capital);
			
			mes++;
		}
	}
}
