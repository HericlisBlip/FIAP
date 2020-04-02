print('Digite um número para comparação ! ')
number = int(input("Digite um número: "))

if(number >= 0 and number < 30):
    print('Número compreendido entre 0 e 30.')
elif(number >= 40 and number <= 79):
    print('Numero compreendido entre 40 e 79.')
else:
    print('Número fora dos limites estabelecidos')