import java.util.Scanner;

// Aufgabenstellung: s.u.; Einsendeaufgabe CODIH01-XX01-K03 Nr. 2

//TODO Methoden aufspalten?

public class ZahlensystemeUmwandlung {
    public static void main(String[] args) {

        int factor;
        double decimalOutput;
        String textInput = "";
        Scanner scanInput = new Scanner(System.in);

        while (!textInput.equals("0")) {
            decimalOutput = 0;
            factor = 1;

            System.out.print("----------- \n"
                    + "(Binär-Präfix 0b, Oktal-Präfix 0, Hexadezimalzahl-Präfix 0x) \n"
                    + "Zahl eingeben: ");
            textInput = String.valueOf(scanInput.nextLine());


            if ( textInput.startsWith("0b") ) {
                textInput = textInput.substring(2);

                for (int i=0; i < textInput.length(); i++) {
                    //if ( String.valueOf(textInput.charAt(i)).equals("0")
                    //    || String.valueOf(textInput.charAt(i)).equals("1") ) {
                        for (int j = textInput.length()-1 -i; j > 0 ; j--){
                            factor = 2 * factor;
                        }
                        decimalOutput += Double.valueOf(String.valueOf(textInput.charAt(i))) * factor;
                        factor = 1;
                    //}else{
                    //    System.out.println("Fehlermeldung: Falsche Eingabe");
                    //    break;
                    //}
                }
                System.out.println("Binärzahl: 0b" + textInput + "\n"
                        + "Dezimalzahl: " + decimalOutput);


            } else if ( textInput.startsWith("0x") ) {
                System.out.println("Hexadezimalzahl: " + textInput + "\n"
                                + "Dezimalzahl: " + decimalOutput);


            } else if ( textInput.startsWith("0") && !textInput.equals("0") ) {
                textInput = textInput.substring(1);

                for (int i=0; i < textInput.length(); i++) {
                    for (int j = textInput.length()-1 -i; j > 0 ; j--){
                        factor = 8 * factor;
                    }
                    decimalOutput = Double.valueOf(String.valueOf(textInput.charAt(i))) * factor + decimalOutput;
                    factor = 1;
                }
                System.out.println("Oktalzahl: " + textInput + "\n"
                        + "Dezimalzahl: " + decimalOutput);


            } else if ( textInput.equals("0") ) {
                System.out.print("0 ist 0 ist 0." + " "); //siehe Bläck Fööss

            } else {
                System.out.println("Fehlermeldung: Falsche Eingabe");
            }
        }

        System.out.println("Programm beendet. \n -----------");


        //intInput = scanInput.nextInt();
        //System.out.println("" + intInput);
        //System.out.println("" + textInput);
        //System.out.println(String.valueOf(scanInput));


    }
}

/**
 * 2. Erstellen Sie ein Java-Programm, das
 * Binärzahlen (Basis 2), Oktalzahlen (Basis 8) und Hexadezimalzahlen (Basis 16)
 * als Strings von der Konsole einliest und dann den eingelesenen String
 * in eine Integerzahl umwandelt und das Ergebnis als Dezimalzahl auf der Konsole ausgibt.
 * Die Binärzahlen werden dabei mit dem Präfix 0b, die Oktalzahlen mit dem Präfix 0 und
 * die Hexadezimalzahlen mit dem Präfix 0x eingegeben.
 * Die Ziffern 10 bis 15 in Hexadezimalzahlen werden wie üblich mit den Buchstaben 'A' bis 'F' dargestellt.
 * Ist die Eingabe ungültig, dann soll das Programm eine Fehlermeldung auf der Konsole ausgeben.
 * Die Eingabe soll so lange wiederholt werden, bis die Anwenderin, der Anwender den String „0“ eingibt.
 *
 * Nutzen Sie zur Umwandlung nur die Methoden der String-Klasse, die in Abschnitt 4.3.1 behandelt wurden.
 *
 * Abschnitt 4.3.1
 * Zu beachten ist, dass String-Objekte nicht veränderbar sind,
 * die Methoden zur Bearbeitung eines Strings ändern diesen also nicht,
 * sondern erzeugen einen neuen geänderten String, der von der Methode zurückgegeben wird.
 *
 * Tab. 4.3: Methoden der Klasse String
 *
 * charAt(index)
 * gibt das Zeichen an der Position index zurück
 *
 * concat(str)
 * hängt den Übergabestring an den String an
 *
 * contains(str)
 * prüft, ob der String den Übergabestring enthält
 *
 * endsWith(str)
 * vergleicht den Übergabestring mit dem Ende des Strings
 *
 * equals(str)
 * prüft, ob die beiden Strings gleich sind
 *
 * indexOf(v)
 * gibt die erste Position des Zeichens oder Teilstrings zurück
 *
 * lastIndexOf(v)
 * gibt die letzte Position des Zeichens oder Teilstrings zurück
 *
 * length()
 * gibt die Länge des Strings zurück
 *
 * replace(old,new)
 * ersetzt ein Zeichen oder einen Teilstring
 *
 * startsWith(str)
 * vergleicht den Übergabestring mit dem Anfang des Strings
 *
 * substring(start,end)
 * erzeugt einen Teilstring
 *
 * valueOf(v)
 * wandelt einen Wert in einen String um
 */