package desconto;

import java.math.BigDecimal;

import loja.Pedido;

public class CalculadoraDeDesconto {

		public BigDecimal calcular(Pedido pedido) {
			
			
			Desconto CadeiaDeDesconto = 
					new DescontoPorValor(
					new DescontoPorItem(
					new SemDesconto()));
			return CadeiaDeDesconto.calcular(pedido);
		}
		
}
