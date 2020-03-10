class empresa{
public static void main(String[]args){

funcionario meuFuncionario;
meuFuncionario = new funcionario();


meuFuncionario.nome ="Hericlis Ventura";
meuFuncionario.salario = 10000;


System.out.println("Salario R$: " + meuFuncionario.salario);

meuFuncionario.recebeAumento(1000);



System.out.println("Salario R$: " + meuFuncionario.salario);


meuFuncionario.calcularGanhoAnual();


}


}