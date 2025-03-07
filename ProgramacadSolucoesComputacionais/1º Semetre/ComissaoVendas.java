///Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração
// que sua comissão será de 5% do total da venda e que você tem os seguintes dados: preço
// unitário da peça e quantidade vendida.
import java.util.Scanner;
public class ComissaoVendas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precoUnitario = 9.65;
        int quantidadePecas;

        System.out.println("Quantidade de peças vendidas -> ");

        while (!teclado.hasNextInt()) {
            System.out.println("Número inválido tem quer ser um inteiro!");
            System.out.println("Quantidade de peças vendidas -> ");
            teclado.next();
        }
        quantidadePecas = teclado.nextInt();

        System.out.printf("A comissão do vendedor será de: R$%.2f",(quantidadePecas*precoUnitario)*5/100);
    }

}
