print('Verrificação de arpovação!')
name =str(input('Digite o seu nome: '))
note1 = float(input('Digite a nota de trabalho: '))
note2 = float(input('Digite a nota de avaliação: '))
note3 = float(input('Digite a nota de exame: '))
fouls =(int(input('Digite a quatidade de faltas: ')))

noteMedia = (note1 + note2 + note3) / 2

foulsExhausted = (25*80//100)


if(noteMedia > 6 and fouls <= foulsExhausted):
    print('Parabéns {} você foi aprovado com média {}! :D'.format(name, noteMedia))
elif(noteMedia < 7 and fouls <= foulsExhausted):
    print('Sua média é ',noteMedia, ' e infelismente você foi reprovado por Nota !')
elif(noteMedia > 6 and fouls > foulsExhausted):
    print('Sua média é ', noteMedia, ' mas infelismente você foi reprovado por falta ! ')
else:
    print('Erro digite novamente ! ')