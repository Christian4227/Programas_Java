package Atividade_6;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private int idade;
	private String curso;
	
	public static void main(String[] args) {
		System.out.println("Você saiu da classe Aluno aqui..");
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setIdade(Integer i) {
		idade = i;	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setCurso(String c) {
		curso = c;
	}
	
	public String getCurso() {
		return "ADS Noite FATEC SP";
	}
	
	
}
