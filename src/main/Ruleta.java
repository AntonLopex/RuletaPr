package main;

public class Ruleta {

    public static void ruleta(int dinero) {

        int rule = (int) (Math.random() * 25 + 1);

        switch (rule) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                System.out.println("Gañas 50€");
                dinero= dinero + 49;
                System.out.println("O teu saldo actual é de: "+dinero);
            }
            case 11, 12, 13, 14, 15, 16 ->{
                System.out.println("Gañas 100€");
                
                dinero= dinero + 99;
                System.out.println("O teu saldo actual é de: "+dinero);
            }
            case 17, 18, 19 ->{
                System.out.println("Gañas 200€");
                dinero= dinero + 199;
                System.out.println("O teu saldo actual é de: "+dinero);
            }
            case 20, 21 ->{
                System.out.println("Gañas 500€");
                dinero= dinero + 499;
                System.out.println("O teu saldo actual é de: "+dinero);
            }
            case 22 ->{
                System.out.println("Gañas 1000€");
                dinero= dinero + 999;
                System.out.println("O teu saldo actual é de: "+dinero);
            }
            case 23 ->
                System.out.println("¡¡¡QUIEBRAA!!!");
            case 24 ->
                System.out.println("¡¡¡PERDES O TURNO!!!");
            case 25 ->
                System.out.println("¡¡¡PERDES A METADE DOS TEUS CARTOS!!!");
            default -> {
            }
        }

    }

}
