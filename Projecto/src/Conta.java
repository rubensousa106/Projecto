public abstract class Conta {
    protected static int NumeroConta ;
    protected static double juro;
   // protected static int cartao;
    protected static String conta = "Conta ";

    public Conta(int numeroConta,int numeroCliente, String conta) {
        this.NumeroConta = NumeroConta;
        numeroCliente = numeroCliente;
        this.conta = conta;
        this.juro = 0.0;
        //teste
        System.out.println("x");
        System.out.println("2 Alteração");
    }
}
