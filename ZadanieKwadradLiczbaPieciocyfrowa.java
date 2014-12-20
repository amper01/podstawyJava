import java.util.Random;
import java.util.TreeSet;

/**
 * Created by mareckip on 13.12.14.
 */


class NaszaKlasa {
    public int sumaCalosci(int x) {
        int a = 15 - (1 + 3 + x);
        int b = 15 - (3 + 5 + x);
        int c = 15 - (5 + 7 + x);
        int d = 15 - (7 + 1 + x);
        int suma = a + b + c + d + x + (1 + 7 + 5 + 3);
        return suma;
    }
    public void rozwiazanie() {
        for (int x = -10; x < 10; x++) {
            int res = sumaCalosci(x);
            if (res>=31 && res<=34) {
                System.out.println("Dla x=" + x + " suma calosci to:" + res);
            }
        }
    }
}

class ZadanieZLiczbaPieciocyfrowa {
    public void rozwiazanie() {
        int core = 5670;
        for (int a = 1; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                int liczba = 10000 * a + b + core;
                if (liczba % 36 ==0) {
                    System.out.println(liczba);
                }

            }
        }
    }
}


/**
 * todo: dodać do dokumentu
 * todo: dodać zadania
 */

public class Startowa {
    public static void main(String[] args) {
        new NaszaKlasa().rozwiazanie();
//        new ZadanieZLiczbaPieciocyfrowa().rozwiazanie();


//
//        Random rnd = new Random(11);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(rnd.nextInt(100));
//        }
//
//        double wynik = 1;
//        for (int i = 0; i < 20; i++) {
//            wynik *= (100.0 - i) / 100;
//        }
//        System.out.println(1-wynik);
//
//        TreeSet<Integer> ss = new TreeSet<Integer>();
//        ss.add(12);
//        ss.add(15);
//        ss.add(12);
//        System.out.println(ss.size());


    }
}
