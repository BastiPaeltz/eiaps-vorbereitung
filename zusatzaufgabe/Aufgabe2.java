import java.util.Scanner;

public class Aufgabe2{

	public static void main (String[] args){
		Scanner user_input = new Scanner( System.in );
		
		System.out.print("Bitte Zahl eingeben: ");
		long n = user_input.nextLong();
		int counter = 2;

		System.out.print("Die Zahl hat folgende Primzahlen: ");
		while (n > 1){
			if( n % counter == 0){
				System.out.print(counter +" ");
				n /= counter;
			}
			else {
				counter++;
			}
		}
		System.out.println();
	}
 }
		