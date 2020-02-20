import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        int opcao = 0;
        do {
            System.out.println("\n\n### RUMOS - Sistema de GESTAO BANCARIA ###");
            System.out.println("\n                  ==================================");
            System.out.println("                  |     1 - CRIAR UM CLIENTE       |");
            System.out.println("                  |     2 - LISTAR OS CLIENTES     |");
            System.out.println("                  |     3 - OPÇOES DO CLIENTE      |");
            System.out.println("                  |     4 - SELECIONAR UM CARTAO   |");
            System.out.println("                  |     5 - AVANÇAR UM PERIODO     |");
            System.out.println("                  |     0 - Sair                   |");
            System.out.println("                  =================================\n");
            System.out.print("Introudza a opçao  -> ");
            opcao = sc.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    Main.criaCliente();
                    //
                    break;
                case 2:
                    Main.listaCliente();
                    //
                    break;
                case 3:
                    Menu.opccaoCliente();
                    break;
                case 99:
                    Main.metodoTestes();//apagar
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);
    }


    public static void opccaoCliente() {
        int opcao = 0;
        do {
            System.out.println("\n\n### RUMOS - Sistema de GESTAO BANCARIA ###");
            System.out.println("\n                  ==============================================");
            System.out.println("                  |     1-  Desactivar Cliente                   |");
            System.out.println("                  |     2 - Editar os dados do Ciente Normal     |");
            System.out.println("                  |     3 - Criar Conta                          |");
            System.out.println("                  |     5 - Contas                               |");
            System.out.println("                  |     0 - Sair                                 |");
            System.out.println("                  ===============================================\n");
            System.out.print("Introudza a opçao  -> ");
            opcao = sc.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    Main.desactivaCliente();
                    break;
                case 2:
                    Main.editaCliente();
                    break;
                case 3:
                    Main.criaConta(Main.listaCliente, Main.listaConta); // TRATAR
                    break;
                case 5:
                    Menu.Contas();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        } while (opcao != 0);

    }

    public static void Contas() {
        int opcao = 0;
        do {
            System.out.println("\n\n### RUMOS - Sistema de GESTAO BANCARIA ###");
            System.out.println("\n                  ================================");
            System.out.println("                  |     1-  Depositar              |");
            System.out.println("                  |     2 - Levantar               |");
            System.out.println("                  |     3 - Transferir             |");
            System.out.println("                  |     4 - Listar Contas          |");
            System.out.println("                  |     0 - Sair                   |");
            System.out.println("                  =================================\n");
            System.out.print("Introudza a opçao  -> ");
            opcao = sc.nextInt();
            System.out.print("\n");
            switch (opcao) {
                case 1:
                    Main.deposito();
                    break;
                case 2:
                    Main.levantamento();
                    break;
                case 3:
                    Main.transferencia();
                    break;
                case 4:
                    break;
                case 0:
                    Main.listaConta(Main.listaConta);
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        } while (opcao != 0);

    }
}