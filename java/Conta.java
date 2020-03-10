class Conta {
    int numero;
    String dono;
    double saldo ;
    double limite;
    //..

	void sacar(double quantidade){
		double novoSaldo =this.saldo - quantidade;
		this.saldo = novoSaldo;
		System.out.println("Saque realizado R$: " + quantidade);
	}

	void depositar(double quantidade){
		this.saldo = this.saldo + quantidade;
		System.out.println("Você depositou R$: " + quantidade);



}

}