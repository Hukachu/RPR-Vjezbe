import java.util.Scanner;
public class T1_Z1 {
	public static void main(String[] args){
		int a,b;
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		a = ulaz.nextInt();
		System.out.println("Unesite drugi broj: ");
		b = ulaz.nextInt();
		System.out.println("Unijeli ste dva broja " + a + " i " + b); 
	}
}