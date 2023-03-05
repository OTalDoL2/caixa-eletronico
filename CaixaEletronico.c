#include <stdio.h>

int main(){
    printf("Digite o valor que deseja sacar, e te retorno a quantidade de cédulas referente a cada valor: ");
    int valorInit;
    scanf("%d", &valorInit);
    int notas[8] = {200, 100, 50, 20, 10, 5, 2, 1};
    int valorAux = valorInit;
    int nota = 0;
    for(int i = 0; i <= 7; i++){
        nota = valorAux / notas[i];
        valorAux = valorAux % notas[i];
        printf("%d = %d\n", notas[i], nota);
    }
    return 0;
}