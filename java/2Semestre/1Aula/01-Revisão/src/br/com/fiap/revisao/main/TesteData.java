/**
 * 
 */
package br.com.fiap.revisao.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Hericlis VEntura
 *
 */
public class TesteData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar hoje = Calendar.getInstance();
		
		Calendar challenge = new GregorianCalendar(2021, Calendar.MAY, 20);
		
		// Formatador de Data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		//Exibir a Data
		
		System.out.println(formatador.format(hoje.getTime()));
		// Exibir Data da Challenge
		System.out.println(formatador.format(challenge.getTime()));
	}
}
