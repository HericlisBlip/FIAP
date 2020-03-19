numero1 =int(input("Digite um número!"))
numero2 =int(input("Digite outro número"))
numero3 =int(input("Digite Mais um número"))
numero4 = int(input("Digite um último número"))

mult = numero1 * numero3
soma = numero2 + numero4

print(" A multiplicação do Primeiro {} com o Terceiro {} é : {:.2f}" .format(numero1 , numero3, mult))
print("A soma do Segundo {} com o Quarto {} é : {:.2f}".format(numero2 , numero4, soma))