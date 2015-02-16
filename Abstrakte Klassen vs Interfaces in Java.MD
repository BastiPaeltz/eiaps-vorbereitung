| Eigenschaften  | Interfaces | Abstrakte Klassen |
| ------------- | ------------- | --------------- |
| Konzept  |  Interfaces als **reine Funktionsbeschreibung** des **‘Was’**, die von Klassen explizit implementiert (‘implements’) werden, **Trennen** von Angebot an **Funktionalität** und deren**Realisierung**‘  | Eine Klasse, die mindestens eine abstrakte Methode enthält. Gibt ein wenig Struktur vor, geht also ein wenig über das **'Was'** hinaus. |
| Deklaration |`public interface Dog{ public boolean Barks(); public boolean isGoldenRetriever();} ` |`public abstract class geometrischeFigur{	public abstract float getArea();} `|
| Konstruktor | kein Konstruktor | kann enthalten |
| Methoden | enthält nur Methodenkopf | kann abstrakte Methoden (die nur einen Methodenkopf haben) als auch komplette Methoden enthalten |
| variablen | keine Variablen | kann Variablen enthalten |
| Sichtbarkeit | alles muss <code>public</code> sein | kann private oder public sein |
| INstanzierung | kann nicht instanziert werden | kann nicht instanziert werden |
| Vererbung | Ein Interface, das ein anderes Interface implementiert muss dessen Methoden nicht implementieren. Implementiert eine Klasse ein Interface, verpflichtet sie sich dazu alle seine Methoden zu implementieren. Tut sie dies nicht, muss es eine abstrakte Klasse sein.  | Eine Klasse, die von einer abstrakten Klasse erbt, muss alle abstrakten Methoden implementieren, ansonsten muss sie selbst eine abstrakte Klasse sein | 
| Einbindung mit Schlüsselwort | <code>extends</code> | <code>implements</code>|
