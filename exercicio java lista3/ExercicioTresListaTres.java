import java.util.Scanner;

public class ExercicioTresListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite o nome: ");
        nome = scanner.next();

        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);


        do {
            System.out.println("Digite o salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);


        do {
            System.out.println("Digite o sexo ('feminino' ou 'masculino'): ");
            sexo = scanner.next();
        } while (!sexo.equals("feminino") && !sexo.equals("masculino"));

        do {
            System.out.println("Digite o estado civil ('solteiro', 'casado', 'viúvo(a)' ou 'divorciado(a)'): ");
            estadoCivil = scanner.next();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        scanner.close();

        System.out.println("\nInformações cadastradas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
