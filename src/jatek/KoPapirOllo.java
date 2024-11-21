package jatek;

import java.util.Scanner;

public class KoPapirOllo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* kerdes amire varjuk a valaszt */
        System.out.println("egesz");
        /* eltaroljuk megfelelo tipusban */
        int egesz = sc.nextInt();
        /* bekeres eredmenyeinek felhasznalasa */
        System.out.println("A bekert szam duplaja: " + egesz*2);
        
        /*csak akkor kell ha szam utan szoveget kerunk
        mert a szam utani enter (\r\n) ott marad, ezt olvassa
        ki.
        */
        sc.nextLine();
        
        /* kerdes amire varjuk a valaszt */
        System.out.println("Szoveg");
        /* eltaroljuk megfelelo tipusban */
        String szoveg = sc.nextLine();
        /* bekeres eredmenyeinek felhasznalasa */
        System.out.println("A bekert szoveg: " + szoveg);
    }
    
}
