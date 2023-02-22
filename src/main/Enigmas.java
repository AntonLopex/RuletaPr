

package main;

import java.util.ArrayList;


public class Enigmas {

    public static void frases(){
        
         int selPista = (int) (Math.random() * 7 + 0);
        
        ArrayList<String> enigmas = new ArrayList<>();
        
        enigmas.add("La ciudad del amor");
        enigmas.add("El lugar del nunca jamas");
        enigmas.add("El hogar de los libros");
        enigmas.add("El rey de los cielos");
        enigmas.add("La ciudad del jazz");
        enigmas.add("El oro del Amazonas");
        enigmas.add("La cuna de la civilizacion");
        enigmas.add("La ciudad de los rascacielos");
        
       
        
        ArrayList<String> pistas = new ArrayList<>();
        
        pistas.add("Una ciudad famosa por su historia romantica");
        pistas.add("Un lugar imaginario o mitico");
        pistas.add("Un lugar conocido por su rica historia literaria");
        pistas.add("Un animal conocido por su majestuosidad");
        pistas.add("Una ciudad con una gran escena de jazz");
        pistas.add("Un producto o recurso natural valioso");
        pistas.add("Un lugar con una antigua y rica historia");
        pistas.add("Una ciudad conocida por sus edificios altos");
        

        
        System.out.println("La pista es: "+ pistas.get(selPista));
        
        String frase = enigmas.get(selPista);
        
        String panel = frase.replaceAll("[a-zA-Z]", " _ ");
        
        System.out.println(panel);
        
        

    }
    
}



        
        
    
            
    
    

