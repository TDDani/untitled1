package hu.progmatic;

import java.util.Scanner;

public class nim {
    public static void main(String[] args) {
        //Nim játék 1.
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Hány gyufa áll rendelkezésre?");
        int gyufaszam = scanner.nextInt();

        while (gyufaszam>0){
            System.out.println("Hány darab gyufát szeretne elvenni?");
            int elvettgyufika = scanner.nextInt();
            gyufaszam -= elvettgyufika;
        }
        System.out.println("Vége a játéknak");*/
        //Nim játék 2.
        /* Scanner scanner1 = new Scanner(System.in);
        System.out.println("Hány gyufával szeretnének játszani?");
        int gyuffszam = scanner1.nextInt();
        int ggg = 0;

        boolean elsojatekos = true;

        while (gyuffszam>0){
            System.out.println("Kérlek az első játékos vegye el a gyufát");
                int elso = scanner.nextInt();
            System.out.println("Kérlek a második játékos vegye el a gyufát");
                int masodik = scanner.nextInt();
            ggg++;
                gyuffszam -=(elso+masodik);
            }
        System.out.println("Elfogyott a gyufa, vége a játéknak");
        if(ggg%2 != 0){
            System.out.println("Az első játékos veszített");
        }else{
        System.out.println("A második játékos veszített");
    }*/
        // Gyakorlo 3

        System.out.println("*KÖSZÖNTJÜK A NIM JÁTÉKBAN*");
        System.out.println("ADJA MEG AZ ELSŐ JÁTÉKOS NEVÉT");
        String name1 = scanner.nextLine();
        System.out.println("ADJA MEG A MÁSODIK JÁTÉKOS NEVÉT");
        String name2 = scanner.nextLine();
        System.out.println("Hány darab gyufával szeretnének játszani?");
        int gyufaszam = scanner.nextInt();
        int ggg = 0;

        while (0 < gyufaszam) {
            System.out.println("Kérlek az első játékos vegye el a gyufát");
            int elso = scanner.nextInt();
            if (elso > 3 || elso < 1) {
                System.out.println("1 ÉS 3 KÖZÖTTI SZÁM KELL " + name1);
                continue;
            }
            System.out.println("Kérlek a második játékos vegye el a gyufát");
            int masodik = scanner.nextInt();
            if (masodik > 3 || masodik < 1) {
                System.out.println("KÉRLEK 1 ÉS 3 KÖZÖTTI SZÁMOT ADJ MEG " + name2);
               continue;
            }
            ggg++;
            gyufaszam -= (elso + masodik);

        }
        System.out.println("Elfogyott a gyufa, vége a játéknak");
        if (ggg % 2 != 0) {
            System.out.println("Az első játékos nyert");
        } else {
            System.out.println("A második játékos nyert");

        }
    }
}

