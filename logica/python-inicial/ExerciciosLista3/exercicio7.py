numero = int(input('Digite um número inteiro: '))
multiplo5 = numero // 5
multiplo10 = numero // 10

if multiplo5 and multiplo10:
    print('É multiplo por 5 e multiplo por 10.')
elif multiplo10:
    print('É multiplo por 10.')
elif multiplo5:
    print('É multiplo por 5.')
else:
    print('Não é multiplo por 10 e nem por 5.')
