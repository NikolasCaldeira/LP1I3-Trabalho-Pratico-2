/* 8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class tp02ex08 {
    public static void main(String[] args) {
        double mtrz[][] = new double[3][4];
        double mult[][] = new double[3][4];
        Scanner entrada = new Scanner(System.in);
        int i, j, m;
        int n = 1;
        int linha = 3;
        int coluna = 4;

        for (i = 0; i < mtrz.length ; i++){
            for (j = 0; j < mtrz[i].length; j++){
                System.out.print("Digite o "+ (n++)+"º valor: ");
                mtrz [i][j] = entrada.nextDouble();
            } 
        }

        System.out.println("---------------------------------");
        System.out.println("         Valores da Matriz       ");
        System.out.println("---------------------------------");
       for(i = 0; i<linha ; i++){
           System.out.print("\n");
           for(j =0; j <coluna; j++)
           {  
            System.out.printf("%s",mtrz[i][j] + "\t");
           }
           System.out.printf("\n");
       }

       System.out.printf("\n");

       System.out.println("---------------------------------");
        System.out.print("Digite o valor para multiplicar a matriz: ");
        m = entrada.nextInt();
        for (i = 0; i < mtrz.length ; i++){
            for (j = 0; j < mtrz[i].length; j++){
                mult [i][j] = mtrz[i][j] * m;
            } 
        }

        System.out.println("---------------------------------");
        System.out.println(" Valores Multiplicação da Matriz ");
        System.out.println("---------------------------------");
       for(i = 0; i<linha ; i++){
           System.out.print("\n");
           for(j =0; j <coluna; j++)
           {  
            System.out.printf("%s",mult[i][j] + "\t");
           }
       }
        entrada.close();
    }
}
