
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var nomePrimeiraPessoa = scanner.next();
        System.out.println("Informe sua idade");
        var idadePrimeiraPessoa = scanner.nextInt();
        System.out.println("Informe seu nome:");
        var nomeSegundaPessoa = scanner.next();
        System.out.println("Informe sua idade");
        var idadeSegundaPessoa = scanner.nextInt();
        var diferencaIdade = idadePrimeiraPessoa - idadeSegundaPessoa;
        System.out.printf("A diferença de idade entre %s e %s é de %s anos\n", nomePrimeiraPessoa, nomeSegundaPessoa, diferencaIdade);
        
    }
}
