class funcionario {
	String nome;
	String departamento;
	double salario;
	String contratacao;
	String rg ;


void recebeAumento(double aumento) {
	this.salario = this.salario + aumento;

}

void calcularGanhoAnual(){
double ganhoAnual = this.salario * 12 ;
System.out.println("Seu ganho anual é de : " + ganhoAnual);

}


}