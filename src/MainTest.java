import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class MainTest {
    Main main = new Main();
    String dateString = "2002-03-01T13:00:00Z";
    java.time.OffsetDateTime offsetDateTime = java.time.OffsetDateTime.parse(dateString);
    private Assertions Assert;

    @Test
    void formatFull() {
        String risultato = Main.formatter(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL), offsetDateTime);
        Assert.assertEquals("venerdì 1 marzo 2002", risultato);
    }

    @Test
    void formatMedium() {
        String risultato = Main.formatter(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM), offsetDateTime);
        Assert.assertEquals("1 mar 2002", risultato);
    }

    @Test
    void formatShort() {
        String risultato = Main.formatter(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT), offsetDateTime);
        Assert.assertEquals("01/03/02", risultato);
    }
}