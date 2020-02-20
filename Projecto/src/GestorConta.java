public class GestorConta extends Pessoa {

    private String nome;
    private int Telefone;
    private String Email;

    public GestorConta() {
        super(nome, telefone, email);
        /*
        this.nome = nome;
        this.Telefone = telefone;
        this.Email = email;

         */
    }

    @Override
    public String toString() {
        return "GestorConta [nome=" + nome + ", Telefone=" + Telefone + ", Email=" + Email + "]";
    }

}
