import java.util.Random;
import java.util.TreeSet;

/**
 * Created by mareckip on 13.12.14.
 */



class ZadanieZNawiasami {
    /**
     * Zadanie: dany jest napis typu "(()()()))((())()";
     * sprawdzić, czy nawiasy w nim są dobrze poukładane, tzn.
     * czy dla każdego otwartego nawiasu '(' istnieje odpowiednio
     * go zamykający nawias ')'.
     */
    public void rozwiazanie() {
        String napis = "(((())))";        //odpowiedź: zły
        napis.charAt(7);        //znak na pozycji 7 w tym stringu;
        napis.length();         //liczba znakow w stringu
//        int otwartychNawiasow = 0;
//        for (int poz = 0; poz < /*długość napisu*/; poz++) {
//            //jesli na pozycji poz w napis jest '(' to otwartychNawiasow++
//            //jesli na pozycji jest ')' to otwartychNawiasow--
//            //trzeba sprawdzic, czy czasem nie bedzie otwartychNawiasow<0
//        }
//        //tu trzeba sprawdzic, czy otwartychNawiasow==0
//
        //jesteśmy na pozycji "pp=4", zadanie: znaleźć nawias domykający
        // ten na pozycji pp
        int pp = 0;
        int dx;
        if (napis.charAt(pp)=='(') dx = 1;
        else dx = -1;
        int bilans=dx; //czyli 1 dla ( oraz -1 dla )
        for(int poz=pp+dx; poz>=0 && poz<napis.length(); poz+=dx) {
            if (napis.charAt(poz)=='(') bilans++;
            else bilans--;
            if (bilans==0) {
                System.out.println("nawias domknięty na pozycji " + poz);
                break;
            }
        }
        pierwszy:
        for (int i = 0; i < 100; i++) {
            drugi:
            for (int j = 0; j < 200; j++) {
                if (i+j % 7 ==0) break drugi;
                if (i+j % 13==0) break pierwszy;
            }
        }

    }
}


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
