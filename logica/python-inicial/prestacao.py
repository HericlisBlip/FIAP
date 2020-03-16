boleto =float(input("Digite o valor do seu Boleto : "))
juros =float(input("Digite o juros diário : "))
atraso =int(input("Digite os dias de atraso : "))
valorTotal = boleto +(boleto *(juros/100))*atraso

print(" O valor total a ser pago é {:.2f} reais!".format(valorTotal))