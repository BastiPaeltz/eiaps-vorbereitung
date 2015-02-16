import java.lang.Math;

public class Aufgabe5{

	public static void main (String[] args){
		
		boolean kniffel = false;
		int anzahlWurf = 1;
		int aktuelleZahl;
		int [] zahlenArray = new int [5];
		int anzahlGleicheAugenzahl = 1;

		while (kniffel == false){
			System.out.println("Würfelversuch Nummer: " +anzahlWurf);
			for (int i=0; i<5; i++){

				aktuelleZahl = (int) ((Math.random() * 6) + 1);
				System.out.print(aktuelleZahl + " ");
				zahlenArray[i] = aktuelleZahl;

				if(i != 0 && zahlenArray[i] == zahlenArray[i-1]){
					anzahlGleicheAugenzahl++;
				}
			}

			if(anzahlGleicheAugenzahl == 5){
				System.out.println("Kniffel!");
				kniffel = true;
			}
			else{
				anzahlGleicheAugenzahl = 1;
				anzahlWurf++;
			}
		}
		System.out.println();
	}
 }
		