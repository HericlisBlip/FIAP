print('Por favor digite dois números inteiros! ')
number1 = int(input('Digite o primeiro número: '))
number2 = int(input('Digite o segundo número: '))

if(number1 > number2):
    print('O número', number1, 'é maior!')
elif(number2 > number1):
    print('O número', number2, 'é maior!')
else:
    print('O números são iguais!')