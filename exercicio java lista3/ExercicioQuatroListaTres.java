import java.util.Scanner;

public class ExercicioQuatroListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = 5;
        int numero;
        int soma = 0;
        double media;
        int contador = 1;
        
        System.out.println("Digite 5 números inteiros:");
        while (contador <= quantidadeNumeros) {
            System.out.print("Número " + contador + ": ");
            numero = scanner.nextInt();
            soma += numero;
            contador++;
        }
        
        media = (double) soma / quantidadeNumeros;
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        
        scanner.close();
    }
}
