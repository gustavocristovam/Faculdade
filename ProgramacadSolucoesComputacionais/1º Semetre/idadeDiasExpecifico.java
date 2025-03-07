//Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa
//expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class idadeDiasExpecifico {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int anosVida,mesesVida,diasVida;
        System.out.println("Digite sua idade em anos:");
        anosVida = tecla.nextInt();
        System.out.println("Digite os meses adicionais:");
        mesesVida = tecla.nextInt();
        System.out.println("Digite os dias adicionais:");
        diasVida = tecla.nextInt();
        int diasVidaTotal = (anosVida*365) + (mesesVida*30) + diasVida;
        System.out.println("Você tem " + diasVidaTotal + "  dias de vida!");
    }
}
