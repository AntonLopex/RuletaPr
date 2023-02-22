package main;

import java.util.Scanner;

public class Menu {

    public static void menu(int dinero) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("\n Escogeuna opción:");

        System.out.print("1.Girar ruleta");
        System.out.print("   ");
        System.out.print("2.Comprar vocal");
        System.out.print("   ");
        System.out.print("3.Resolver el enigma");
        System.out.print("   ");
        System.out.println("4.Usar comodín");
        System.out.print("   ");
        System.out.println("5.Adivinar letra");

        int resposta = teclado.nextInt();

        switch (resposta) {
            case 1 -> {
                
                Ruleta.ruleta(resposta);
            }
            case 2 ->{
                
                  
                if (dinero>=100) {
                    System.out.println("Escoge la vocal que deseas");
                    System.out.println("1.A");
                    System.out.println("2.E");
                    System.out.println("3.I");
                    System.out.println("4.O");
                    System.out.println("5.U");
                    int sel = teclado.nextInt();
                    
                    System.out.println("Escoges la letra " + sel);
                    
                }else{
                    System.err.println("No tienes suficiente dinero, sigue ahorrando");
                }
            }
            case 3 ->{
                
            }
                
            case 4 ->{
                
            }
            
            case 5->{
                
            }
                
            default -> {
                System.err.println("Introduce un numero del 1 al 5");
            }
        }

    }

}
