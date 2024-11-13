import java.util.Scanner; // Importerar klassen Scanner för att läsa indata från användaren

public class TextReader {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);                                          // Skapar ett Scanner-objekt för att läsa indata från kommandoraden
        TextAnalysMain textAnalysMain = new TextAnalysMain();                              // Skapar ett TextAnalysMain-objekt för analys
        StringBuilder allText = new StringBuilder();                                       // Skapar en StringBuilder för att lagra all text som användaren skriver in
        System.out.println("Skriv in text rad för rad (skriv 'stop' för att avsluta):");   // Meddelande till användaren om hur programmet fungerar


        while (true) {                                                                     // Startar en oändlig loop för att läsa in text rad för rad
            String text = scanner.nextLine();                                              // Läser nästa rad från användaren

            if (!textAnalysMain.processLine(text)) {
                break;                                                                     // Avslutar loopen om "stop" skrivs
            }

            allText.append(text).append(" ");                                              // Lägg till raden och ett mellanslag istället för en ny rad
        }
        System.out.println("Du har skrivit: " + allText.toString().trim());                //Skriva ut resultatet och trimma för att ta bort sista mellanslaget
        System.out.println("Antal tecken (exklusive 'stop'): " + textAnalysMain.getTotalCharacters());
        System.out.println("Antal rader (exklusive 'stop'): " + textAnalysMain.getLineCount());
        System.out.println("Antal ord (exklusive 'stop'): " + textAnalysMain.getWordCount());
        System.out.println("Det längsta ordet: " + textAnalysMain.getLongestWord());       // Nytt: Skriver ut det längsta ordet//Skriver ut antal ord
    }
}




