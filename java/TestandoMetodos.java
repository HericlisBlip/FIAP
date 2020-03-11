class TestandoMetodos{
public static void main(String[]args){

// Instanciando uma conta
Conta minhaConta;
minhaConta = new Conta();


// populando conta
minhaConta.dono ="Hericlis";
minhaConta.saldo =25000;

//Exibindo o saldo 
System.out.println("Saldo R$: " + minhaConta.saldo);

//Sacando 350 reais :)
minhaConta.sacar(350);

// Exibindo saldo

System.out.println("Saldo R$: " + minhaConta.saldo);

//depositando 10000 :D

minhaConta.depositar(10000);


//Exibindo o Saldo

System.out.println("Saldo R$: " + minhaConta.saldo);
}


}