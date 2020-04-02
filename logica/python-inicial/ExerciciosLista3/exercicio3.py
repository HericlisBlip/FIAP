print('Por favor digite três números !')

number1 = float(input('Primeiro número: '))
number2 = float(input('Segundo número: '))
number3 = float(input('Treceiro número: '))

if(number1 > number2 > number3):
    print('Os números em forma decrescente:', number1,'-', number2, '-', number3)
    print('Obrigado!')
elif(number2 > number1 > number3):
    print('Os números em forma decrescente: ', number2,'-', number1, '-', number3)
    print('Obrigado!')
elif(number3 > number1 > number2):
    print('Os números em forma decrescente: ', number3,'-', number1, '-', number2)
    print('Obrigado!')
elif(number3 > number1 > number2):
    print('Os números em forma decrescente: ', number3,'-', number1,'-', number2)
    print('Obrigado!')
else:
    print('Os números são iguais : ', number1,'-', number2 ,'-', number3)
    print('Obrigado!')