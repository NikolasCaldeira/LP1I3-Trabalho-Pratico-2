import java.util.Scanner;

/*Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

public class Ex07 {

   
    public static void main(String[] args) {
       
       Scanner scan = new Scanner(System.in);
       
       int matriz[][]=new int[3][4];
       int mLinha=3; 
       int mColuna=4;
       
       for(int i=0;i<mLinha;i++)
       {
           for(int k=0;k<mColuna;k++)
           {  
               System.out.println("Informe os numeros da matriz "+(i+1)+"x"+(k+1)+".: ");
               matriz[i][k]=scan.nextInt();
           }     
       }
        System.out.println("informe o numero multiplicador: ");
        int mult=scan.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Valores Digitados.");
        System.out.println("---------------------------------");
        System.out.println("|"+(matriz[0][0])+" "+(matriz[0][1])+" "+(matriz[0][2])+" "+(matriz[0][3])+"|");
        System.out.println("|"+(matriz[1][0])+" "+(matriz[1][1])+" "+(matriz[1][2])+" "+(matriz[1][3])+"|");
        System.out.println("|"+(matriz[2][0])+" "+(matriz[2][1])+" "+(matriz[2][2])+" "+(matriz[2][3])+"|");

       for(int i=0;i<mLinha;i++)
       {
           for(int k=0;k<mColuna;k++)
           {  
              matriz[i][k]=mult*matriz[i][k];
           }
       }

        System.out.println("---------------------------------");
        System.out.println("Valores Multiplicados.");
        System.out.println("---------------------------------");

        System.out.println("|"+(matriz[0][0])+" "+(matriz[0][1])+" "+(matriz[0][2])+" "+(matriz[0][3])+"|");
        System.out.println("|"+(matriz[1][0])+" "+(matriz[1][1])+" "+(matriz[1][2])+" "+(matriz[1][3])+"|");
        System.out.println("|"+(matriz[2][0])+" "+(matriz[2][1])+" "+(matriz[2][2])+" "+(matriz[2][3])+"|");

        scan.close();
    }
    
}
