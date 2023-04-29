import java.util.Scanner;

public class ExercicioSeteListaTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, contadorPares = 0, contadorImpares = 0;
        System.out.println("Digite 10 números inteiros:");
        int quantidade = 10;
        while (quantidade > 0) {
            System.out.print("Número: ");
            numero = input.nextInt();
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
            quantidade--;
        }
        
        System.out.println("Quantidade de números pares: " + contadorPares);
        System.out.println("Quantidade de números ímpares: " + contadorImpares);
        input.close();
    }
}
