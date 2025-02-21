package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDetexto = new Scanner(System.in);


        System.out.println(" Escreve o nome do Ninja ");

        String nomeDoNinja = caixaDetexto.nextLine();

        System.out.println(" nome do Ninja é  " + nomeDoNinja);

        System.out.println("Quantos anos tem seu Ninja ?");

        int idadeDoNinja = caixaDetexto.nextInt();

        System.out.println("A idade do seu ninja é " + idadeDoNinja);


        if (idadeDoNinja > 18){
            System.out.println("este ninja é maior de idade e pode se mata");

        }else {
            System.out.println("este ninja é uma bosta");
        }


        caixaDetexto.close();

    }
}
