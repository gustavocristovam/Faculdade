//Ler o número total de eleitores de um município,
// o número de votos brancos,
// nulos e
//válidos.
// Calcular e escrever o percentual que cada um representa em relação ao total de
//eleitores.

import java.util.Scanner;
public class eleitoresMunicipio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int votosTotais, votosBrancos,votosNulos,votosValidos;
        System.out.println("Quantos votos em brancos teve: ");
        votosBrancos = teclado.nextInt();
        System.out.println("Quantos votos nulos teve: ");
        votosNulos = teclado.nextInt();
        System.out.println("Quantos votos validos: ");
        votosValidos = teclado.nextInt();

        votosTotais = votosBrancos+votosNulos+votosValidos;

        System.out.println("A eleição teve " + votosTotais + " eleitores!");
        System.out.printf("%.2f %% Votos em Branco \n",(double) votosBrancos/votosTotais*100);
        System.out.printf("%.2f %% Votos em Nulos \n",(double) votosNulos/votosTotais*100);
        System.out.printf("%.2f %% Votos em Validos \n",(double) votosValidos/votosTotais*100);




    }
}
