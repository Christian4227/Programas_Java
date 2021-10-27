package Atividade_8;

public class Programador extends Funcionario {
	private String linguagem;
	private String sistOper;
	
	public Programador (String nome, String mail, String linguagem) {
		super(nome,  mail);
		this.nome = nome;
		this.mail = mail;
		this.linguagem = linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public void setSistOper(String sistOper) {
		this.sistOper = sistOper;
	}
	
	public void exibeDados(){
		System.out.println("Linguagem de programação que o programador domina: " + linguagem + "\n");
		System.out.println("E o sistema operacional que ele utiliza: " + sistOper);
	}
}
