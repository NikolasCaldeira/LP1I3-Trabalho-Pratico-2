import java.util.Scanner;

public class Ex05 
{

    public static void main(String[] args) 
    {
       Scanner scan = new Scanner(System.in);       
       int n[][]=new int[3][2];
               
       for(int i=0;i<n.length;i++)
       {
           for(int k=0;k<n[i].length;k++)               
           {  
               System.out.println("Informe os numeros da matriz 3x2.: ");
               n[i][k]=scan.nextInt();
           }
       }
       for(int i=0;i<n.length;i++)
       {
           for(int k=0;k<n[i].length;k++)   
           {
               System.out.println("|" + n[i] + "|" + n[k] + "|");
               //System.out.println(n[i][k]);
           }
       }
        scan.close();
    }
}
