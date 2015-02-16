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
```

