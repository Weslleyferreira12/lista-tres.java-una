import java.util.Scanner;

public class ExercicioDoisListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario, senha;

        System.out.print("Digite o nome de usuário: ");
        nomeUsuario = scanner.next();

        System.out.print("Digite a senha: ");
        senha = scanner.next();

        while (senha.equals(nomeUsuario)) {
            System.out.println("Senha inválida! A senha não pode ser igual ao usuário.");
            System.out.print("Digite a senha novamente: ");
            senha = scanner.next();
        }
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("Nome de usuário: " + nomeUsuario);
        System.out.println("Senha: " + senha);

        scanner.close();
    }
}
