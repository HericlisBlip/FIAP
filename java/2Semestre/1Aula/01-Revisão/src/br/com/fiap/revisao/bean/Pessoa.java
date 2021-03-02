package br.com.fiap.revisao.bean;

public class Pessoa {
	private String nome;
	private String cpf;	
	private int idade;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public Pessoa() {}
	
	public void andar() {
		System.out.println("PEssoa Andando");
	}
	public void andar(String velocidade) {
		System.out.println("Pessoa andando" + velocidade);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
