//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
//do distribuidor e dos impostos (aplicados ao custo de fábrica).
// Supondo que o percentual
//do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro,
//calcular e escrever o custo final ao consumidor.

import java.util.Scanner;
public class carroCalculator {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int percentualDistribuidor = 28;
        int impostos = 45;
        double custoFabrica,custoConsumidor;
        System.out.println("Qual é o custo de fabricação do carro: ");
        custoFabrica = tecla.nextDouble();
        custoConsumidor = custoFabrica + (custoFabrica*(impostos/100.0)) + (custoFabrica*(percentualDistribuidor/100.0));
        System.out.printf("O valor total do carro para o consumidor será de: R$ %.2f", custoConsumidor);
    }

}
