class Conta {
    int numero;
    String dono;
    double saldo ;
    double limite;
    //..

	void sacar(double quantidade){
		if(this.saldo >= quantidade)	{
		System.out.println("Saque realidado com sucesso");
		
		}else {
			 System.out.println("Saldo insuficiente, tente novamente");
		}
	}

	void depositar(double quantidade){
		this.saldo = this.saldo + quantidade;
		System.out.println("Você depositou R$: " + quantidade);


}

}