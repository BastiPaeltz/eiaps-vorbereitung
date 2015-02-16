##Syntax vs. Semantik
###Infos aus dem Skript:
* **Syntax**: Klar festgelegte Repräsentation als ‘Sprache’ durch Angabe von:
• Menge der erlaubten Zeichen
• Welche Kombinationen von Zeichen sind erlaubt und strukturell gültig
--> Formal definierte Syntax der Sprache
  * Beispiele: 
• Programm beginnt mit ‘{‘ und endet mit ‘}’ <br>
• zu jeder öffnenden Klammer gehört eine schließende Klammer <br>
• Programmtext enthält keine Umlaute oder Sonderzeichen <br>

* **Semantik**: Klar festgelegte Interpretation der ‘Sprache’ durch Angabe von <br>
• evtl. notwendigen zusätzlichen Anforderungen an ein syntaktisch korrektes <br>
Programm, und <br>
• der eindeutigen Festlegung der Bedeutung (Semantik) für jedes den
Anforderungen entsprechende Programm. 
  * Beispiele:<br>
• Namen müssen ‘deklariert’ werden bevor sie verwendet werden<br>
• Einer für Zahlen ‘deklarierten’ Variable keine Zeichenkette zuweisbar


###zusätzliche Infos:
* Die **Syntax** bezieht sich auf die Form und die Struktur von Zeichen in einer **Sprache**, ohne auf die Bedeutung der verwendeten 
Zeichen in den Formen und Strukturen einzugehen. Syntaktisch korrekte Ausdrücke werden auch als "wohlgeformt" (well-formed) bezeichnet.
* Die **Semantik** befasst sich mit der Bedeutung syntaktisch korrekter Zeichenfolgen einer **Sprache**. Im Zusammenhang mit Programmiersprachen bedeutet Semantik die Beschreibung des Verhaltens, das mit einer Interpretation (Auslegung) eines syntaktisch korrekten Ausdrucks verbunden ist.


###Kurz zusammengefasst
* *Effektivität und Effizienz* beschäftigte sich mit dem Algorithmus, **Syntax** und **Semantik** sind Eigenschaften einer **Sprache**. 
* **Die Bedeutungen**:
 * **Syntax** ist simpel gesagt, die Eigenschaft, wie eine Sprache "aussieht". Welche Zeichen sie enthält und welche Anordnungen von Zeichen korrekt sind. Also die **Grammatik** einer Sprache.
 * **Semantik** ist die **Bedeutung / Interpretation** dieser Zeichen. 
* Im Zusammenhang mit diesen Begriffen steht der Begriff **Korrektheit**. Mehr dazu in den Beispielen.
 
###konkrete Beispiele:
* Erst einmal ein Beispiel aus einer konkreten Sprache, z.B. Deutsch:
  * Der Satz **"Farblose, grüne Gedanken schlafen nicht."** ist syntaktisch korrekt. Er besitzt ein Subjekt, Prädikat usw., 
  die Semantik jedoch macht absolut **keinen** Sinn, ist also **semantisch nicht korrekt**.
  * Der Satz **"Auto ich haben fahren gestern."** hingegen ist **syntaktisch nicht korrekt**. 

* Auf Programmiersprachen bezogen:
  * Betrachten wir folgenden Java-Code:  
```java
    int i = 0 //Semikolon vergessen!
    
    while(i < 3)  //Klammer vergessen!
      i++;
    }
```
 * Dies sind klare **syntaktische Fehler**, Hingegen:
```java
    int j  = 0;
    j = "ichBinKeineZahl"; 
``` 
  * ... ist syntaktisch erst einmal korrekt, die Semikolons wurden gesetzt, es wurden valide Zeichen verwendet. 
  Jedoch ist es **semantisch nicht korrekt** einem int-Wert einem String zuzuordnen. Hier würde der Compiler einen Error geben.
* Es ist also wichtig zu erkennen, dass die **Syntax** wirklich minimal nur festlegt, welche **Anordnung von Zeichen** korrekt sind und
absolut nichts anderes tut. 

