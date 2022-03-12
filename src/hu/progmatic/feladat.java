package hu.progmatic;

import java.util.Scanner;

public class feladat {
    public static void main(String[] args) {

        //Szökőév

        Scanner scanner = new Scanner(System.in);
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
        }


    }
}
