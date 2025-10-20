import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado 1:");
        var primeiroLado = scanner.nextInt();
        System.out.println("Informe o tamano do lado 2:");
        var segundoLado = scanner.nextInt();
        var area = primeiroLado * segundoLado;
        System.out.printf("A aréa calculada é de %s \n", area);
    }
}