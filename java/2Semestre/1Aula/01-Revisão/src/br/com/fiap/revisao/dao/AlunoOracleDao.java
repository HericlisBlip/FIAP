/**
 * 
 */
package br.com.fiap.revisao.dao;

import java.util.List;

import br.com.fiap.revisao.bean.Aluno;

/**
 * @author HP
 *
 */
public class AlunoOracleDao implements AlunoDao {
	@Override
	public void cadastrar( Aluno aluno) {
		System.out.println("Cadastrando aluno no Oracle");
	}
	@Override
	public List<Aluno>listar(){
		System.out.println("Listando Aluno Oracle");
		return null;
	}
}
