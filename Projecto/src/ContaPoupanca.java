public class ContaPoupanca {
    protected final int CARTAO =0 ;
    protected static String tipoConta = "ContaPoupanca";
    protected int idContaPoupanca;

    public ContaPoupanca(int numCliente, int numConta, String op) {

        this.idContaPoupanca = idContaPoupanca++; /* n devia ser sequencial! criar metodo, para verificar
         se uma conta entreanto foi eliminada, e criar nesse sitio !*/
        this.tipoConta = "ContaPoupanca";
    }
}