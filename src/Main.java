import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String inputString = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(inputString);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss z", Locale.ITALY);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy HH:mm:ss z", Locale.ITALY);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm:ss z", Locale.ITALY);

        System.out.println("FULL format: " + offsetDateTime.format(fullFormatter));
        System.out.println("MEDIUM format: " + offsetDateTime.format(mediumFormatter));
        System.out.println("SHORT format: " + offsetDateTime.format(shortFormatter));

    }
    public static String formatter (DateTimeFormatter dateTimeFormatter, java.time.OffsetDateTime offsetDateTime){
        return offsetDateTime.format(dateTimeFormatter);
    }
}