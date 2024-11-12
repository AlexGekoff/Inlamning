import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextAnalysTest {

    @Test

    void testGetTotalCharactersInput() {
        TextAnalysMain textAnalysMain = new TextAnalysMain();         // Skapar TextAnalysMain-objekt
        textAnalysMain.addLine("Hello");
        textAnalysMain.addLine("World");

        assertEquals(10, textAnalysMain.getTotalCharacters(), "Antalet tecken borde vara 10 när vi har lagt till 'Hello' och 'World'");
    }



}
