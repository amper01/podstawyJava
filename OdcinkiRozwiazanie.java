package Jan31;

import java.util.Arrays;

/**
 * Created by PM on 2015-01-31.
 */

class Rozwiazanie {

    boolean czyPokryte(int wielkosc, int[] begin, int[] end) {
       
       //Pytania 
        /*ten element kodu - zmienna typu boolean nazwa "czyPokryte" (i właśnie co i jak się zamieszcza w nawiasie i dlaczego?)
        rozumiem, że są to deklaracje zmiennej int i dwóch tablic intow. - ale dlaczego są zdeklarowane w nawiasie i jaka jest różnica 
        między deklaracją (int wielkość, int[]begin, int[] end) a deklarację 
        
        boolean czyPokryte {
            int wielkość;
            int [] begin, int[]end
            ??
        //....
      */
      
        
        int[] pokrycie = new int[wielkosc];
        /*
        gdzie została określona wartość zmiennej "wielkosc", bo deklaracja zmiennej jest w nawiasie. 
        */
        
        int nOdciknow = begin.length;
        for (int i = 0; i < nOdciknow; i++) {
            for (int at = begin[i]; at <= end[i]; at++) 
            {
                pokrycie[at]++;
            }
            System.out.println(Arrays.toString(pokrycie));
        }
        boolean pokryty = true;
        for (int i = 0; i < wielkosc; i++) {
            if (pokrycie[i]==0) pokryty=false;
        }
        return pokryty;    // Czy można prosić o więcej informacji na temat konstrukcji z returnem???
    }
}


public class Odcinki {
    public static void main(String[] args) {

        Rozwiazanie rozwiazanie = new Rozwiazanie();
        System.out.println(rozwiazanie.czyPokryte(11, new int[]{0,2,3},new int[]{2,3,10}));
        /*a rozumiem, że tutaj deklarujemy wartości zmiennych zdefiniowanych w "metodzie"? 
        Ale skoro tak to dlaczego trzeba na nowo definiowac tablice intów skoro również sa zdefiniowane w metodzie??
        
        */
    }
}
