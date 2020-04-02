number1=float(input('Digite um número: '))
number2=float(input('Digite mais um número: '))

if(number1 > number2):
    print('O número {} é maior !'.format(number1))
elif(number2 > number1):
    print('O número {} é maior !'.format(number2))
else:
    print('Os numeros são iguais !')