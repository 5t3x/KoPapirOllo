package jatek;

import java.util.Random;
import java.util.Scanner;

public class KoPapirOllo {
    
    public static void main(String[] args) {
//        /* kerdes amire varjuk a valaszt */
//        System.out.println("egesz");
//        /* eltaroljuk megfelelo tipusban */
//        int egesz = sc.nextInt();
//        /* bekeres eredmenyeinek felhasznalasa */
//        System.out.println("A bekert szam duplaja: " + egesz*2);
//        
//        /*csak akkor kell ha szam utan szoveget kerunk
//        mert a szam utani enter (\r\n) ott marad, ezt olvassa
//        ki.
//        */
//        sc.nextLine();
//        
//        /* kerdes amire varjuk a valaszt */
//        System.out.println("Szoveg");
//        /* eltaroljuk megfelelo tipusban */
//        String szoveg = sc.nextLine();
//        /* bekeres eredmenyeinek felhasznalasa */
//        System.out.println("A bekert szoveg: " + szoveg);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Valassz egyet: (ko/papir/ollo)");
        String valasztas = sc.nextLine();
        int randomSzam = random.nextInt(3);
        
        String gepValasztas;
        if (randomSzam == 0) {
            gepValasztas = "ko";
        } else if (randomSzam == 1) {
            gepValasztas = "papir";
        } else {
            gepValasztas = "ollo";
        }
        
        System.out.println("A gep ezt valasztotta: " + gepValasztas);
        
        if (valasztas.equals(gepValasztas)) {
            System.out.println("Dontetlen");
        } else if (jatekosNyer(valasztas, gepValasztas)) {
            System.out.println("Jatekos nyer");
        } else {
            System.out.println("A gep nyer");
    }
    }
    static boolean jatekosNyer(String valasztas, String gepValasztas) {
        if (valasztas.equals("ko")) {
            return gepValasztas.equals("ollo");
        } else if (valasztas.equals("papir")) {
            return gepValasztas.equals("ko");
        } else {
            return gepValasztas.equals("papir");
    }
}
}
