import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextAnalysTest {

    @Test

    void testGetTotalCharacters() {
        TextAnalysMain textAnalysMain = new TextAnalysMain();         // Skapar TextAnalysMain-objekt
        textAnalysMain.addLine("Hello");
        textAnalysMain.addLine("World");

        assertEquals(10, textAnalysMain.getTotalCharacters(), "Antalet tecken borde vara 10 när vi har lagt till 'Hello' och 'World'");

    }

    @Test

    void testGetTotalLine() {
        TextAnalysMain textAnalysMain = new TextAnalysMain();
        textAnalysMain.addLine("Här kontrolerar vi");
        textAnalysMain.addLine("hur det fungerar");
        textAnalysMain.addLine("med en metod");

        assertEquals(3, textAnalysMain.getLineCount());

    }

    @Test
    void testEmptyLine() {
        TextAnalysMain textAnalysMain = new TextAnalysMain();
        textAnalysMain.addLine(""); // Lägger till en tom rad

        assertEquals(0, textAnalysMain.getTotalCharacters(), "Tom rad borde inte lägga till några tecken");
        assertEquals(1, textAnalysMain.getLineCount(), "Tom rad borde ändå räknas som en rad");
    }



}
