public class ContaPoupanca extends ContaOrdem {
    protected final int CARTAO = 0;
    protected static String tipoConta = "ContaPoupanca";
    protected int idContaPoupanca;

    public ContaPoupanca(int numCliente) {
        super(numCliente);
        this.idContaPoupanca = idContaPoupanca++;
        this.tipoConta = "Conta Poupanca";


    }
}