package teste;
import java.util.ArrayList;

public class Cadastros<T> {

    private Object[] contas = new Object[3];
    private int tamanho = 0;

  public void adicionarConta(T conta) {
        if (tamanho == contas.length) {
            aumentarVetor();
        }
        contas[tamanho++] = conta;
        System.out.println("Conta registrada com sucesso!");
    }

  public void removerConta(String username) {
        for (int i = 0; i < tamanho; i++) {
            T conta = (T) contas[i];
            if (conta instanceof Conta) {
                Conta c = (Conta) conta;
                if (c.getUsername().equals(username)) {
                    contas[i] = contas[--tamanho];
                    contas[tamanho] = null;
                    System.out.println("Conta excluída com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Conta não encontrada!");
    }

  public T procurarConta(String username) {
        for (int i = 0; i < tamanho; i++) {
            T conta = (T) contas[i];
            if (conta instanceof Conta) {
                Conta c = (Conta) conta;
                if (c.getUsername().equals(username)) {
                    return conta;
                }
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }

   public void aumentarVetor() {
        Object[] novoContas = new Object[contas.length * 2];
        System.arraycopy(contas, 0, novoContas, 0, contas.length);
        contas = novoContas;
   }

   public void listarContas() {
        if (tamanho == 0) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(contas[i]);
            }
        }
    }
}
