//Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
import java.util.Scanner;
public class calcularArea {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int base,altura;
        System.out.println("Informe a altura do retângulo: ");
        altura = tecla.nextInt();
        System.out.println("Informe a largura do retângulo: ");
        base = tecla.nextInt();
        System.out.println("A área do retângulo é: " + base*altura);




    }
}
