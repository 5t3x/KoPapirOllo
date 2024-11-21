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

        /*-----------KO PAPIR OLLO JATEK-----------*/
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Valassz egyet ezek kozul: KO/PAPIR/OLLO \r\n");
        String jatekosValasztas = sc.nextLine();
        int randomSzam = random.nextInt(3);
        
        String gepValasztas;
        if (randomSzam == 0) {
            gepValasztas = "Ko";
        } else if (randomSzam == 1) {
            gepValasztas = "Papir";
        } else {
            gepValasztas = "Ollo";
        }
        
        System.out.println("A gep ezt valasztotta: " + gepValasztas);
        
        if (jatekosValasztas.equals(gepValasztas)) {
            System.out.println("Dontetlen");
        } else if (jatekosNyer(jatekosValasztas, gepValasztas)) {
            System.out.println("Jatekos nyer");
        } else {
            System.out.println("A gep nyer");
    }
  }
    
    static boolean jatekosNyer(String jatekosValasztas, String gepValasztas) {
        if (jatekosValasztas.equals("Ko")) {
            return gepValasztas.equals("Ollo");
        } else if (jatekosValasztas.equals("Papir")) {
            return gepValasztas.equals("Ko");
        } else {
            return gepValasztas.equals("Papir");
        }
    }
}
