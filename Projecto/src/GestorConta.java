public class GestorConta {

    private String nome;
    private int Telefone;
    private String Email;

    public GestorConta(String nome, int telefone, String email) {
        this.nome = nome;
        this.Telefone = telefone;
        this.Email = email;
    }

    @Override
    public String toString() {
        return "GestorConta [nome=" + nome + ", Telefone=" + Telefone + ", Email=" + Email + "]";
    }

}
