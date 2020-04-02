print('Por favor digite 3 números inteiros: ')

number1 =int(input('Digite o primeiro número: '))
number2 = int(input('Digite o segundo número: '))
number3 = int(input('Digite o terceiro número: '))

if(number1 < number2 < number3):
    print('Os números em forma crescente:', number1,'-', number2, '-', number3)
    print('Obrigado!')
elif(number1 < number3 < number2):
     print('Os números em forma crescente:', number1,'-', number3, '-', number2)
     print('Obrigado!')
elif(number2 < number1 < number3):
    print('Os números em forma crescente: ', number2,'-', number1, '-', number3)
    print('Obrigado!')
elif(number3 < number1 < number2):
    print('Os números em forma crescente: ', number3,'-', number1, '-', number2)
    print('Obrigado!')
elif(number3 < number1 < number2):
    print('Os números em forma crescente: ', number3,'-', number1,'-', number2)
    print('Obrigado!')
else:
    print('Os números são iguais : ', number1,'-', number2 ,'-', number3)
    print('Obrigado!')