print('Por favor digite 3 números inteiros: ')

number1 =int(input('Digite o primeiro número: '))
number2 = int(input('Digite o segundo número: '))
number3 = int(input('Digite o terceiro número: '))

if(number1 < number2 < number3):
    print('Os números em forma crescente:\n', number1,'\n', number2, '\n', number3, '\n')
    print('Ós números foram digitados de forma crescente. Obrigado!')
else:
    print('Os números não foram digitados de forma crescente, tente de novo!')