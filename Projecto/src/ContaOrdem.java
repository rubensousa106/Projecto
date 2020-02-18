public class ContaOrdem extends Conta{
    protected static String tipoConta = " Ordem";
    protected int idContaOrdem;
    protected int numCliente;
    protected double Remuneracao = 1.5;

   // protected int cartao[]; // pode ter 1 ou + !
    /*
    public ContaOrdem(int numCliente, int numConta) {
        this.idContaOrdem = idContaOrdem++;
        this.tipoConta = "CONTA ORDEM";
        this.numCliente = numCliente;
        this.numConta = numConta;
    }
    */

    public ContaOrdem(int numeroConta,int numeroCliente, String conta,ClientesNormal a,String op){
        super(numeroConta,numeroCliente,conta);
        numeroConta = idContaOrdem++;
        this.conta = conta.concat(tipoConta);
        this.juro = Remuneracao;
        ContaOrdem CP = new ContaOrdem(a.getnumConta(), a.numCliente,op,a, op);
        Main.listaConta.add(CP);
        System.out.println(CP);
        //

    }


    public void metodoTeste(){


    }


    @Override
    public String toString() {
        return "ID : " + this.idContaOrdem + "\n Tipo de Conta : " + this.tipoConta + "\n Numero de Cliente : "
                + this.numCliente ;
    }


}
