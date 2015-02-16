public class Aufgabe4{
    
    public static void main (String[] args){

	char[] text = {'!','o','l','l','a','H'};
	char[] neuerText = new char[text.length];

	for (int i=0; i < text.length; i++){ 
		neuerText[i] = text[text.length-1-i];
		System.out.print(neuerText[i]);
	}
	System.out.println();

	}

}