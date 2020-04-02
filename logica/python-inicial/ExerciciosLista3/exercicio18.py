print('    Menu de opções: \n 1. Somar dois números! \n 2. Raiz quadrada de um número! \n')
opcao = int(input( 'Digite a opção desejada: '))

if(opcao == 1):
    number1 = int(input('Digite um número: '))
    number2 = int(input('Digite outro número: '))

    soma = number1 + number2
    print('O resultado da soma é :', soma)
elif( opcao ==2 ):
    number = int(input('Digite um número: '))
    raiz = number ** 2
    print('O resultado da Raiz Quadrada é ', raiz)
else:
    print('Opção incorreta digite novamente!')
