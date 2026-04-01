# ZahlensystemeUmwandlung

> [!NOTE]
> Studienaufgabe zu CODIH01-XX01-K03

```
Erstellen Sie ein Java-Programm, 
das Binärzahlen (Basis 2), Oktalzahlen (Basis 8) und Hexadezimalzahlen (Basis 16) 
als Strings von der Konsole einliest und dann den eingelesenen String in eine Integerzahl 
umwandelt und das Ergebnis als Dezimalzahl auf der Konsole ausgibt. 
Die Binärzahlen werden dabei mit dem Präfix 0b, die Oktalzahlen mit dem Präfix 0 und die 
Hexadezimalzahlen mit dem Präfix 0x eingegeben. Die Ziffern 10 bis 15 in Hexadezimalzahlen 
werden wie üblich mit den Buchstaben 'A' bis 'F' dargestellt. Ist die Eingabe ungültig, 
dann soll das Programm eine Fehlermeldung auf der Konsole ausgeben. Die Eingabe soll so 
lange wiederholt werden, bis die Anwenderin, der Anwender den String „0“ eingibt.

Nutzen Sie zur Umwandlung nur die Methoden der String-Klasse, die in Abschnitt 4.3.1 behandelt wurden.
```
```
charAt(index)
gibt das Zeichen an der Position index zurück

concat(str)
hängt den Übergabestring an den String an

contains(str)
prüft, ob der String den Übergabestring enthält

endsWith(str)
vergleicht den Übergabestring mit dem Ende des Strings

equals(str)
prüft, ob die beiden Strings gleich sind

indexOf(v)
gibt die erste Position des Zeichens oder Teilstrings zurück

lastIndexOf(v)
gibt die letzte Position des Zeichens oder Teilstrings zurück

length()
gibt die Länge des Strings zurück

replace(old,new)
ersetzt ein Zeichen oder einen Teilstring

startsWith(str)
vergleicht den Übergabestring mit dem Anfang des Strings

substring(start,end)
erzeugt einen Teilstring

valueOf(v)
wandelt einen Wert in einen String um
```
(Kohlmüller, N. (2025). Grundlagen der Programmierung. CODIH01, Europäische Fernhochschule Hamburg.)

Zeilenumbrüche zur besseren Lesbarkeit hinzugefügt.