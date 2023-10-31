import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        List<Double> lista = new ArrayList<Double>();
        String rijec = null;
        for(;;){
            var temp = ulaz.nextLine();
            if(temp.equals("stop")) break;
            try{
                double broj = Double.parseDouble(temp);
                lista.add(broj);
            }catch(NumberFormatException a){
                System.out.println("Unesite validan broj ili stop");
            }
        }
        double min = lista.get(0);
        double max = lista.get(0);
        double mean = 0;
        for(double x : lista) {
            if(x < min) min = x;
            if(x > max) max = x;
            mean += x;
        }
        mean /= lista.size();
        double temp = 0;
        for(double x : lista){
            temp += Math.pow(x-mean,2);
        }
        temp /= (lista.size()-1);
        temp = Math.sqrt(temp);

        System.out.println("Min je: " + min);
        System.out.println("Max je: " + max);
        System.out.println("Mean je: " + mean);
        System.out.println("Standarna devijacija je: " + temp);
    }
}
