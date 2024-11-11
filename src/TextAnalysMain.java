public class TextAnalysMain {
    private int totalCharacters; // För att hålla koll på totalt antal tecken
    private int lineCount; // För att hålla koll på antal rader

    // Konstruktor som sätter startvärden
    public TextAnalysMain() {
        this.totalCharacters = 0;
        this.lineCount = 0;
    }

    // Metod för att lägga till en rad och uppdatera analysen
    public void addLine(String line) {
        totalCharacters += line.length(); // Ökar totalt antal tecken med längden av raden
        lineCount++; // Ökar antal rader med 1
    }

    // Hämtar totalt antal tecken
    public int getTotalCharacters() {
        return totalCharacters;
    }

    // Hämtar totalt antal rader
    public int getLineCount() {
        return lineCount;
    }
}

