package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Aluno;
import br.com.fiap.revisao.bean.Pessoa;

public class TesteMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa =  new Pessoa();
		pessoa.andar();
		
		Aluno aluno = new Aluno();
		aluno.andar(" 23");
		
		Pessoa p = new Aluno();
		
		p.andar();
		
		 int x= 11;
		System.out.println(x>10?"MAior que 10":"Menor ou igual a 10");
		
	}

}
