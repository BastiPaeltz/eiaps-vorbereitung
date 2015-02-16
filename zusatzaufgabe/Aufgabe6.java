import java.lang.Math;

public class Aufgabe6{

	public static void main (String[] args){
		
		boolean straßeGeworfen = false;
		int anzahlWurf = 1;
		int aktuelleZahl;
		int [] zahlenArray = new int [5];
		int anzahlStraßeZahlen = 1;

		while (straßeGeworfen == false){
			System.out.println("Würfelversuch Nummer: " +anzahlWurf);
			for (int i=0; i<5; i++){

				aktuelleZahl = (int) ((Math.random() * 6) + 1);
				System.out.print(aktuelleZahl + " ");
				zahlenArray[i] = aktuelleZahl;

				if(i != 0 && zahlenArray[i]-1 == zahlenArray[i-1]){
					anzahlStraßeZahlen++;
				}
			}

			if(anzahlStraßeZahlen == 5){
				System.out.println("Große Straße!!");
				straßeGeworfen = true;
			}
			else{
				anzahlStraßeZahlen = 1;
				anzahlWurf++;
			}
		}
		System.out.println();
	}
 }
		