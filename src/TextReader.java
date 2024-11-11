import java.util.Scanner; // Importerar klassen Scanner för att läsa indata från användaren

public class TextReader {
    public static void main(String[] args) {

        // Skapar ett Scanner-objekt för att läsa indata från kommandoraden
        Scanner scanner = new Scanner(System.in);

        // Skapar en StringBuilder för att lagra all text som användaren skriver in
        StringBuilder allText = new StringBuilder();

        // Meddelande till användaren om hur programmet fungerar
        System.out.println("Skriv in text rad för rad (skriv 'stop' för att avsluta):");

        // Startar en oändlig loop för att läsa in text rad för rad
        while (true) {

            // Läser nästa rad från användaren
            String text = scanner.nextLine();

            // Kontrollerar om användaren har skrivit "stop" (oavsett stora eller små bokstäver)
            if (text.equalsIgnoreCase("stop")) {
                break; // Avslutar loopen om "stop" skrivs
            }

            // Lägg till raden och ett mellanslag istället för en ny rad
            allText.append(text).append(" ");
        }
            //Skriva ut resultatet och trimma för att ta bort sista mellanslaget
        System.out.println("Du har skrivit: " + allText.toString().trim());

    }
}




