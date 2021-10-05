package Atividade_7;

public class alunoGraduacao extends Aluno {
	private Integer curso;
	private Integer turma;
	Aluno aluno = new Aluno();
	
	public alunoGraduacao() {
		
	}
	
	public alunoGraduacao(Integer ra, String n, String d, Integer c, Integer t) {
		this.aluno.ra = ra;
		this.aluno.nome = nome;
		this.aluno.data = data;
		this.curso = c;
		this.turma = t;
	}
	public Integer getCurso() {
		return curso;
	}
	public void setCurso(Integer curso) {
		this.curso = curso;
	}
	public Integer getTurma() {
		return turma;
	}
	public void setTurma(Integer turma) {
		this.turma = turma;
	}
	
}
