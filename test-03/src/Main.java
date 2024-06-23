import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {
        String date = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseMethod(date);
        DateTimeFormatter formater = changeLanguage();
        String formattedDate = dateTime.format(formater);
        System.out.println(formattedDate);


    }

    public static DateTimeFormatter changeLanguage() {
        return DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);
    }

    public static OffsetDateTime parseMethod(String date) {
        return OffsetDateTime.parse(date);
    }


}
