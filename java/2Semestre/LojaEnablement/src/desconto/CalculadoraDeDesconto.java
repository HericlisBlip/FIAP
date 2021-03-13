package desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeDesconto {

		public BigDecimal calcular(Pedido pedido) {
			if(pedido.getValor().compareTo(new BigDecimal("500"))> 0){
				return pedido.getValor().multiply(new BigDecimal("0.1"));
			}
			return BigDecimal.ZERO;
		}
}
