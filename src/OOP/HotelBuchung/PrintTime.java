package OOP.HotelBuchung;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintTime {

    private LocalDateTime startDatum;

    public String DateAndTime() {

        //PrintTime object
        PrintTime printTime = new PrintTime();
        printTime.startDatum = LocalDateTime.now();

        // Formatters for date and hour
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM-dd-YYYY");
        DateTimeFormatter hourFormatter = DateTimeFormatter.ofPattern("HH:mm");

        var dateString = dateFormatter.format(printTime.startDatum);
        var hourString = hourFormatter.format(printTime.startDatum);

        return dateString + " ||Time: " + hourString;
    }


}