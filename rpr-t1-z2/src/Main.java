import java.util.Scanner;

public class Main {
    public static int sumaCifara(int x){
        int suma = 0;
        while(x != 0){
            suma += x % 10;
            x /= 10;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n");
        int n;
        n = ulaz.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0)
                System.out.println(i);
        }
    }
}