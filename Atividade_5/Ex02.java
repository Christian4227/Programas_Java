package Atividade_5;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		int prat[][] = new int[4][3];
		int p = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				prat[i][j] = p + 1;
				p++;
			}
		}
		
		for (int h = 0; h < 4; h++) {
			for (int k = 0; k < 3; k++) {
				System.out.println("Quantidade de peças da prateleira: " + prat[h][k] + " na posição prat[" + h + "][" + k + "]:");
			}
		}
	}
}
