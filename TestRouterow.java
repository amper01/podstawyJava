import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by PM on 2015-01-24.
 */
class SnifferNetowy {
    public void szukaj() throws Exception{
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("tracert google.pl");
        p.waitFor();
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String linia = "";
        while(true) {
            linia = br.readLine();
            if (linia==null) break;
            System.out.println(linia);
        }
    }
}


public class TestRouterow {
    public static void main(String[] args) throws Exception{
        double[] T = {0.3, 0.6, 4.8, 6.3, 15.1};
        //wyliczyc odleglosci miedzy kolejnymi liczbami; czyli
        //roznice miedzy "nastepnymi" i "poprzednimi" liczbami.
        new SnifferNetowy().szukaj();

    }

}
