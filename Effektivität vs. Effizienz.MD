##Effektivität vs. Effizienz
###Infos aus dem Skript:
* **Effektivität:** Elementare Verarbeitungsschritte eines Algorithmus müssen von der zur Verfügung
stehenden Maschine (z.B. Computer) auch ausgeführt werden können.
 * **Definition:** Ein Verarbeitungsschritt heißt effektiv, wenn er im Prinzip von einer
realisierbaren Maschine oder z.B. in endlicher Zeit von einem
Menschen mit Bleistift und Papier unter Befolgung genauer Vorschriften
ausführbar ist.

###zusätzliche Infos:
* Die **Effizienz** eines Algorithmus ist seine Sparsamkeit bezüglich der Rechenzeit und Speicherplatz, die er zur Lösung eines festgelegten Problems beansprucht. Mit steigender Effizienz sinkt die Komplexität eines Algorithmus. Jedoch sind effiziente Algorithmen meist schwerer zu verstehen, da sie oft auf ausgeklügelten Ideen beruhen. **Effiziente Algorithmen sind schnell in der Lösung des entsprechenden Problems.** (Wikipedia)
  
  * **Rechenzeit heißt:** Wie lang braucht der Computer, um den Algorithmus auszuführen?, **Speicherplatz heißt:** Wie viel Speicher nutzt der Algorithmus?
  
###Kurz zusammengefasst
* **Effektivität und Effizienz** sind Eigenschaften eines <a href="http://www.info-wsf.de/index.php/Definition_Algorithmus">**Algorithmus**</a>. 
* **Die Unterschiede:**
 * Effektivität kann man am besten übersetzen mit **Ausfuehrbarkeit** und ist Grundvoraussetzung! **Ohne die Eigenschaft der Effektivität ist ein Algorithmus kein Algorithmus!**
 * Effizienz hingegen ist eine Eigenschaft, die misst, wie gut / effizient ein Algorithmus das vorliegende Problem löst. **Ein ineffizienter Algorithmus ist ein Algorithmus!** Effizienz ist also **keine** Grundvoraussetzung des Algorithmus.
 
###konkrete Beispiele:
* Ein Algorithmus, der <code>alle Stellen von Pi ermittelt, alle Primzahlen berechnet oder durch Null teilt</code> ist **NICHT EFFEKTIV**. Er kann vom Computer nicht ausgeführt werden.
* Betrachten wir folgenden Java-Code:  
```java
    public int berechneSumme (int a, int b){ 
      a = a - 1;    
      a = a + 1;    
      return a + b;    
    }  
```
 * **Dieser Algorithmus ist EFFEKTIV.** Er kann vom Computer ausgeführt werden. Jedoch ist er nicht **EFFIZIENT**, da er sinnloserweise 2 Operationen auf 'a' ausführt. 

* Schwierigeres Bsp. - Betrachten wir einen **Sortier-Algorithmus**, der ein Array nach folgendem Muster sortiert:
 * Er teilt das array in einen vorderen sortierten Teil (der am Anfang leer ist) und einen hinteren unsortierten Teil
 * Dann läuft er von vorn bis hinten durch das Array und fügt jedes Element aus dem unsortierten Teil in den sortierten Teil des Arrays ein, indem ...
 * ... er von vorn bis hinten durch den sortierten Teil läuft und die richtige Position für das Element ermittelt
 * **Dieser Algorithmus ist EFFEKTIV.** Er kann vom Computer ausgeführt werden. Jedoch ist er nicht **EFFIZIENT**. Es gibt deutlich schnellere <a href="http://de.wikipedia.org/wiki/Sortierverfahren">Sortieralgorithmen</a>.  



