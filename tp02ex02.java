/*2. Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.*/

import java.util.Scanner;
import java.util.Arrays;

public class tp02ex02 {
    public static void main(String[] args) {
        double v[] = new double [10];
        double media;
        int i;
        Scanner entrada = new Scanner(System.in);

        for (i = 0; i<v.length;   i++) {
            System.out.print("Informe o " + (i+1) + "º valor de 10: ");
            v[i] = entrada.nextDouble();
        }
        
        double soma = 0;
        double maior = v[0];
        
        for (i = 0; i < v.length ; i++) {
            soma = soma + v[i];

            if (v[i] > maior) {
                maior = v[i];
            }
        }

        media = soma / v.length;

        System.out.printf("\n");
        System.out.println("O maior valor digitado é: " + maior);
        System.out.println("A soma dos valores digitado é: " + soma);
        System.out.println("A média dos valores digitado é: " + media);
        entrada.close();
    }
}
