import java.util.Arrays;
import java.util.Scanner;

/*Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta. */

public class Ex09 {

   
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       int m=0;
       int n=0;
       int m2=0;
       int n2=0;
       do
       {
        System.out.println("Informe a quantidade de linhas da matriz");
        m=scan.nextInt();
       }
       while(m>10);
       do
       {
       System.out.println("Informe a quantidade de colunas da matriz");
       n=scan.nextInt();
       }
       while(n>10);
        int matriz[][]=new int[m][n];
        int matriztransposta[][] =new int[n][m];
        int linha=m; 
        int coluna=n;
       
       for(int i=0;i<linha;i++)
       {
           for(int k=0;k<coluna;k++)
               
           {  
               System.out.println("Informe os numeros da matriz "+(i+1)+"x"+(k+1)+".: ");
               matriz[i][k]=scan.nextInt();
               matriztransposta[k][i]=matriz[i][k];
           }
       }      
        System.out.println("---------------------------------");
        System.out.println("Valores Originais ");
        System.out.println("---------------------------------");
       for(int i=0;i<linha;i++)
       {
           System.out.print("\n");
           for(int k=0;k<coluna;k++)
           {  
            System.out.printf("%s",matriz[i][k] + "\t");
           }
       }
        m2=n;
        n2=m;
        int linha2=m2; 
        int coluna2=n2;
        System.out.print("\n");
        System.out.println("---------------------------------");
        System.out.println("Matriz Transposta");
        System.out.println("---------------------------------");
       for(int i=0;i<linha2;i++)
       {
           System.out.print("\n");
           for(int k=0;k<coluna2;k++)
           {  
                System.out.printf("%s",matriztransposta[i][k] + "\t");
           }
       }
        scan.close();
    }
}