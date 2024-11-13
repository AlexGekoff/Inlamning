public class TextAnalysMain {
    private int totalCharacters; // För att hålla koll på totalt antal tecken
    private int lineCount; // För att hålla koll på antal rader
    private int wordCount; // Räknar totala antalet ord
    private String longestWord = "";

    // Konstruktor som sätter startvärden
    public TextAnalysMain() {
        this.totalCharacters = 0;
        this.lineCount = 0;

    }

    // Metod för att lägga till en rad och uppdatera analysen
    public void addLine(String line) {
        totalCharacters += line.length(); // Ökar totalt antal tecken med längden av raden
        lineCount++;
        wordCount += countWords(line);
        updateLongestWord(line);// Lägg till antal ord i raden
    }

    // Metod för att räkna antalet ord i en given sträng
    private int countWords(String line) {
        if (line.trim().isEmpty()) {                    // Kontrollera om raden är tom eller endast mellanslag
            return 0;
        }
        return line.trim().split("\\s+").length; // Dela upp raden på blanksteg och räkna orden


    }

    // Metod för att hitta och uppdatera det längsta ordet i en given rad
    private void updateLongestWord(String line) {
        String[] words = line.trim().split("\\s+"); // Dela upp raden i ord
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; // Uppdatera om ett längre ord hittas
            }

        }
    }

    // Hämtar totalt antal tecken
    public int getTotalCharacters() {
        return totalCharacters;
    }

    // Hämtar totalt antal rader
    public int getLineCount() {
        return lineCount;
    }

    // Returnerar totala antalet ord
    public int getWordCount() {
        return wordCount;
    }

    // Returnerar det längsta ordet
    public String getLongestWord() {
        return longestWord;
    }
}

