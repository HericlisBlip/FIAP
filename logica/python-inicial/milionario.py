salario =float(input("Digite o valor do seu salário : "))
despesas=float(input("Digite o valor das despesas : "))

sobra = salario - despesas

milhao =(1000000 - sobra)/ 12

print("Você ficará rico em {:.2f} anos ".format(milhao))

