package desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class DescontoPorItem extends Desconto {
	public DescontoPorItem(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public BigDecimal calcular(Pedido pedido) {
		if(pedido.getValor().compareTo(new BigDecimal("500"))> 0){
			return pedido.getValor().multiply(new BigDecimal("0.1"));
		}
		return proximo.calcular(pedido);
	}
	
}
