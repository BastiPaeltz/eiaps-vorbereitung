## Abstrakte Klassen vs. Interfaces

| Eigenschaften  | Interfaces | Abstrakte Klassen |
| ------------- | ------------- | --------------- |
| Konzept  |  Interfaces als **reine Funktionsbeschreibung** des **‘Was’**, die von Klassen explizit implementiert (‘implements’) werden, **Trennen** von Angebot an **Funktionalität** und deren**Realisierung**‘  | Eine Klasse, die mindestens eine abstrakte Methode enthält. Gibt ein wenig Struktur vor, geht also ein wenig über das **'Was'** hinaus. |
| Konstruktor | kein Konstruktor | kann Konstruktor enthalten |
| Methoden | enthält nur Methodenkopf | kann abstrakte Methoden (die nur einen Methodenkopf haben) als auch komplette Methoden enthalten |
| variablen | keine Variablen | kann Variablen enthalten |
| Sichtbarkeit | alles muss <code>public</code> sein | kann private oder public sein |
| INstanzierung | kann nicht instanziert werden | kann nicht instanziert werden |
| Vererbung | Ein Interface, das ein anderes Interface implementiert muss dessen Methoden nicht implementieren. Implementiert eine Klasse ein Interface, verpflichtet sie sich dazu alle seine Methoden zu implementieren. Tut sie dies nicht, muss es eine abstrakte Klasse sein.  | Eine Klasse, die von einer abstrakten Klasse erbt, muss alle abstrakten Methoden implementieren, ansonsten muss sie selbst eine abstrakte Klasse sein | 
| Einbindung mit Schlüsselwort | <code>extends</code> | <code>implements</code>|

###Beispiele in Java:

```java
public interface Dog{ // Interface

public boolean barks(); // alles public, nur Methodenkopf vorhanen
public boolean isGoldenRetriever();
} 


public abstract class geometrischeFigur{	// abstrakte Klasse
  //kann Variablen haben
  private String name;  //public ...
  public int anzahlEcken; //...als auch private 
  
public abstract int getAnzahlEcken(); //sowohl abstrakte ...
private String getName(){   //... als auch "vollständige" Methoden
  return this.name;
  }
} 


//Nun zur Vererbung

//Bsp 1 abstrakte Klasse:
public class Kreis extends geometrischeFigur{ //eine vollwertige Klasse erbt von einer abstrakten Klasse --> 
verpflichtet sich die abstrakten Methoden zu implementieren
  // hier variablen instanzieren usw. ...
  
  //Implementieren der abstrakten Methode:
  public int getAnzahlEcken(){
    return this.anzahlEcken;
  }

}

//Bso 2 abstrakte Klasse:
public abstract class UnterformEinerGeometrischenFigur extends geometrischeFigur{ //eine abstrakte Klasse erbt von einer abstrakten Klasse --> 
muss abstrakte Methoden NICHT implementieren.
  
  public abstract void setRadius(float radius); 
  // da die Klasse abstrakt ist, muss sie nichts implementieren, 
  sondern kann wie hier z.B. eine weitere abstrakte Methode definieren.

}


//Bsp 1 interface:
public class Bello implements Dog{ //eine vollwertige Klasse erbt vom Interface --> 
verpflichtet sich die abstrakten Methoden zu implementieren
  // hier variablen instanzieren usw. ...
  
  //Implementieren der abstrakten Methode:
  public boolean Bark(){
    return true;
  }
  
  public boolean isGoldenRetriever(){
    return false;
  }
}

//Bsp 2 interface:
public interface MeineHunderasse implements Dog{ //eine anderes Interface erbt vom Interface --> 
verpflichtet sich NICHT abstrakten Methoden zu implementieren
  
  //fügt eine ein paar weitere abstrakte Methoden hinzu
  public boolean isAngry();
  public int getHeight();
}

//Bsp 3 interface:
public abstract class MeineAndereHunderasse implements Dog{ //eine abstrakte Klasse erbt vom Interface --> 
verpflichtet sich NICHT die abstrakten Methoden zu implementieren
  
  //fügt eine weitere abstrakte Methoden hinzu, implementiert eine der beiden abstrakten Methoden des Interface:
  public boolean isCute();
  public boolean isGoldenRetriever(){
    return false;
  }
}

```

