import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args){
        Scanner myscan = new Scanner(System.in);
        System.out.print("Digite o valor que deseja sacar, e te retorno a quantidade de cédulas referente a cada valor: ");
        int valorInit = myscan.nextInt();
        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        int valorAux = valorInit;
        int nota;
        for(int i = 0; i<= 7; i++){
            nota = valorAux / notas[i];
            valorAux = valorAux % notas[i];
            System.out.println("Notas de " + notas[i] + " -> " + nota + " Cédulas");
        }
    }
}
