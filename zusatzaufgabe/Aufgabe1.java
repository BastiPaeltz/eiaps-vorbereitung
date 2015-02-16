import java.util.Scanner;
import java.lang.Math;

public class Aufgabe1{

	public static void main (String[] args){
		Scanner user_input = new Scanner( System.in );
		
		System.out.print("Variable a:");
		int a = user_input.nextInt();

		System.out.print("Variable b:");
		int b = user_input.nextInt();
		
		System.out.print("Variable c:");
		int c = user_input.nextInt();

		double nullstellen[] = new double [2];

		double p = b / a;
		double q = c / a;

		double determinante = Math.pow((p/2), 2.0) - q;

		if (determinante < 0){
			System.out.println("Die Fkt. hat keine Nullstellen");
		}
		else{
			if(determinante == 0){
				System.out.println("Die Fkt. hat die Nullstelle " + (-(p/2)));
			}
			else {
				nullstellen[0] = -(p/2) + Math.sqrt(determinante);
				nullstellen[1] = -(p/2) - Math.sqrt(determinante);
				System.out.println("Die Fkt. hat die Nullstellen " + nullstellen[0] + 
					" sowie " + nullstellen[1]);
			}
		}

		System.out.print("Stelle x angeben:");
		double x = user_input.nextDouble();
		double funktionswert = a * Math.pow(x,2) + b * x + c;

		System.out.println("Die Funktion beträgt an dieser Stelle " + funktionswert);	
	}
 }
		