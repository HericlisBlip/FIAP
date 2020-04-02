 class TestandoMetodos{
    public static void main(String[]args){

        // Instanciando uma conta
    Conta minhaConta;
 
    minhaConta = new Conta();
 
 
     // populando conta
    minhaConta.dono ="Gessyca";
    minhaConta.saldo =34321;

      //Exibindo o saldo 
    System.out.println("Saldo R$: " + minhaConta.saldo);
 
      //Sacando 350 reais :)
    minhaConta.sacar(46350);
 
    
 
      //depositando 10000 :D
 
   // minhaConta.depositar(10000);
 
      //Exibindo o Saldo
 
    System.out.println("Saldo R$: " + minhaConta.saldo);
  }
 
 }