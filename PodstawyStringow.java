/**
 * Created by PM on 2015-01-24.
 */
public class PodstawyStringow {
    public static void main(String[] args) {
//        String s = "2    83 ms     7 ms     1 ms  153.27.euro-lan.pl [195.178.27.153]";
//        System.out.println(s.indexOf("ms"));
//        String tytul = "Wyzsza Szkola Informatyki".toLowerCase();
//        int pozycja = tytul.indexOf("szkola");
//        if (pozycja>=0) {
//            System.out.println("to jest szkola");
//            System.out.println(tytul.charAt(pozycja));
//            String[] wyrazy = tytul.split(" ");
//            for (int i = 0; i < wyrazy.length; i++) {
//                System.out.println("Wyraz["+i+"] to `" + wyrazy[i] + "`");
//            }
//        }
        //Zadanie: dany jest string w postaci "CSV",
        // okreslajacy pesel,nazwisko,pensja
        //rozdzielic ten string na 3 czesci po `,` i zamienic pensje na liczbe
        //calkowita
        String zBazy = "870215,Xindan,1234";
        String[] tablicaWyrazow = zBazy.split(",");
        System.out.println("Wyraz 2 to:" + tablicaWyrazow[2]);



//        String pensja = "1234";
//        int pensja_i = 0;
//        try {
//            pensja_i = Integer.parseInt(pensja);
//        } catch (NumberFormatException e) {
//            System.out.println("to nie liczba!!");
//        }
//

    }
}
