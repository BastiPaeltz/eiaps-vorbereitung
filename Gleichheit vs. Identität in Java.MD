## Gleichheit vs. Identität

| Eigenschaften  | Gleichheit | identität |
| ------------- | ------------- | --------------- |
| Konzept  |  Gibt es zwei unterschiedliche Instanzen der gleichen Klasse mit gleichen Werten --> **Gleichheit der Objekte**  | Zwei unterschiedliche Namen, die die gleiche Instan zreferenzieren --> **Identität**, da es nur ein Objekt ist! |
| Test auf ... mit | <code>obj1.equals(obj2)</code> | obj1 == obj2 |
| Speicherbereich / Referenz | unterschiedlicher Speicherbereich beider Objekte | selber Speicherbereich beider Objekte |
| Werte | beide Objekte haben die exakt gleichen Werte | beide Objekte haben die exakt gleichen Werte |


###Beispiele in Java:

```java
public class IdentitaetUndGleichheit
{ //Beispiel aus dem Skript:
public static void main(String[] args) {
Kunde k1, k2; k3; // drei Referenzen
k1 = new Kunde();                           // Objekt 1 wird instanziert
k1.name = „Meyer"; k1.vorname = „Bertrand"; // Objekt 1 --> name = Meyer, vorname = Bernd 
k1.identNr = 1;                             // Objekt 1 --> name = Meyer, vorname = Bernd, nr = 1
k2 = new SimpleKunde();                     // Objekt 2 wird instanziert
k2.name = „Meyer"; k2.vorname = „Bertrand"; // Objekt 2 --> name = Meyer, vorname = Bernd --> = Vorname und Name von Objekt 1
k2.identNr = 1;                             // Objekt 2 --> name = Meyer, vorname = Bernd, nr = 1 --> exakte selbe Werte --> Gleichheit mit Objekt 1
// Warum nicht Identität? --> beide Objekte zeigen auf unterschiedliche Bereiche im Speicher --> darum keine Identität
// k1 und K2 sind nicht identisch, aber gleich
k3 = k1;
// ab jetzt sind k1 und k3 identisch
// da sie auf das gleiche Objekt
// im Speicher verweisen, was
// zu einer Alias-Beziehung
// führt
```

