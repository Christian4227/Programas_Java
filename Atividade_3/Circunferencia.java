package Atividade_3;
import java.util.Scanner;

class Circunferencia {
	public double raio;
	
	public void setRaio(double r) {
		if (r >= 0)
			raio = r;
		else {
			raio = 0;
		}
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double getArea(double raio) {
		return Math.pow(raio, 2);
	}
	
	public double getPerimetro(double raio) {
		return 2 * 3.14 * raio;
	}
}
