
public class Calculadora {
	 private int resultado;
	 
	 public int somar(int n1, int n2) {
		 resultado = n1 +n2;
		 return resultado;
	 }
	 
	 public int subtrair(int n1, int n2) {
		 resultado = n1 - n2;
		 return resultado;
	 }
	 
	 public int multiplicar(int n1, int n2) {
		 resultado = n1* n2;
		 return resultado;
	 }
	 
	 public int dividir(int n1, int n2) {
		 resultado = n1/ n2;
		 return resultado;
	 }
	 
}
