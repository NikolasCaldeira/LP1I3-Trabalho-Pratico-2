/*10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).*/

import java.util.Scanner;
import java.util.Arrays;

public class tp02ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m = 0;
        int n = 1;
        int i, j;

        System.out.print("Digite o valor da matriz quadratica, valor de 1 até 10: ");
        m = entrada.nextInt();
        while (m > 10) {
            System.out.println("Valor errado!!!");
            System.out.print("Digite novamente o valor da matriz quadratica, valor de 1 até 10: ");
            m = entrada.nextInt();
        }

        int mtrz[][] = new int[m][m];
        int mtinv[][] = new int[m][m];

        for (i = 0; i < mtrz.length; i++) {
            for (j = 0; j < mtrz[i].length; j++) {
                System.out.print("Digite o " + (n++) + "º valor: ");
                mtrz[i][j] = entrada.nextInt();
                mtinv[j][i] = mtrz[i][j];
            }
        }

        int linha = m;
        int coluna = m;
        System.out.println("---------------------------------");
        System.out.println("         Valores da Matriz       ");
        System.out.println("---------------------------------");
        for (i = 0; i < linha; i++) {
            System.out.print("\n");
            for (j = 0; j < coluna; j++) {
                System.out.printf("%s", mtrz[i][j] + "\t");
            }
            System.out.printf("\n");
        }

    }
}
