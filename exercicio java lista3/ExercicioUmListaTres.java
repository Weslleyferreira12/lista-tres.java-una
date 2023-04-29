import java.util.Scanner;

public class ExercicioUmListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
        }

        System.out.println("Você digitou a nota: " + nota);
        scanner.close(); 
    }
}
