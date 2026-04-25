import java.util.Scanner;

public class ZahlensystemeUmwandlung {
    public static void main(String[] args) {

        boolean isInputValid;
        int factor;
        int output;
        String textInput = "";
        Scanner scanInput = new Scanner(System.in);

        while (!textInput.equals("0")) {
            output = 0;
            isInputValid = true;

            System.out.print("----------- \n"
                    + "0 zum Beenden eingeben. \n"
                    + "(Binär-Präfix 0b, Oktal-Präfix 0, Hexadezimalzahl-Präfix 0x) \n"
                    + "Zahl eingeben: ");
            textInput = String.valueOf(scanInput.nextLine());


            if (textInput.startsWith("0b")) {
                textInput = textInput.substring(2);

                for (int i = 0; i < textInput.length(); i++) {

                    char c = textInput.charAt(i);
                    if (c != '0' && c != '1') {
                        isInputValid = false;
                        break;
                    }

                    factor = 1;
                    for (int j = textInput.length() - 1 - i; j > 0; j--) {
                        factor = 2 * factor;
                    }
                    output += Integer.valueOf(String.valueOf(textInput.charAt(i))) * factor;
                }

                if (isInputValid) {
                    System.out.println("Binärzahl: 0b" + textInput + "\n"
                            + "Dezimalzahl: " + output);
                } else {
                    System.out.println("Fehlermeldung: Falsche Eingabe");
                }


            } else if (textInput.startsWith("0x")) {
                textInput = textInput.substring(2);

                for (int i = 0; i < textInput.length(); i++) {

                    char c = textInput.charAt(i);
                    int placevalue;
                    if (c >= '0' && c <= '9') {
                        placevalue = c - '0';
                    } else if (c >= 'A' && c <= 'F') {
                        placevalue = c - 'A' + 10;
                    } else {
                        isInputValid = false;
                        break;
                    }

                    factor = 1;
                    for (int j = textInput.length() - 1 - i; j > 0; j--) {
                        factor = 16 * factor;
                    }
                    output += placevalue * factor;
                }

                if (isInputValid) {
                    System.out.println("Hexadezimalzahl: 0x" + textInput + "\n"
                            + "Dezimalzahl: " + output);
                } else {
                    System.out.println("Fehlermeldung: Falsche Eingabe");
                }


            } else if (textInput.startsWith("0") && !textInput.equals("0")) {
                textInput = textInput.substring(1);

                for (int i = 0; i < textInput.length(); i++) {

                    char c = textInput.charAt(i);
                    if (c < '0' || c > '7') {
                        isInputValid = false;
                        break;
                    }

                    factor = 1;
                    for (int j = textInput.length() - 1 - i; j > 0; j--) {
                        factor = 8 * factor;
                    }
                    output = Integer.valueOf(String.valueOf(textInput.charAt(i))) * factor + output;
                }

                if (isInputValid) {
                    System.out.println("Oktalzahl: " + textInput + "\n"
                            + "Dezimalzahl: " + output);
                } else {
                    System.out.println("Fehlermeldung: Falsche Eingabe");
                }



            } else if (textInput.equals("0")) {
                System.out.print("0 ist 0 ist 0." + " "); //siehe Bläck Fööss

            } else {
                System.out.println("Fehlermeldung: Falsche Eingabe");
            }
        }

        System.out.println("Programm beendet. \n -----------");
    }
}