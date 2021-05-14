import java.util.Scanner;

/*Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.*/

public class Ex01 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o 1º valor.: ");
        n1 = scan.nextInt();
        System.out.println("Digite o 2º valor.: ");
        n2 = scan.nextInt();
        do
        {
        System.out.println("Digite o 2º valor.: ");
        n2 = scan.nextInt();
        }
        while(n2 < n1);
         System.out.println(n1 + " " + n2);        
    }    
}
