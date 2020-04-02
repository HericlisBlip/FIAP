print('Por favor digite três números inteiros! ')
number1 = int(input('Digite o primeiro número: '))
number2 = int(input('Digite o segundo número: '))
number3 = int(input('Digite o terceiro número: '))

if(number1 == number2 and number2 == number3 and number3 == number1):
    print('Triangulo Equilatero!')
elif(number1 == number2 or number2 ==number3 or number3 == number1):
    print('Triangulo Isóseles!')
elif(number1 != number2 and number2 != number3):
    print('Triangulo Escaleno!')
else:
    print('Digite novamente, algo deu errado!')
