candidatoA = int(input("Digite quantos votos recebeu o Candidato A : "))
candidatoB = int(input("Digite quantos votos recebeu o Candidato B : "))
candidatoC = int(input("Digite quantos votos recebeu o Candidato C : "))
votoBranco = int(input("Digite quantidade de Votos Brancos! "))
votoNulo = int(input("Digite quantidade de votos Nulos ! "))

total = candidatoA + candidatoB + candidatoC + votoBranco +votoNulo

porcentA = (candidatoA + total)/100
porcentB = (candidatoB + total)/100
porcentC = (candidatoC + total)/100
porcentBranco = (votoBranco + total)/100
porcentNulo = (votoNulo + total)/100

print("O número total de Eleitores são {}".format(total))
print("O percentoal de votos de cada candidato é : \n Candidato A: {}'%' dos votos!\n Candidato B:{}'%' dos votos! \n Candidato C:{}'%'dos votos".format(porcentA , porcentB , porcentC))
print("O percentual de votos nulos é: {}% \n\n O percentual de votos brancos é: {} %".format(porcentNulo, porcentBranco))