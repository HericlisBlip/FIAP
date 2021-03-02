package br.com.fiap.revisao.bean;

public class Aluno extends Pessoa{
	
	private String rm;
	
	@Override
	public void andar() {
		System.out.println("Aluno andando...");
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}
	
	
}
