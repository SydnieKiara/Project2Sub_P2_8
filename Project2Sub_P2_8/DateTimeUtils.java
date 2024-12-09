import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Utility class for working with dates and times using the `java.time` package.
 */
public class DateTimeUtils {

    /**
     * Returns the current date and time.
     * 
     * @return the current LocalDateTime object representing the current date and time.
     */
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    /**
     * Converts a given LocalDateTime to an ISO 8061 UTC time string.
     * 
     * @param dateTime the LocalDateTime to convert.
     * @return the ISO 8061 UTC string representation of the date and time.
     * @throws IllegalArgumentException if the input dateTime is null.
     */
    public static String convertToISO8061(LocalDateTime dateTime) {
        if (dateTime == null) {
            throw new IllegalArgumentException("DateTime cannot be null");
        }
        return dateTime.atZone(ZoneId.systemDefault())
                       .withZoneSameInstant(ZoneId.of("UTC"))
                       .format(DateTimeFormatter.ISO_INSTANT);
    }

    /**
     * Calculates the number of days between two given LocalDate objects.
     * 
     * @param startDate the start date.
     * @param endDate the end date.
     * @return the number of days between the two dates. A negative value indicates that
     *         the start date is after the end date.
     * @throws IllegalArgumentException if either of the dates is null.
     */
    public static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        return ChronoUnit.DAYS.between(startDate, endDate);
    }
}

