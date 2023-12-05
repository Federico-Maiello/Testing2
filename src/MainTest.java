import org.junit.jupiter.api.Test;

import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main main = new Main();
    String dateString = "2002-03-01T13:00:00Z";
    java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);


    @Test
    void formatFull() {
        String risultato = main.formatter(FormatStyle.FULL, offsetDateTime);
        assertEquals("venerdì 1 marzo 2002", risultato);
    }

    @Test
    void formatMedium() {
        String risultato = main.formatter(FormatStyle.MEDIUM, offsetDateTime);
        assertEquals("1 mar 2002", risultato);
    }

    @Test
    void formatShort() {
        String risultato = main.formatter(FormatStyle.SHORT, offsetDateTime);
        assertEquals("01/03/02", risultato);
    }
}