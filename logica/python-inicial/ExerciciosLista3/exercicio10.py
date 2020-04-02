print('Por favor digite dois números inteiros! ')
number1 = int(input('Digite o primeiro número: '))
number2 = int(input('Digite o segundo número: '))

divisivel = number1 // number2

if divisivel:
    print('O número {} é divisível por {}.'.format(number1, number2))
else:
    print('O numero {} não é divisível por {}.'.format(number1,number2))