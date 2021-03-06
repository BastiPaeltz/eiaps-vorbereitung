##Datentyp vs. Datenstruktur
###Infos aus dem Skript:
* **Datentyp**:  Grundlage und Basis jeder Programmiersprache:
  * welche grundlegenden Arten von Werten können gespeichert und
manipuliert werden ?
  * welche Operationen sind auf welchen Arten von Werten erlaubt ?
  * wie können Operationen sinnvoll kombiniert und ausgewertet werden ?
  * wie können (Zwischen-)Ergebnisse gesichert und weiterverwendet werden?
--> <b>Wertebereiche, Deklarationen, Definitionen und Umgebungen</b> 
* **Datentyp:** Spezifikation und Verwendung (‚Was‘)
 * abstrakte Funktionalität steht im Vordergrund
 * Jedes Exemplar eines Typs (Instanz einer Klasse) unterstützt einen
festen Umfang an Funktionalität, d.h. an erlaubten Operationen
 * Grundlage der Überprüfung von Programmen vor dem Ablauf auf
mögliche Fehler

* **Datenstruktur**: Idee: schrittweise komplexere Strukturen aufbauen
  * grundlegende Wertebereiche (**Datentypen**) geordnet zu neuen Wertebereichen kombinieren
  * Strukturen schaffen, die näher am zu lösenden Problem sind
* **Datenstruktur:** Implementierung und Zugriff (‚Wie‘)
 * konkreter, interner Aufbau steht im Vordergrund
 * geeignete Abbildung der gewünschten Funktionalität in ein
Programm in einer Programmiersprache

* **Datentyp:** unabhängig von konkreten Prog.-Sprachen
 * erlaubt die Realisierung in unterschiedlichen Sprachen und
‚Umgebungen‘ wie z.B. Betriebssystemen usw.
 * erlaubt die Kombination von Implementierungen in unterschiedlichen
Programmiersprachen
* **Datenstruktur**: Mittel zur Abbildung 
 * Technik zum ‚Konkretisieren‘ der gewünschten ‚Ideen‘
 * eine ganze Reihe allgemein einsetzbarer Techniken sind mittlerweile
unabhängig von einzelnen Sprachen als sinnvoll identifiziert
 * je nach verwendeter Sprache evtl. aber unterschiedlich ‚nützlich‘
* **Grundlage**: verfügbare Programmier-Sprache
 * grundlegende Wertebereiche: <code>bool, int, float, …, char, String, … </code>

###zusätzliche Infos:
* Das denke ich reicht aus als Information. 
  
###Kurz zusammengefasst
* **Datentypen** sind die grundlegendsten Wertebereiche (z.B. Zahlen) und Operationen, die auf diesen möglich sind. (z.B. Addition).
* **Datenstrukturen** basieren auf Datentypen und wie der Name schon sagt, gibt diesen eine **Struktur**,  benutzen die Datentypen also um selbst wieder Wertebereiche und Operationen zu definieren. (siehe Beispiel)


###konkrete Beispiele:
* Ein konkreter **Datentyp** in Java wäre z.B. **int** / Integer:
  ```
  int zahl = 3;
  ```
  * Diese variable zahl vom Typ **Integer** hat den **Wertebereich** -2147483648 bis +2147483648.
  * Gleichzeitig sind in Java bestimmte **Operatoren** für int definiert, wie z.B. **+, -, /** usw. 
* Eine **Datenstruktur** in Java wäre z.B. das Array:
  * Das Array ist **homogen**, da es nur Daten vom selben **Datentyp** speichert.
  ```java
  int [] myArray = new int [5];
  ```
  * Dieses int-Array **basiert auf dem Datentyp** *Integer* (sowie dessen Operationen).
  * Sein **Wertebereich** umfasst in unserem Beispiel 0 bis 4, unser Array kann bis zu 5 Elemente vom Typ <code>int</code> enthalten.
  * Gleichzeitig definiert das int-Array **Operationen**, die man "auf ihm" ausführen kann, z.B. <code>myArray[0] = 1;</code> 
  oder die Methode <code>sort(myArray)</code>, die das Array sortiert.
  
* Eine weitere **Datenstruktur** in Java ist das Objekt:
  * Es ist **heterogen**, da sie Daten vom unterschiedlichen **Datentyp** speichern kann.
  ```java
  public class Auto{
    int baujahr;
    String marke;
  }
  ``` 
  * Sein Wertebereich umfasst in unserem Beispiel <code>baujahr und marke</code>, 2 Elemente vom Typ <code>int und String</code>
  * Gleichzeitig definiert das Objekt Operationen, die man "auf ihm" ausführen kann, z.B. <code>Auto.baujahr = 1935</code> (sobald man Konstrukltor usw. angelegt hat) 
  



