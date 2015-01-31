package Jan31;

import java.util.Arrays;

/**
 * Created by PM on 2015-01-31.
 */

class Rozwiazanie {
    boolean czyPokryte(int wielkosc, int[] begin, int[] end) {
        //przedzial rozpatrywany to 0...wielkosc-1; czyli np dla wielkosc=11: [0...10]
        //odcinki zadane sa przez ich punkty koncowe
//        int[] begin = {0, 4, 6, 3};
//        int[] end = {1, 6, 7, 5};
        // tzn. odcinek 0 pokrywa przedzial [begin[0]...end[0]], czyli punkty 0,1,
        // odcinek 1 pokrywa przedial [begin[1]...end[1]] czyli punkty 4,5,6
        //prosze sprawdzic, czy wszystkie punkty 0...10 (brzegi wlaczajac)
        //sa pokryte przez przynajmniej jeden z odcinkow
        int[] pokrycie = new int[wielkosc];
        int nOdciknow = begin.length;
        for (int i = 0; i < nOdciknow; i++) {
            for (int at = begin[i]; at <= end[i]; at++) {
                pokrycie[at]++;
            }
            System.out.println(Arrays.toString(pokrycie));
        }
        boolean pokryty = true;
        for (int i = 0; i < wielkosc; i++) {
            if (pokrycie[i]==0) pokryty=false;
        }
        return pokryty;    ///
    }
}


public class Odcinki {
    public static void main(String[] args) {

        Rozwiazanie rozwiazanie = new Rozwiazanie();
        System.out.println(rozwiazanie.czyPokryte(11, new int[]{0,2,3},new int[]{2,3,10}));
    }
}
