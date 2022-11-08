import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contas = new ArrayList<>();

    protected void ListarClientes()
    {
        System.out.println("=== Os clientes do banco " +nome+ " são: ===");
        for(int i = 0; i < contas.size();i++) {
            System.out.println("Nome: " + contas.get(i).cliente.getNome() +
                    " Agência: " + contas.get(i).getAgencia() +
                    " Conta: " + contas.get(i).getNumero());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
