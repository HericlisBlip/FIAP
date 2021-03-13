package loja;

import java.math.BigDecimal;

public class Pedido {
	private BigDecimal valor;
	private int quatidadeDeItens;
	
	
	public int getQuatidadeDeItens() {
		return quatidadeDeItens;
	}
	public BigDecimal getValor() {
		return valor;
	}

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quatidadeDeItens = 1;
	}
	public Pedido(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quatidadeDeItens = quantidadeDeItens;
	}
	
	
	
}
