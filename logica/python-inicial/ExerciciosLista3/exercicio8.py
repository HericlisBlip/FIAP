print('Por favor digite dois números ! ')
number1 = float(input('Digite o primeiro número: '))
number2 = float(input('Digite o segundoo número: '))

sum = number1 + number2

if(sum > 10):
    print('O número ', sum , ' é maior que 10!')
elif(sum < 10):
    print('O número ', sum, 'é menor que 10!')
elif(sum == 10):
    print('O número', sum, 'é igual a 10')
else:
    print('Falha ao digitar o número tente novamente!')