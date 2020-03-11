class funcionario {
	String nome;
	String departamento;
	double salario;
	String contratacao;
	String rg ;


void recebeAumento(double aumento) {
	this.salario = this.salario + aumento;
	System.out.println(" Salario de R$: " + this.salario);

}

void calcularGanhoAnual(){
double ganhoAnual = this.salario * 12 ;
System.out.println("Seu ganho anual é de : " + ganhoAnual);

}


}