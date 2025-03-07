//Ler um valor inteiro e exibir seu antecessor.

import java.util.Scanner;
public class exibirAntecessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        System.out.println("Escreve um número inteiro:");
        while(!teclado.hasNextInt()) {
            System.out.println("O valor precisa ser um número inteiro!");
            teclado.next();
        }
        valor = teclado.nextInt();
        System.out.println("O antecessor do número " + valor + " é " + (valor - 1));

    }
}
