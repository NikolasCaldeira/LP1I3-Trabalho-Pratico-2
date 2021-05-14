import java.util.Scanner;


public class Ex03 {

   /*Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=0;
        
        double menor = 999999999;
        String cont = "S";
        
        
        System.out.println("Informe a quantidade de números que será digitado: ");
        n=scan.nextInt();

        double[] vect =new double[n];
        double maior=vect[0], sum=0, numeroPos=0, numeroNeg=0;
        do
        {     
        for(int i=0 ; i < n; i++)
        {
          System.out.println("Digite o valor:");
           vect[i] = scan.nextDouble();
           
        if(maior<vect[i])
        {
            maior=+vect[i];
        }
        if(menor>vect[i])
        {
            menor=+vect[i];
        }
        if(vect[i]>0)
        {
            numeroPos++;
        }
         if(vect[i]<0)
        {
            numeroNeg++;
        }
        
        }
             
       
        for (int i=0; i<n; i++) 
        {
        sum += vect[i];       
        }
        double media = sum /n; 
        
        
         System.out.println("O maior valor "+maior);
         System.out.println("O menor valor "+menor);
         System.out.println("A soma dos valores "+sum);
         System.out.println("A média aritmética dos valores "+media);
         System.out.println("A porcentagem de valores que são positivos: "+(numeroPos/n)*100+"%");
         System.out.println("A porcentagem de valores negativos: "+(numeroNeg/n)*100+"%");
         System.out.println("Deseja continuar? [S/N]");
         cont= scan.next().toUpperCase();
         
   }
        while (cont=="S");
         
        scan.close();
    }
    
}