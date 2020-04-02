print('informe o nome e o produto para venda!')
productName = str(input('Digite o nome do produto:'))
productValue = float(input("Digite o valor do produto: "))

lucro45= productValue + (productValue *45 /100)
lucro30= productValue + (productValue *30/ 100)
if( productValue > 0 and productValue <20.0 ):
    print('O valor de {} é de {}'.format(productName, lucro45))
elif(productValue >= 20.0):
    print('O valor de{} é de {}'.format(productName,lucro30))
else:
    print('Produto e valor invalido!')