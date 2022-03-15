package hu.progmatic;
import java.util.Arrays;
import java.util.Scanner;

public class grind {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //Gyakorlo 1
        /* System.out.println("Adjon meg 2 számot");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if(num1 == 0|| num2 == 0){
            System.out.println("Nullával nem értelmezzük az osztást");
        }else if(num2>num1){
            System.out.println(num1);

        }else if(num1 != 0 && num2 != 0){
            System.out.println("A két szám hányadosa: "+ (num1/num2));
        } */

        //Gyakorlo 2
        /*System.out.println("Mi a szám?");
        int szam = scanner.nextInt();
        while(szam>0){
            szam --;
            System.out.println(szam);
            break;

        } while(szam<0){
            System.out.println(szam);
            break;

        }

        //Gyakorlo 3
        int szam = scanner.nextInt();
        if(szam==0){
            System.out.println("Nulla");
        }
        else if(szam>0){
            System.out.println("Pozitív");
        } else if(szam<0){
            System.out.println("Negatívvv");
        }
        //Gyakorlo 4
        System.out.println("Mi van előtted?");
        scanner.nextLine();
        String frontbarrier = scanner.nextLine();
        if(frontbarrier.equalsIgnoreCase("piros")){
            System.out.println("Állj meg tetyám");
        }else if(frontbarrier.equalsIgnoreCase("zöld")){
            System.out.println("Mehetsz");
        }else if(frontbarrier.equalsIgnoreCase("sárga")){
            System.out.println("Lassan lassíts");
        }else if(frontbarrier.equalsIgnoreCase("OV")){
            System.out.println("Izomból a pedálra taposs");
        } else {
            System.out.println("Ilyen nincs");

        //Gyakorlo 5
    Scanner scanner = new Scanner(System.in);
        System.out.println("Milyen évszak van?");
    String hónap = scanner.nextLine();

    String évszak = "tél";
    switch (évszak) {
        case "január":
            System.out.println("Tél");
        case "február":
            System.out.println("Tél");
        case "december":
            System.out.println("Tél");
        case "március":
            System.out.println("Tavasz");
        case "április":
            System.out.println("Tavasz");
        case "Május":
            System.out.println("Tavasz");
        case "június":
            System.out.println("Nyár");
        case "július":
            System.out.println("Nyár");
        case "augusztus":
            System.out.println("Nyár");
        case "szeptember":
            System.out.println("Ősz");
        case "október":
            System.out.println("Ősz");
        case "november":
            System.out.println("Ősz");
    }
        System.out.println(évszak);

        //Gyakorlo 6
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány számot adjunk meg?");
        int numnum = scanner.nextInt();
        int i;
        for(i=1; i<numnum; i++){
            System.out.println(i);

        //Gyakorlo 7
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány számot adjunk meg visszafelé?");
        int numnum = scanner.nextInt();
        int i;
        for(i=numnum;0<=numnum; i--){
            System.out.println(numnum);
            numnum--;

        }

        //Gyakorlo 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik szám faktoriálisát adjuk meg?");
        int numnum = scanner.nextInt();
        int i;
        int eredmeny = 1;
        for (i = numnum; 0 < i; i--) {
            eredmeny = i * eredmeny;
            System.out.println(i);


        }System.out.println("A szám faktoriálisa: " + eredmeny);

        //Gyakorlo 9

        Scanner scanner = new Scanner(System.in);
        System.out.println("Az ABC első hány betűjét adjuk meg?");
        int betuszam = scanner.nextInt();
        char[] abc = new char[betuszam];
        abc[0] = 'a';
        abc[1] = 'b';
        abc[2] = 'c';
        abc[3] = 'd';
        int i = betuszam;


        //{'a', 'b', 'c', 'd', 'e', 'f', 'g' ,'h', 'i', 'j', 'k' ,'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't' ,'u' ,'v' ,'w', 'x' ,'y', 'z'};
        int tutu = 0;


        while (i>0) { System.out.println(abc[tutu]);
            tutu++;
            i--;
        } */

        // 10 gyakorlo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány számot szeretne megadni?");
        int szamszam = scanner.nextInt();
        System.out.println("Írja be a számokat");
        int[] szamok = new int[szamszam];
        int mazi = 0;
        while(szamszam>0){
            szamszam--;
            szamok[mazi] = scanner.nextInt();
            mazi++;
        }


        System.out.println(Arrays.toString(szamok));



    }
}

