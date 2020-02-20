public class abstract Pessoa{

            /*Clientes, Clientes VIP, GESTOR DE CLIENTE VÃO EXTENDER DESTA CLASSE PORQUE TODAS ESTAS CLASSES TEM EM
            COMUM ESTES 3 ELEMENTOS :
                -NOME
                -TELEFONE
                -EMAIL
             */
public String nome;
public int telefone;
public String email;

public Pessoa(String nome,int telefone,String email){
        this.nome=nome;
        this.Telefone=telefone;
        this.Email=email;
        }
        }
