public class Main {

    public static void main(String[] args) {
        // Create two Date objects
        Date date1 = new Date(2, 14, 2024);
        Date date2 = new Date(12, 25, 2023);

        // Print the dates
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        // Check if date1 is before date2
        if (date1.before(date2)) {
            System.out.println("Date 1 is before Date 2");
        } else {
            System.out.println("Date 1 is not before Date 2");
        }

        // Print the number of days since the start of the year for date1
        System.out.println("Days since the start of the year for Date 1: " + date1.daysSinceBeginYear());

        // Print the number of days until the end of the year for date2
        System.out.println("Days until the end of the year for Date 2: " + date2.daysUntilEndYear());

        // Print the number of days between date1 and date2
        System.out.println("Days between Date 1 and Date 2: " + date1.daysBetween(date2));
    }
}
