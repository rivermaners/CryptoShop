import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class MyDate {

    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
    private LocalDateTime now = LocalDateTime.now();

    MyDate() {

    }

    public String getDtf() {
        return now.format(dtf).toString();
    }
}

