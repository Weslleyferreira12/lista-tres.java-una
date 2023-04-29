import java.util.Scanner;

public class ExercicioSeisListaTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2, inicio, fim;
        System.out.print("Digite os números separados dando espaço: ");
        numero1 = input.nextInt();
        numero2 = input.nextInt();
        input.close();
        System.out.println("Números no intervalo: ");
        inicio = numero1;
        fim = numero2;
        if (numero1 > numero2) {
            inicio = numero2;
            fim = numero1;
        }
        while (inicio <= fim) {
            System.out.print(inicio + " ");
            inicio++;
            input.close();
        }
    }
}
