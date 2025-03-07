import java.util.Scanner;
//Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir
//o valor do novo salário.

//Salario tem como diminuir nao emmm kkk

public class salarioAjustes {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double salarioMensal,reajuste;
        System.out.println("Informe seu sálario atual: Exemplo: 1526.95");
        salarioMensal = tecla.nextDouble();
        //O certo seria 15.50 porém meu teclado esta em portugues, dai tem q ser ","
        System.out.println("Informe o percentual de reajuste: Exemplo 15,50");
        reajuste = tecla.nextDouble();
        System.out.printf("Seu novo salário será de: R$ %.2f",(salarioMensal + salarioMensal*(reajuste/100)));
    }
}
