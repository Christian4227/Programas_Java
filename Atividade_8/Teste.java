package Atividade_8;
import java.util.Scanner;

public class Teste {
	private static String nome;
	private static String mail;
	private static Integer idade;
	private static String linguagem;
	private static String sistOper;
	
	public static void main (String[] args) {
		Funcionario f = new Funcionario(nome, mail, idade);
		Programador p = new Programador(nome, mail, linguagem);
		Scanner e = new Scanner(System.in);
		
		System.out.println("Entrada de dados para testar as classes.");
		
		System.out.println("Digite o nome do funcion�rio.");
		nome = e.next();
		f.setNome(nome);
		
		System.out.println("Agora a idade do funcion�rio: ");
		idade = e.nextInt();
		f.setIdade(idade);
		
		System.out.println("O e-mail dele.");
		mail = e.next();
		f.setMail(mail);
		
		System.out.println("A linguagem de programa��o que ele domina.");
		linguagem = e.next();
		p.setLinguagem(linguagem);
			
		System.out.println("E o sistema operacional que ele utiliza.");
		sistOper = e.next();
		p.setSistOper(sistOper);		
		
		f.exibeDados();
		p.exibeDados();
		System.exit(0);
		
	}
}
