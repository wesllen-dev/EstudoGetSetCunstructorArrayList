import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<func> listaFuncionarios = new ArrayList<>();
        func func = new func();
         while (true) {
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Listar Funcionarios");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando Funcionario:");
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Setor: ");
                    String setor = scanner.next();
                    System.out.print("Email: ");
                    String email = scanner.next();
                    System.out.print("Empresa: ");
                    String empresa = scanner.next();
                    func.setNome(nome);
                    func.setIdade(idade);
                    func.setSetor(setor);
                    func.setEmail(email);
                    func.setEmpresa(empresa);
                    cadastrarFuncionario(listaFuncionarios);
                    System.out.println("Funcionario cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Listando Funcionarios:");
                    System.out.println(func);
                    func.listFuncionarios(listaFuncionarios);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                cadastrarFuncionario(listaFuncionarios);
            case 2:
                System.out.println("Listando Funcionarios:");
                listFuncionarios(listaFuncionarios);
            case 3:
                System.out.println("Saindo...");
            default:
                System.out.println("Opção inválida!");
        }

        listaFuncionarios.add(func);
        func.add(listaFuncionarios);

        System.out.println();

    }

    private static void listFuncionarios(ArrayList<func> listaFuncionarios) {
    }

    private static void cadastrarFuncionario(ArrayList<func> listaFuncionarios) {
    }
}