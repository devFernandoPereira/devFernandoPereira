package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma pessoa");
        System.out.println("1 - Fernando");
        System.out.println("2 - Alessandra");

        int escolhaDoUsuario = scanner.nextInt();
//        System.out.println("voce escolheu o numero " + escolhaDoUsuario);

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Voce escolheu o Fernando o fera ");
                break;

            case 2:
                System.out.println("Voce escolheu a Alessandra a Doida ");
                break;

            default:
                System.out.println("voce é burro ? so tem duas Opções");
        }





        scanner.close();



    }
}
