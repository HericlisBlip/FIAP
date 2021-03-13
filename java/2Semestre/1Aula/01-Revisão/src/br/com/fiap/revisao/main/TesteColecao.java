/**
 * 
 */
package br.com.fiap.revisao.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.revisao.bean.Aluno;

/**
 * @author HP
 *
 */
public class TesteColecao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Aluno> lista = new ArrayList<Aluno>();
		
		lista.add(new Aluno ("Gabriel Januario", "RM88167"));
		
		
		Aluno aluno = new Aluno("Hericlis Ventura", "RM85587");
		lista.add(aluno);
		
		for (int i = 0 ;i < lista.size();i++){
			System.out.println(lista.get(i).getRm()+ ' ' + lista.get(i).getNome());
		}
		
		for (Aluno item : lista) {
			System.out.println(item);
		}
		
		
		Map<String, Aluno> mapa = new HashMap<String,Aluno>();
		mapa.put("Aluno1", new Aluno("Juão", "RM88534"));
		mapa.put("Aluno2",new Aluno ("Matheus", "RM88213") );
		
		aluno =mapa.get("Aluno2");
		System.out.println(aluno.getNome() + " "+ aluno.getRm());
	}

}
