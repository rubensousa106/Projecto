public class ClientesVIP extends ClientesNormal {
    private String TipoCliente;
    private GestorConta gc;

    public ClientesVIP(int numCliente, String nome, int telefone, String email, String profissao, int numConta,
                       int cartoes,int saldo, GestorConta gc) {
        super(numCliente, nome, telefone, email, profissao, numConta, cartoes,saldo);
        this.TipoCliente = "VIP";
        this.gc = gc;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }



    @Override
    public String toString() {
        return "\nClientes VIP[numCliente=" + numCliente + ", Nome=" + Nome + ", Telefone=" + Telefone + ", Email=" + Email
                + ", Profissao=" + Profissao + ", numConta=" + numConta + ", Cartoes=" + Cartoes + "Saldo=" + saldo +
                "\n[" + gc +"]\n";
    }



}
