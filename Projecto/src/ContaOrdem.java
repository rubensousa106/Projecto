public class ContaOrdem {
    protected static String tipoConta = " Ordem";
    protected int idContaOrdem;
    protected int numCliente;
    protected double Remuneracao = 1.5;

    // protected int cartao[]; // pode ter 1 ou + !

    public ContaOrdem(int numCliente) {
        this.idContaOrdem = idContaOrdem++;
        this.tipoConta = "CONTA ORDEM";
        this.numCliente = numCliente;

    }

    @Override
    public String toString() {
        return "ID : " + this.idContaOrdem + "\n Tipo de Conta : " + this.tipoConta + "\n Numero de Cliente : "
                + this.numCliente;
    }


}
