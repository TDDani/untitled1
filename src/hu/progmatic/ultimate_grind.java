package hu.progmatic;

import java.util.Arrays;
import java.util.Scanner;

public class ultimate_grind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Gyakorlo 1
        /*System.out.println("Adja meg a számot");
        Scanner scanner1 = new Scanner(System.in);
        int szam = scanner.nextInt();
        int ttt = 0;

        while (szam > 0) {
            int szamjegy = szam % 10;
            ttt += szamjegy;
            szam /= 10;
        }

        System.out.println(ttt);

        //Gyakorlo 2 (Rövidebb verziót egyenlőre nem találtam)
        System.out.println("Adja meg a hatványozni kivánt számot");
        int szam2 = scanner.nextInt();
        int nokedli = szam2;
        int macsa = szam2;
        System.out.println("Hanyadikra szeretné emelni?");
        int hanyadik = scanner.nextInt();
        scanner.nextLine();
        int fapad = 0;

        while (hanyadik + 1 > 0) {

            if (fapad % 2 == 0) {
                szam2 *= szam2;
                fapad++;
            }
            hanyadik--;
        }
        if (hanyadik % 2 == 0) {
            System.out.println("A hatvány"+szam2 * nokedli * macsa);
        }else{
            System.out.println("A hatvány" +szam2*nokedli);
        }

        //Gyakorlo 3
        int[] num = {3495, 32556, 888, 5432, 45798, 2334,11, 1, 6, 3, 4, 1135};

        int kicsi = num[0];

        for(int i = 0; i< num.length; i++){
            if(num[i] < kicsi)
                kicsi = num[i];
        }
        System.out.println(kicsi);
        //Gyakorlo 4

        int[] num1 = {3495, 32556, 888, 5432, 45798, 2334,11, 1, 6, 872, 2, 3, 4, 1135};

        int nagy = num[0];

        for (int i = 0; i<num1.length; i++){
            if(num1[i] > nagy)
                nagy = num1[i];
        }
        System.out.println(nagy);
        //Gyakorlo 5 (Nem igazán sikerült)

        int[] numis = {123, 453, 123, 5, 2, 532, 145, 432, 678,};
        String mam = Arrays.toString(numis);

        String[] san = {"123", "453", "123", "5", "2", "532", "145", "4322"};



        System.out.println(mam);*/
        //Gyakorlo 6
        int[] arrayka = {22, 33, 44, 323, 22};
        int t = 0;
        int w = arrayka.length - 1;
        int g = 0;
        for (int i = 0; arrayka.length > i; i++) {

            if (arrayka[t] == arrayka[w]) {
                g++;
            }
            t++;
            w--;
        }
        g /= 2;
        System.out.println(g + " elem egyezik meg");
        if (g == (w / 2)) {
            System.out.println("Ez egy tükörtömb");
        }
    }
}

