/*4 - Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class tp02ex04 {
    public static void main(String[] args) {
        double mtr [][] = new double[2][3];
        int i, j;
        int linha = 2;
        int coluna = 3;

        for (i = 0; i < mtr.length ; i++){
            for (j = 0; j < mtr[i].length; j++){
                mtr [i][j] = Math.round(Math.random() * 10);
            } 
        }

        System.out.println("Valores gerados aleatóriamente");
        for (i = 0; i < mtr.length; i++){
            for (j = 0; j < mtr[i].length; j++){
                System.out.println(mtr[i][j]);
            }
        }

        System.out.println("---------------------------------");
        System.out.println("         Valores da Matriz       ");
        System.out.println("---------------------------------");
       for(i = 0; i<linha ; i++)
       {
           System.out.print("\n");
           for(j =0; j <coluna; j++)
           {  
            System.out.printf("%s",mtr[i][j] + "\t");
           }
       }
    }
    
}
