trabalho=float(input('Digite a nota de Trabalho de laboratório: '))
avaliacao=float(input('Digite a nota da Avaliação semestral: '))
exame=float(input('Digite a nota do Exame final: '))

media =(trabalho + avaliacao + exame) / 2


if(media >= 6 and media <= 10):
    print("Sua média é: {} ".format(media))
    print('Parabéns, você foi aprovado! :D')
elif(media > 4 and media <= 5):
    print("Sua média é: {} ".format(media))
    print('Você está de exame, se dedique mais!')
elif(media < 4):
    print("Sua média é: {} ".format(media))
    print('Você foi reprovado! :(')
else:
    print('Valor das notas não correspondem, digite novamente!')
