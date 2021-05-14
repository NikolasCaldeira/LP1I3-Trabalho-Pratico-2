import java.util.Arrays;
import java.util.Scanner;

/*Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.  */

public class Ex11 {

   
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       int m=0;

       do
       {
        System.out.println("Informe a quantidade de linhas e colunas da matriz quadratica");
        m=scan.nextInt();
       }
       while(m>10);
      
        int matriz[][]=new int[m][m];
        int linha=m; 
        int coluna=m;
       
       for(int i=0;i<linha;i++)
       {
           for(int k=0;k<coluna;k++)
               
           {  
               System.out.println("Informe os numeros da matriz "+(i+1)+"x"+(k+1)+".: ");
               matriz[i][k]=scan.nextInt();
           }
       }      
        System.out.println("---------------------------------");
        System.out.println("Matriz quadratica");
        System.out.println("---------------------------------");
       for(int i=0;i<linha;i++)
       {
           System.out.print("\n");
           for(int k=0;k<coluna;k++)
           {  
            System.out.printf("%s",matriz[i][k] + "\t");
           }
       }

        double det=0;
        if(m==1)
        {
            System.out.print("\n");
            System.out.print("Digite um valor superior a 1 para calcular a determinante da matriz.");
        }
        else
        {
            if(m==2)
            {
                det = ((matriz[0][1]*matriz[1][0])*(-1)) + matriz[0][0]*matriz[1][1];
            }
            else
            {
                if(m==3)
                {
                    det = ((matriz[0][2]*matriz[1][1]*matriz[2][0]*(-1)) + (matriz[0][0]*matriz[1][2]*matriz[2][1])*(-1) + (matriz[0][1]*matriz[1][0]*matriz[2][2])*(-1)) + ((matriz[0][0]*matriz[1][1]*matriz[2][2]) + (matriz[0][1]*matriz[1][2]*matriz[2][0]) + (matriz[0][2]*matriz[1][0]*matriz[2][1]));
                }
                else
                {
                    System.out.print("\n");
                    System.out.println("---------------------------------");
                    System.out.print("Não calculei o restante.");
                }
            }
        }


        System.out.print("\n");
        System.out.println("---------------------------------");
        System.out.print("\n");
        System.out.printf("O valor da det "+m+"x"+m+" eh.: "+det);
        System.out.print("\n");






        System.out.print("\n");
        scan.close();
    }
}