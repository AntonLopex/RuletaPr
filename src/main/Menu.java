package main;

import java.util.Scanner;

public class Menu {

    public static void menu() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\n Escolle unha destas opcións tendo en conta que se non tes cartos non poderás comprar vogais.");

        int girarRuleta = 1;
        int compraVogal = 2;
        int resolverEnigma = 3;
        int usoComodin = 4;

        System.out.print("1.Xirar ruleta");
        System.out.print("   ");
        System.out.print("2.Comprar vogal");
        System.out.print("   ");
        System.out.print("3.Resolver o enigma");
        System.out.print("   ");
        System.out.println("4.Usar comodín");

        int resposta = teclado.nextInt();

        switch (resposta) {
            case 1 -> {
                System.out.println("A tua resposta foi Xirar a ruleta");
                Ruleta.ruleta(resposta);
            }
            case 2 ->
                System.out.println("A tua resposta foi comprar unha vogal");
            case 3 ->
                System.out.println("A tua resposta foi resolver o enigma");
            case 4 ->
                System.out.println("A tua resposta foi usar un comodín ");
            default -> {
                System.err.println("Debes introducir un numero do 1 ao 4");
            }
        }

    }

}
