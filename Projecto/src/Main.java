import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean state;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ClientesNormal> listaCliente = new ArrayList<ClientesNormal>();
    static ArrayList<ContaOrdem> listaConta = new ArrayList<ContaOrdem>();
    public final double COMISSAO_TRANSFERENCIA = 1.81;
    static GestorConta Maria = new GestorConta("Maria", 919133668, "maria@caixa.pt");
    // A Conta a ordem é criada quando se cria um novo cliente!
    static ClientesVIP ze = new ClientesVIP(1, "ze", 917857812, "ze@gmail.com", "rapper", 12312312, 1, 500, Maria);
    static ClientesVIP mario = new ClientesVIP(2, "mario", 917857812, "ze@hotmail.com", "carpinteiro", 12312312, 1, 500,
            Maria);
    static ClientesNormal rs = new ClientesNormal(3, "rs", 111111111, "rs@gmail.com", "trolha", 412341, 1, 10000);

    //nao podem ser criado clientes com numero de contas iguais

    /***
     * METODO DE TESTE DE TRANSFERENCIA !!
     */
    public static void metodoTestes() {
        //Falta aplicar os juros e espaço temporal

        System.out.println("Introduza o numero do Cliente do qual pretende fazer o Transferencia : ");
        int numeroCliente = sc.nextInt();
        if (verificaNumCliente(listaCliente, numeroCliente) == false) {
            System.out.println("Numero de Cliente incorrecto!");
            return;
        }else{
            ClientesNormal cl1 = retornaCliente(numeroCliente);
        }

        System.out.println("Introduza o numero de Conta :");
        int numeroConta = sc.nextInt();
        //Criar metodo para verificar se o numero de conta pertence ao numero de cliente

        System.out.println("Introduza o numero do Cliente para o qual pretende fazer o Transferencia : ");
        int numeroCliente2 = sc.nextInt();
        if ((verificaNumCliente(listaCliente, numeroCliente) == false) || numeroCliente == numeroCliente2) {
            System.out.println("Numero de Cliente incorrecto!");
            return;
        }else{
            ClientesNormal cl2 = retornaCliente(numeroCliente2);
        }


        System.out.println("Introduza o montade que pretende depositar :");
        int montante = sc.nextInt();

        while (montante <= 0) {
            System.out.println("Montante Incorrecto ! Introduza de novo : ");
            montante = sc.nextInt();
        }
        ;
        ClientesNormal mt = retornaCliente(numeroCliente);
        ClientesNormal mt2 = retornaCliente(numeroCliente2);
        mt.saldo = mt.saldo - montante;
        mt2.saldo = mt2.saldo + montante;
        mt.SaldoActual();
        System.out.println();
        mt2.SaldoActual();

    }



    /***
     * metodo para transferencias (ESTA A SER CRIADO NO METODO DE TESTES!!)
     */
    public static void transferencia() {
        //Falta aplicar os juros e espaço temporal

        System.out.println("Introduza o numero do Cliente do qual pretende fazer o Transferencia : ");
        int numeroCliente = sc.nextInt();
        if (verificaNumCliente(listaCliente, numeroCliente) == false) {
            System.out.println("Numero de Cliente incorrecto!");
            return;
        }

        System.out.println("Introduza o numero do Cliente para o qual pretende fazer o Transferencia : ");
        int numeroCliente2 = sc.nextInt();
        if ((verificaNumCliente(listaCliente, numeroCliente) == false) || numeroCliente == numeroCliente2) {
            System.out.println("Numero de Cliente incorrecto!");
            return;
        }

        System.out.println("Introduza o montade que pretende depositar :");
        int montante = sc.nextInt();

        while (montante <= 0) {
            System.out.println("Montante Incorrecto ! Introduza de novo : ");
            montante = sc.nextInt();
        }
        ;
        ClientesNormal mt = retornaCliente(numeroCliente);
        ClientesNormal mt2 = retornaCliente(numeroCliente2);
        mt.saldo = mt.saldo - montante;
        mt2.saldo = mt2.saldo + montante;
        mt.SaldoActual();
        System.out.println();
        mt2.SaldoActual();
    }

    /***
     * metodo para Depositos
     */
    public static void deposito() {
        //Falta aplicar os juros e espaço temporal
        System.out.println("Introduza o numero do cliente do qual pretende fazer o Deposito : ");
        int numeroCliente = sc.nextInt();
        if (verificaNumCliente(listaCliente, numeroCliente) == false) {
            System.out.println("Numero de Cliente incorrecto!");
            return;
        }
        System.out.println("Introduza o montade que pretende depositar :");
        int montante = sc.nextInt();

        while (montante <= 0) {
            System.out.println("Montante Incorrecto ! Introduza de novo : ");
            montante = sc.nextInt();
        }
        ;
        ClientesNormal mt = retornaCliente(numeroCliente);
        mt.saldo = mt.saldo + montante;
        mt.SaldoActual();
    }

    /***
     * metodo para Levantamentos
     */
    public static void levantamento() {
        //Falta aplicar os juros e espaço temporal
        System.out.println("Introduza o numero do cliente do qual pretende fazer o levantamento : ");
        int numeroCliente = sc.nextInt();
        if (verificaNumCliente(listaCliente, numeroCliente) == false) {
            System.out.println("Numero de Cliente incorrecto!");
            return;
        }
        System.out.println("Introduza o montade que pretende levantar :");
        int montante = sc.nextInt();
        while (montante <= 0) {
            System.out.println("Montante Incorrecto ! Introduza de novo : ");
            montante = sc.nextInt();
        }
        ;
        ClientesNormal mt = retornaCliente(numeroCliente);
        if (mt.saldo > montante) {
            mt.saldo = mt.saldo - montante;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        mt.SaldoActual();
    }

    /***
     * devolve um Cliente atraves do numero de cliente
     * @return 1 Cliente
     */
    public static ClientesNormal retornaCliente(int numeroCliente) {
        //testar para clientes VIP !!
        for (ClientesNormal clientes : listaCliente) {
            if (clientes.numCliente == numeroCliente)
                return clientes;
        }
        return null;
    }

    /***
     * metodo para listar os clientes
     * @param listaConta
     */
    public static void listaConta(ArrayList<ContaOrdem> listaConta) {
        for (int i = 0; i < listaConta.size(); i++) {
            System.out.println(listaConta.get(i).toString());
        }
    }

    public static void criaConta(ArrayList<ClientesNormal> listaCliente, ArrayList<ContaOrdem> listaConta) {
        // Por completar
        /*
         sugestao minha : para criar conta, penso que nao seja preciso passar
         nada como argumento visto q o arraylist é estático
        */
        /*
        System.out.println("***Criar Conta ***");
        System.out.println("\nIntroduza o numero de Cliente :");
        int numeroCliente = sc.nextInt();
        boolean state = verificaNumCliente(listaCliente, numeroCliente); //verifica se existe o numero do cliente
        if (state == true) {
            System.out.println("O Cliente Existe!");
            System.out.println("Que tipo de conta deseja criar ?(Poupanca | INVESTIMENTO (APENAS CLIENTES VIP) )");
            String op = sc.next();
            if (op.equalsIgnoreCase("POUPANCA")) {
                //como qualquer cliente pode criar uma conta poupança .....
                ClientesNormal a = listaCliente.get(numeroCliente);
                ContaOrdem conta = new ContaOrdem(a.getnumCliente(), a.getnumConta(),0,"");//ESTA ERRADA ESTA LINHA
                listaConta.add(conta);
                conta.toString();
                System.out.println("Conta a Poupanca Criada!");
            } else if (op.equalsIgnoreCase("INVESTIMENTO")) {
                ClientesNormal a = listaCliente.get(numeroCliente);/*como apenas os VIPS podem criar
				é precisar criar uma verificaçao para o tipo de cliente

                if (a.getTipoCliente().equalsIgnoreCase("VIP")) {
                    System.out.println("**VIP**");

                } else {
                    System.out.println("O Cliente nao existe!");
                }
            }
        }
*/

        System.out.println("***Criar Conta ***");
        System.out.println("\nIntroduza o numero de Cliente :");
        int numeroCliente = sc.nextInt();
        boolean state = verificaNumCliente(listaCliente, numeroCliente);
        if (state == false) {
            System.out.println("O Cliente não Existe!");
            return;
        }else{
            System.out.println("Que tipo de conta deseja criar ?( 'P' | 'I' (APENAS CLIENTES VIP) )");
            String op = sc.next();
            if(op.equalsIgnoreCase("P")){
                ClientesNormal a =listaCliente.get(numeroCliente);
                new ContaOrdem(a.getnumConta(),numeroCliente,"P",a,op);
            }
        }
    }

    /**
     * Metodo para verificar se ja existe NumeroCliente no ArrayList
     *
     * @param Clientes
     * @param numeroCliente
     * @return state true se ja existir numeroCliente existente
     */
    public static boolean verificaNumCliente(ArrayList<ClientesNormal> Clientes, int numeroCliente) {

        for (ClientesNormal clientes : Clientes) {
            if (clientes.getnumCliente() == numeroCliente) {
                return true; //numero de cliente existe !
            }
        }
        return false; //numero de cliente nao existe !
    }

    public static boolean verificaNumConta(ArrayList<ClientesNormal> Clientes, int numeroConta) {
        state = true; // true = existe
        for (ClientesNormal clientes : Clientes) {
            if (clientes.numConta == numeroConta) {
                // System.out.println("clientes : " + clientes.getnumCliente()); //Eliminar
                // linha
                // System.out.println("numero Cliente :" + numeroCliente); //Eliminar linha
                return state;
            } else {
                state = false;
            }
        }
        return state;
    }

    /***
     * metodo para eliminar os clientes
     */
    public static void desactivaCliente() {
        System.out.println("Tem a certeza que pretende continuar com a opereção (y/n)");
        String op = sc.next();
        if (op.equalsIgnoreCase("y")) {
            System.out.println("Introduza o numero do Cliente");
            int numeroCliente = sc.nextInt();
            listaCliente.remove(procuraPorNumero(listaCliente, numeroCliente));
        } else {
            System.out.println("Operaçao Cancelada !");

        }
    }

    /*
     * nao esta a diferenciar ClientesNormais de ClientesVIPS é notorio quando faço
     * criar nova conta !
     */
    public static ClientesNormal procuraPorNumero(ArrayList<ClientesNormal> listaCliente, int numeroCliente) {
        /*

        for (ClientesNormal clientes : Clientes) {
            if (clientes.getnumCliente() == numeroCliente) {
                System.out.println("clientes : " + clientes.getnumCliente());
                System.out.println("numero Cliente :" + numeroCliente);
                if (clientes.getnumCliente() == numeroCliente) {
                    System.out.println("True");
                } else {
                    System.out.println("false");
                }
                return clientes;
            }
        }
        return null; */

        for (ClientesNormal clientes : listaCliente) {
            if (clientes.getnumCliente() == numeroCliente) {
                System.out.println("clientes : " + clientes.getnumCliente());
                System.out.println("numero Cliente :" + numeroCliente);
                return clientes;
            }
        }
        return null;
    }


    /***
     * metodo para listar os clientes
     */
    public static void criaCliente() {
        String tipoCliente;
        do {
            System.out.println("Quer criar um cliente VIP ?(y/n) ");
            tipoCliente = sc.next();
        } while (!((tipoCliente.equalsIgnoreCase("y")) || (tipoCliente.equalsIgnoreCase("n"))));

        System.out.println("TIPO DE CLIENTE : " + tipoCliente);
        int numCliente;
        boolean v;
        int geraNumeroCliente;
        Random random = new Random();
        do {
            geraNumeroCliente = random.nextInt(4) + 1; //qd for a criar o 5 elemento, o programa ja nao deixa!
            v = verificaNumCliente(listaCliente, geraNumeroCliente);
        } while (v);

        numCliente = geraNumeroCliente;
        System.out.println("Introduza o nome : ");
        String nome = sc.next();
        System.out.println("Introduza o numero telemovel : ");
        int telefone = sc.nextInt();
        System.out.println("Introduza o e-mail : ");
        String email = sc.next();
        System.out.println("Introudza a profissão : ");
        String profissao = sc.next();
        int numConta;
        int geraNumeroConta;
        do {
            geraNumeroConta = random.nextInt(4) + 1;//qd for a criar o 5 elemento, o programa ja nao deixa!
            v = verificaNumConta(listaCliente, geraNumeroConta);
        } while ((v != false));
        numConta = geraNumeroConta;
        System.out.println("Introduza o numero de cartoes ");
        int numCartao = sc.nextInt();
        System.out.println("Introduza o montante inicial ");
        int saldo = sc.nextInt();

        ClientesNormal ClienteNormal = new ClientesNormal(numCliente, nome, telefone, email, profissao, numConta,
                numCartao, saldo);
       //ContaOrdem co = new ContaOrdem(numCliente, numConta,0,"");//ESTA ERRADA ESTA LINHA!!
        if (tipoCliente.equalsIgnoreCase("y")) {
            System.out.println("Cliente VIP");
            GestorConta gc = Maria;
            ClientesVIP ClienteVip = new ClientesVIP(numCliente, nome, telefone, email, profissao, numConta, numCartao,
                    saldo, gc);

            listaCliente.add(ClienteVip); //Adicionar Cliente ao Arraylist VIP
           // listaConta.add(co);
        } else {
            tipoCliente.equalsIgnoreCase("n");
            {
                System.out.println("Cliente Normal");
                listaCliente.add(ClienteNormal);//Adicionar Cliente ao Arraylist Normal
             //   listaConta.add(co);
            }
        }

    }

    /***
     * metodo para listar os clientes
     */
    public static void listaCliente() {
        for (int i = 0; i < listaCliente.size(); i++) {
            System.out.println(listaCliente.get(i).toString());
        }
    }

    public static void editaCliente() {
        String op;
        System.out.println("Que utlizador pretende actualizar dados ? (introduza o index)");
        int indexUtil = sc.nextInt();
        ClientesNormal a = listaCliente.get(indexUtil);
        if (a.TipoCliente.equalsIgnoreCase("Normal")) {

            do {
                System.out.println("Pretende alterar o telefone ? (y/n)");
                op = sc.next();
            } while (!((op.equalsIgnoreCase("y")) || (op.equalsIgnoreCase("n"))));
            if (op.equalsIgnoreCase("y")) {
                System.out.println("Introduza o numero de telefone :");
                int telefone = sc.nextInt();
                a.setTelefone(telefone);
            }

            do {
                System.out.println("Pretende alterar o e-mail ? (y/n)");
                op = sc.next();
            } while (!((op.equalsIgnoreCase("y")) || (op.equalsIgnoreCase("n"))));
            if (op.equalsIgnoreCase("y")) {
                System.out.println("Introduza o email :");
                String email = sc.next();
                a.setEmail(email);
            }

            do {
                System.out.println("Pretende alterar a profissao ? (y/n)");
                op = sc.next();
            } while (!((op.equalsIgnoreCase("y")) || (op.equalsIgnoreCase("n"))));
            if (op.equalsIgnoreCase("y")) {
                System.out.println("Introduza a profissao :");
                String profissao = sc.next();
                a.setProfissao(profissao);
            }
        } else {
            System.out.println("Tratamento VIP");
        }
    }


    public static void main(String[] args) {
        listaCliente.add(ze);
        listaCliente.add(mario);
        listaCliente.add(rs);
        Menu.menu();

    }
}