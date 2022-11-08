import javax.swing.*;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected Banco banco;

    private static int SEQUENCIAL = 1;

    public Conta(Banco banco, Cliente cliente)
    {
        this.banco = banco;
        banco.contas.add(this);
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void Sacar(double valor) {
        if(valor <= saldo)
        saldo -= valor;
        else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
            System.exit(0);
        }

    }

    @Override
    public void Depositar(double valor) {
        saldo +=valor;
    }

    @Override
    public void Transferir(double valor, IConta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }
    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Conta: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                ", banco=" + banco +
                '}';
    }
}
