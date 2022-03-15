package hu.progmatic;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class gyakorlo_2 {
    public static void main(String[] args) {
        //Gyakolro 1
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("*KÖSZÖNTÜNK A MEDVE KOMBATBAN*");
        System.out.println("Adja meg kérem a medvéje nevét");
        String name = scanner.nextLine();
        int eletpont = random.nextInt(75);
        System.out.println("Az ön medvéjének az életpontja: " + eletpont);
        System.out.println();
        int ero = random.nextInt(75);
        System.out.println("Az ön medvéjének ereje: " + ero);
        int Randomeletpont2 = random.nextInt(75);
        int Randomero2 = random.nextInt(75);

        int osszero = eletpont + ero;
        int osszero2 = Randomeletpont2 + Randomero2;

        System.out.println("*Megkezdődött a savas eső*");
        System.out.println("Ez 20 pontot vesz el a medvédtől");
        osszero -= 20;
        osszero2 -= 20;
        if (osszero > 0 && osszero2 < 0) {
            System.out.println("Gratulálok a te medvéd" + name + "nyert!!!");
        } else if (osszero < 0 && osszero2 > 0) {
            System.out.println("Sajnos" + name + "elpusztult");
        } else {
            System.out.println("Mindkét medve életben maradt");
            System.out.println();
            System.out.println(name + "életereje: " + osszero);
            System.out.println();
            System.out.println("Az ellenséges medve életereje: " + osszero2);
        }

        System.out.println("*AJJAJJ* mi ez a dörgetés? Jajj ne egy T-rex");
        int trexsebzes = random.nextInt(50);
        System.out.println();
        System.out.println("A t-rex mindkét medvébe: " + trexsebzes + "-t sebez");
        osszero -= trexsebzes;
        osszero2 -= trexsebzes;

        if (osszero > 0 && osszero2 < 0) {
            System.out.println("Gratulálok a te medvéd " + name + " nyert!!!, a másik medve elpusztult");
            return;
        } else if (osszero < 0 && osszero2 > 0) {
            System.out.println("Sajnos " + name + "t megölte a trex");
            return;
        } else {
            System.out.println("Mindkét medve életben maradt");
            System.out.println(name + "életereje: " + osszero);
            System.out.println("Az ellenséges medve életereje: " + osszero2);

        }
        System.out.println("Vadászok kezdtek el lőni a medvékre (körönként 2-őt sebeznek)");

        while (osszero > 0 && osszero2 > 0) {
            System.out.println("JAJJ NE LŐNEK");
            osszero -= 2;
            osszero2 -= 2;
        }
        if (osszero > 0 && osszero2 < 0) {
            System.out.println("Gratulálok a te medvéd " + name + " nyert!!!, a másik medvét lelőtték");
            return;
        } else if (osszero < 0 && osszero2 > 0) {
            System.out.println("Sajnos " + name + "t megölte az egyik vadász");
            return;
        } */

        //Gyakorlo 2
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Kérjük adja meg az évet");
        int ev = scanner.nextInt();
        if (ev < 1582) {
            System.out.println("Ez a szökőév bevezetése előtti adat ");
            return;
        }
        if (ev % 4 == 0 && ev > 1582 && (ev % 100 != 0 || ev % 400 == 0)) {
            System.out.println("Ez szökőév");
            return;
        } else {
            System.out.println("Ez nem szökőév év");
            return;
        } */
        //Gyakorlo 3
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a számot");
        int szam = scanner.nextInt();
        int i = 0;
        int g = 0;
        for(i = 1; i<=szam; i++) {
            if ((szam % i) == 0) {
                System.out.println(i);
                g++;
            }

        }
        System.out.println(g + " osztója van");
        //Gyakorlo 4
        char[] karakterek ={'1', '2', '3', '4'};
        int elsoelem = karakterek[0];
        int lastelement = karakterek.length-1;

        if(karakterek.length>1){
            elsoelem = lastelement;
            lastelement = elsoelem;*/
        //Gyakorlo 5
        /*int[] szamok = {5, -41, -44, 57};

        int lololo = szamok[1];

        if(szamok.length > 1){
            if(szamok[0]>szamok[1]){
                szamok[0] = lololo;
                szamok[1] = szamok[0];
                }

        }*/
        //Gyakorlo 6
        /* int[] samikak = {11, 33, 44, 55, 66, 432};
        int plusszam = 14;

        int[] moneymaker = {11, 33, 44, 55, 66, 432, plusszam};

        System.out.println(Arrays.toString(moneymaker));

        //Gyakorlo 7 (Kicsit fapadosabb megoldás)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy számot");
        int szam = scanner.nextInt();

        boolean prím = (szam >= 2);

        for (int i = 2; i <= Math.sqrt(szam); i++) {
            if (szam % i == 0) {
                prím = false;
                break;
            }
        }
        if(prím==false){
            System.out.println(szam + " nem prím");
        } else if(prím==true){
            System.out.println(szam + " prím");
        }
         */

        //Gyakorlo 8
        Scanner scanner = new Scanner(System.in);

        int[] szama = new int[2];
        System.out.println("Adjon meg egy számot");
        szama[0] = scanner.nextInt();
        System.out.println("Adjon meg még egy számot");
        szama[1] = scanner.nextInt();
        int ifa = 0;
        ifa = (szama[1] > szama[0]) ? szama[0] : szama[1];
        int g = 0;
        int nembirom = 0;




        int i = 0;

        System.out.println(i);

        for (i = 1; i <= ifa; i++) {
            if (szama[1] % i == 0 && szama[0] % i == 0) {
                g++;
                nembirom = i;

                System.out.println(i);


            }
        }
        System.out.println("A legnagyobb közös osztó: " + nembirom);





        System.out.println(g + " darab közös osztójuk van");



            }
        }








