/**
 * 
 */
package br.com.fiap.revisao.main;

import br.com.fiap.revisao.bean.Aluno;
import br.com.fiap.revisao.bean.Genero;

/**
 * @author HP
 *
 */
public class TestaEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Genero.FEMININO;
		Aluno aluno = new Aluno("Hericlinhos", "RM85587");
		aluno.setGenero(Genero.MASCULINO);
		
		if (aluno.getGenero().equals(Genero.MASCULINO)) {
			System.out.println("é um Aluno Exemplar!!!");
		}
	}

}
