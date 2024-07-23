package teste;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        Cadastros<Conta> cadastros = new Cadastros<Conta>();

        while (true) {

            System.out.println("\nQual ação deseja realizar?");
            System.out.println("1. Adicionar conta");
            System.out.println("2. Remover conta");
            System.out.println("3. Listar contas");
            System.out.println("4. Procurar conta");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Insira o username: ");
                    String username = scanner.nextLine();
                    System.out.print("Insira o email: ");
                    String email = scanner.nextLine();
                    System.out.print("Insira a senha: ");
                    String senha = scanner.nextLine();
                    Conta conta = new Conta(username, email, senha);
                    cadastros.adicionarConta(conta);
                    break;
                case 2:
                    System.out.print("Insira o username da conta a ser removida: ");
                    String usernameRemover = scanner.nextLine();
                    cadastros.removerConta(usernameRemover);
                    break;
                case 3:
                    cadastros.listarContas();
                    break;
                case 4:
                    System.out.print("Insira o username da conta a ser procurada: ");
                    String usernameProcurar = scanner.nextLine();
                    Conta encontrada = cadastros.procurarConta(usernameProcurar);
                    if (encontrada != null) {
                        System.out.println(encontrada);
                    }
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
    

