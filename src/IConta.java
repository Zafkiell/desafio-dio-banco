public interface IConta {

    void Sacar(double valor);

    void Depositar(double valor);

    void Transferir(double valor, IConta contaDestino);

    void ImprimirExtrato();
}
