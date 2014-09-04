import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        DateFormat originalFormat = new SimpleDateFormat("MMM d, yyyy h:mm:ss a");
        DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = originalFormat.parse("Jan 1, 1982 1:00:00 AM");
        String formattedDate = targetFormat.format(date);
        System.out.print(formattedDate);
    }
}
