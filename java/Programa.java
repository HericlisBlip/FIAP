class Programa{
	public static void main(String[]args){
		Conta minhaConta; // variavel
		minhaConta = new Conta();
		minhaConta.dono = "Hericlis";
		minhaConta.saldo = 10000.0;
		System.out.println("Saldo atual: "+ minhaConta.saldo);
	}
}