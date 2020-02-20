import java.util.Random;

public class ClientesNormal {

    protected String TipoCliente;
    protected int numCliente; //ESTE NUMERO VAI SER INVISIVEL E NAO PODE SER PERGUNTADO AO UTILIZADOR
    public String Nome;
    protected int Telefone;
    protected String Email;
    protected String Profissao;
    protected int numConta;
    protected int Cartoes;
    protected double saldo; //UM CLIENTE NAO TEM SALDO, UMA CONTA É Q TEM SALDO ! ELIMINAR ESTA LINHA

    public ClientesNormal(int numCliente, String nome, int telefone, String email, String profissao, int numConta,
                          int cartoes, int saldo) {
        this.TipoCliente = "NORMAL";
        this.numCliente = numCliente;
        this.Nome = nome;
        this.Telefone = telefone;
        this.Email = email;
        this.Profissao = profissao;
        this.numConta = numConta;
        this.Cartoes = cartoes;
        this.saldo = saldo;
    }

    public String getNome() {
        return Nome;
    }

    public int getnumCliente() {
        return numCliente;
    }

    public int getnumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }


    public String getEmail() {
        return Email;
    }


    public void setEmail(String email) {
        Email = email;
    }


    public String getProfissao() {
        return Profissao;
    }


    public void setProfissao(String profissao) {
        Profissao = profissao;
    }


    @Override
    public String toString() {
        return "Clientes [numCliente=" + numCliente + ", Nome=" + Nome + ", Telefone=" + Telefone + ", Email=" + Email
                + ", Profissao=" + Profissao + ", numConta=" + numConta + ", Cartoes=" + Cartoes + "Saldo=" + saldo + "] \n";
    }

    public void SaldoActual() {
        System.out.print("Saldo actual do cliente," + Nome + " é :" + this.saldo + "€");
    }


}