valorInit = int(input("Digite o valor que deseja sacar, e te retorno a quantidade de cédulas referente a cada valor: "))
cedulas = [200, 100, 50, 20, 10, 5, 2, 1]
valorAux = valorInit
for i in range(len(cedulas)):
    nota = valorAux // cedulas[i]
    valorAux = valorAux % cedulas[i]
    print(f"Notas de {cedulas[i]} -> {nota} Cédulas")