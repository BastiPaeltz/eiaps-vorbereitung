# eiaps-vorbereitung
Vorbereitung auf EiAPS :D

##Information vs Repräsentation  
###Infos aus dem Skript:
* Maschine verarbeitet nicht Information an sich, sondern immer nur 
eine der Maschine zugängliche Repräsentation dieser Information!
* **Beispiel Baum**: gleiche Information(Ding mit Blättern undso), verschiedene Repräsentationen('tree','Baum', 'arbor' usw.)
* Information ist die abstrakte Bedeutung von Ausdrücken, Graphiken,
Darstellungen, Anweisungen und Aussagen.
* Information ist unabhängig von der Frage, wie sie dargestellt wird
und ob sie auf einen realen Sachverhalt Bezug nimmt.
* **Definition:** **Information** bezeichnet den abstrakten Gehalt ("Bedeutungsinhalt",
"Semantik") eines Dokuments, einer Aussage, Beschreibung,
Anweisung, Nachricht oder Mitteilung. Die äußere Form der
Darstellung heißt **Repräsentation** (konkrete Form der Nachricht).
Interpretation bezeichnet den (häufig nur gedanklichen) Übergang
von der Repräsentation zur abstrakten Information, d.h. die Deutung
der Repräsentation.
* Darstellungen, Nachrichten, Beschreibungen sind konkret und
stellen Versuche dar, Information auf eine Art zu repräsentieren,
dass die Information aus der Repräsentation auch erkennbar wird:
Die Repräsentation wird als Information interpretiert.

###zusätzliche Infos:
* Ich denke das ist genug. 

###Kurz zusammengefasst:
* Information ist die **Bedeutung**, diese Bedeutung muss nun dargestellt werden, damit sie für den Adressaten, 
also z.B. den Menschen oder eben den Computer verständlich ist. Diese **Darstellung** (oder Deutung) der Information
nennt man Repräsentation. 

###konkrete Beispiele:
* Die **Information** <code>etwas hat den Wert/die Anzahl 3, z.B. **Bier**</code> wird für uns Menschen in den verschiedenen Sprachen als z.B. <code>3, III, three, drei</code> usw. **repräsentiert**.
  * Bezogen auf die Sprache Java wäre die Repräsentation <code>bier=3;</code>.
  * Diese Art der Repräsentation versteht nur der Mensch, der Computer versteht aber nur 0 und 1. 
  Also wäre die Repräsentation für den PC  z.B. <code>011</code>.

* Die **Information** <code>Gewinn eines Unternehmens im Jahr (pro Monat)</code> kann man z.B. als <code>Diagramm, Tabelle usw.</code> *repräsentieren*.



##Effektivität vs. Effizienz
###Infos aus dem Skript:
* **Effektivität:** Elementare Verarbeitungsschritte eines Algorithmus müssen von der zur Verfügung
stehenden Maschine (z.B. Computer) auch ausgeführt werden können.
 * **Definition:** Ein Verarbeitungsschritt heißt effektiv, wenn er im Prinzip von einer
realisierbaren Maschine oder z.B. in endlicher Zeit von einem
Menschen mit Bleistift und Papier unter Befolgung genauer Vorschriften
ausführbar ist.

###zusätzliche Infos:
* Die Effizienz eines Algorithmus ist seine Sparsamkeit bezüglich der Rechenzeit und Speicherplatz, die er zur Lösung eines festgelegten Problems beansprucht. Mit steigender Effizienz sinkt die Komplexität eines Algorithmus. Jedoch sind effiziente Algorithmen meist schwerer zu verstehen, da sie oft auf ausgeklügelten Ideen beruhen. Effiziente Algorithmen sind schnell in der Lösung des entsprechenden Problems. (Wikipedia)
*  * Rechenzeit: Wie lang braucht der Computer, um den Algorithmus auszuführen, Speicherplatz: Wie viel Speicher nutzt der Algorithmus?
  
###Kurz zusammengefasst
* Ging es bei Information vs. Repräsentation um etwas sehr Grundlegendes(Abstraktes), sind **Effektivität und Effizienz** Eigenschaften eines <a href="http://www.info-wsf.de/index.php/Definition_Algorithmus">**Algorithmus**</a>. 
* **Die Unterschiede:**
 * Effektivität kann man am besten übersetzen mit **Ausfuehrbarkeit** und ist Grundvoraussetzung! **Ohne die Eigenschaft der Effektivität ist ein Algorithmus kein Algorithmus!**
 * Effizienz hingegen ist eine Eigenschaft, die misst, wie gut / effizient ein Algorithmus das vorliegende Problem löst. **Ein ineffizienter Algorithmus ist ein Algorithmus!** Effizienz ist also **keine** Grundvoraussetzung des Algorithmus.
 
###konkrete Beispiele:
* Ein Algorithmus, der <code>alle Stellen von Pi berechnet, alle Primzahlen berechnet oder durch Null teilt</code> ist **NICHT EFFEKTIV**. Er kann vom Computer nicht ausgeführt werden.
* Betrachten wir folgenden Java-Code:
<code> public int berechneSumme (int a, int b){ <br> 
  a = a - 1;  <br>
  a = a + 1;  <br>
  return a + b;  <br>
}  
</code>
 * **Dieser Algorithmus ist EFFEKTIV.** Er kann vom Computer ausgeführt werden. Jedoch ist er nicht **EFFIZIENT**, da er sinnloserweise 2 Operationen auf 'a' ausführt. 

* Schwierigeres Bsp. - Betrachten wir einen Sortier-Algorithmus, der ein Array nach folgendem Muster sortiert:
 * Er teilt das array in einen vorderen sortierten Teil (der am Anfang leer ist) und einen hinteren unsortierten Teil
 * Dann läuft er von vorn bis hinten durch das Array und fügt jedes Element in den sortierten Teil des Arrays ein, indem ...
 * ... er von vorn bis hinten durch den sortierten Teil läuft und die richtige Position für das Element ermittelt
 * **Dieser Algorithmus ist EFFEKTIV.** Er kann vom Computer ausgeführt werden. Jedoch ist er nicht **EFFIZIENT**. Es gibt deutlich schnellere <a href="http://de.wikipedia.org/wiki/Sortierverfahren">Sortieralgorithmen</a>.  



