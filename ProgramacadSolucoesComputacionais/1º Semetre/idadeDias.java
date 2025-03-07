//Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um
//ano tem 365 dias.
import java.util.Scanner;
public class idadeDias {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
         int idade;
        System.out.println("Informe sua idade: ");
        idade = tecla.nextInt();
        System.out.println("Você tem " + idade*365 + " dias de vida.");
    }
}
