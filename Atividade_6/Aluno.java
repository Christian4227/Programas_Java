package Atividade_6;
import java.util.Scanner;

public class Aluno extends Pessoa{
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Digite agora o nome da pessoa: ");	
		String nome = entr.next();
		pessoa.setNome(nome);
		
		System.out.println("Agora digite a sua idade");
		Integer idade = entr.nextInt();
		pessoa.setIdade(idade);
		
		System.out.println("Segue agora a descrição do curso já registrado");
		pessoa.setIdade(idade);
		
		System.out.println("Descrição do aluno da questão proposta:");
		System.out.println("Nome da pessoa: " + pessoa.getNome());
		System.out.println("Idade da pessoa: " + pessoa.getIdade());
		System.out.println("Curso do aluno: " + pessoa.getCurso());
	}
}
