package main;

import java.util.Scanner;

public class Jugadores {

    public static void jugadores() {
        Scanner teclado = new Scanner(System.in);
        
      

        String[] jugadores = new String[4];
        int selJugador = (int) (Math.random() * 4 + 1);

        for (int i = 0; i < jugadores.length; i++) {

            System.out.println("Introduce o nome do xogador " + i);

            jugadores[i] = teclado.nextLine();

        }

        System.out.println("\nEl jugador que comienza será: " + jugadores[selJugador]);

    }
    private int dinero=0;
    
    public static int  getDinero(int dinero){
        
        return dinero;
        
    }
    public static void setDinero(int dinero){
        
        dinero  = dinero;
        
    }
   
}
