print('Permissão de acesso: ')

senha = str(input('Digite a senha: '))

validar = 'FIAP1TDSF'

if(senha == validar):
    print('Acesso Permitido. Bem vindo!')
else:
    print('Você não tem acesso ao sistema, tente de novo')

