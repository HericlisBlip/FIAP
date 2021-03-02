package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Aluno;
import br.com.fiap.revisao.dao.AlunoDao;
import br.com.fiap.revisao.dao.AlunoOracleDao;

public class TesteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoDao dao = new AlunoOracleDao();
		dao.cadastrar( new Aluno());

	}

}
