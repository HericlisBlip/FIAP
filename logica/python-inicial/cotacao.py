dolar =float(input("Digite o valor do Dolar : "))
real =float(input("Digite a quantidade de Real : "))
cotacao = real / dolar

print("Você compra {:.2f} Dolares com {} Reais !".format(cotacao , real))