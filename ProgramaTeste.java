package Atividade_7;
import java.util.Scanner;

public class ProgramaTeste {
	public static void main(String[] args) {		
		Scanner entr = new Scanner(System.in);
		
		System.out.println("Digite o dia, o m�s e o ano nas tr�s entradas respectivamente.");
		Integer dia = entr.nextInt();
		Integer mes = entr.nextInt();
		Integer ano = entr.nextInt();
		
		Data date = new Data(dia, mes, ano);
		
		String data = date.toString();
		
		System.out.println("Agora digite as informa��es do aluno.");
		System.out.println("RA do aluno:");
		Integer ra = entr.nextInt();
		System.out.println("Nome do aluno.");
		String nome = entr.next();
		
		Aluno aluno = new Aluno(ra, nome, data);
		
		System.out.println("Curso do aluno:");
		Integer curso = entr.nextInt();
		System.out.println("Turma do aluno.");
		Integer turma = entr.nextInt();	
		alunoGraduacao ag = new alunoGraduacao(ra, nome, data, curso, turma);
		
		System.out.println("Informa��es completas do aluno");
		System.out.println("RA: " + aluno.getRa() + "\nNome do aluno: " + aluno.getNome() + "\nData de cadastro do aluno: " + date);
		System.out.println("Curso do aluno: " + ag.getCurso() +  "\nTurma do aluno: " + ag.getTurma() + "\nData de cadastro do aluno: " + aluno.getData());
		
	}
}
