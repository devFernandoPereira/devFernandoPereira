package SistemaDeCadastroDeNinjas;

import java.util.Scanner;

public class CadastroDoNovoNinja {
    public static void main(String[] args) {
        Scanner cadastroNovoNinja = new Scanner(System.in);
        int maximoDeCadastro = 3;
        String[] ninjas = new String[maximoDeCadastro];
        int ninjasCadastrados = 0;
        int opcoesQueUsuarioEscolheu = 0; // quebra de linha se nao da loop infinito

        while (opcoesQueUsuarioEscolheu != 4) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Excluir Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcoesQueUsuarioEscolheu = cadastroNovoNinja.nextInt();
            cadastroNovoNinja.nextLine();// s

            switch (opcoesQueUsuarioEscolheu) {
                case 1:
                    if (ninjasCadastrados < maximoDeCadastro) {
                        System.out.print("Digite o nome do Novo Ninja: ");
                        ninjas[ninjasCadastrados] = cadastroNovoNinja.nextLine();
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Lista lotada! Não é possível cadastrar mais ninjas.");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Não existem ninjas cadastrados.");
                    } else {
                        System.out.println("Lista de Ninjas:");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;

                case 3:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Não há ninjas para excluir.");
                    } else {
                        System.out.println("Lista de Ninjas:");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }

                        System.out.print("Digite o número do Ninja que deseja excluir: ");
                        int excluirIndex = cadastroNovoNinja.nextInt();
                        cadastroNovoNinja.nextLine();

                        if (excluirIndex < 1 || excluirIndex > ninjasCadastrados) {
                            System.out.println("Número inválido!");
                        } else {
                            for (int i = excluirIndex - 1; i < ninjasCadastrados - 1; i++) {
                                ninjas[i] = ninjas[i + 1];
                            }
                            ninjas[ninjasCadastrados - 1] = null;
                            ninjasCadastrados--;
                            System.out.println("Ninja excluído com sucesso!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        cadastroNovoNinja.close();
    }
}
