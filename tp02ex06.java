/*6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.*/

import java.util.Scanner;
import java.util.Arrays;

public class tp02ex06 {
    public static void main(String[] args) {
        String nome[][] = new String[2][3];
        Scanner entrada = new Scanner(System.in);
        int i, j;
        int linha = 2;
        int coluna = 3;

        for (i = 0; i < nome.length; i++){
            for (j = 0; j < nome[i].length; j++){
                System.out.print("Digite o primeiro nome: ");
                nome[i][j] = entrada.next();
            }
        }

        System.out.println("---------------------------------");
        System.out.println("           Matriz Nome           ");
        System.out.println("---------------------------------");
       for(i = 0; i<linha ; i++)
       {
           System.out.print("\n");
           for(j =0; j <coluna; j++)
           {  
            System.out.printf("%s",nome[i][j] + "\t");
           }
       }
    }
}
