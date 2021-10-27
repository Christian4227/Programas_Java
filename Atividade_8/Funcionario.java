package Atividade_8;

public class Funcionario {
	
	public String nome;
	public String mail;
	private Integer idade;
	
	public Funcionario (String nome, String mail) {
		this.nome = nome;
		this.mail = mail;
	}
	
	public Funcionario (String nome, String mail, Integer idade) {
		this.nome = nome;
		this.mail = mail;
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public void exibeDados() {
		System.out.println("Nome do funcionário: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("E-mail: " + mail);
	}

}
