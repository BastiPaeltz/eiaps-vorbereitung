import java.util.Scanner;

public class Aufgabe3{

	public static void main (String[] args){
		Scanner user_input = new Scanner( System.in );
		
		System.out.print("Bitte Größe des Arrays eingeben: ");
		int laenge = user_input.nextInt();

		int zahlenArray[] = new int [laenge];
		boolean booleanArray[] = new boolean[laenge];

		for (int i=0; i<laenge;i++){
			System.out.print("Bitte element eingeben: ");
			zahlenArray[i] = user_input.nextInt();

			if (zahlenArray[i] % 3 == 0){
				booleanArray[i] = true;
			}
			else{
				booleanArray[i] = false;				
			}
		}
		
		for (int i=0; i<laenge;i++){
			System.out.println("Das element ist durch 3 teilbar?: " + booleanArray[i]);
		}
		System.out.println();
	}
 }