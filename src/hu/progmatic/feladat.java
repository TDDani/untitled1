package hu.progmatic;

import java.util.Scanner;



    public class feladat {
        public static void main(String[] args) {

            //Szökőév

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Kérjük adja meg az évet");
        int ev = scanner.nextInt();
        if(ev<1582){
            System.out.println("Ez a szökőév bevezetése előtti adat ");
            return;
        } if(ev % 4 ==0 && ev>1582 && (ev%100 != 0  || ev%400 == 0)) {
            System.out.println("Ez szökőév");
            return;
        } else{
            System.out.println("Ez nem szökőév év");
            return;
        } */

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
        System.out.println(g + " osztója van"); */

            // prím-e a szám
            Scanner scanner = new Scanner(System.in);
            /*System.out.println("Kérem adja meg a számot");
            int num = scanner.nextInt();


            if (num < 0 && (num == 0 || num == 1)) {
                System.out.println("Ez nem prím");
                return;
            } if (num % 2 != 0 || num % 3 != 0 || num % 5 != 0 || num % 7 != 0) {

            System.out.println("Ez prím");
            return;}

            else  {
                System.out.println("Ez nem prím");
                }               */


            // Legnagyobb közös osztó
            int[] szama = new int[2];
            System.out.println("Adjon meg egy számot");
            szama[0] = scanner.nextInt();
            System.out.println("Adjon meg még egy számot");
            szama[1] = scanner.nextInt();
            int ifa = 0;
            ifa = (szama[1] > szama[0]) ? szama[0] : szama[1];
            int g = 0;

           



            int i = 0;

            System.out.println(i);

            for (i = 1; i <= ifa; i++) {
                if (szama[1] % i == 0 && szama[0] % i == 0) {
                    g++;

                    System.out.println(i);


                }

               
                


            }



            System.out.println(g + " darab közös osztójuk van");
            

          
        }
    }



