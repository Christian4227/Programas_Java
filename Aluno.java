package Atividade_7;

public class Aluno {
	public int ra;
	public String nome;
	public String data;
	
	public Aluno() {
	};
	
	public Aluno(int ra, String nome, String data) {
		this.ra = ra;
		this.nome = nome;
		this.data = data;
	};
	
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}
