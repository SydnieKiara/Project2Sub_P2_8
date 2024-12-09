import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = DateTimeUtils.getCurrentDateTime();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Convert a specific date to ISO 8061 format
        LocalDateTime dateTime = LocalDateTime.of(2024, 12, 3, 14, 10, 31);
        String isoString = DateTimeUtils.convertToISO8061(dateTime);
        System.out.println("ISO 8061 UTC Format: " + isoString);

        // Calculate the number of days between two dates
        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 5);
        long daysBetween = DateTimeUtils.calculateDaysBetween(startDate, endDate);
        System.out.println("Days Between: " + daysBetween);

        // Handle invalid input example
        try {
            DateTimeUtils.convertToISO8061(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

