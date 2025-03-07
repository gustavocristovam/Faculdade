//Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo
//por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor
//das vendas por ele efetuadas.
// Ler o número de carros por ele vendidos, o valor total de
//suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o
//salário final do vendedor.


import java.util.Scanner;
public class salarioCalculator {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int numeroCarros;
        double valorTotalVendas=0, valorTotalComissoes = 0;
        double salarioFixo = 1000,comissaoFixa =10;
        double salarioFinal;
        double valorCarro;
        System.out.println("Informe quantos carros foram vendidos: ");
        numeroCarros = tecla.nextInt();
        for(int i = 1; numeroCarros >= i; i++) {
            System.out.println("Informe do preço do carro Nº" + i + ":");
            valorCarro = tecla.nextDouble();
            valorTotalVendas += valorCarro;
            valorTotalComissoes+= (valorCarro/comissaoFixa);
        }
        salarioFinal = salarioFixo + valorTotalComissoes + (valorTotalVendas*(5/100.0));
        System.out.printf("O salário deste vendedor será de: R$ %.2f", salarioFinal);

    }
}
