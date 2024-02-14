public class Date {

    private final int month;
    private final int day;
    private final int year;

    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "month=" + month() +
                ", day=" + day() +
                ", year=" + year() +
                '}';
    }
    public boolean before(Date other) {
        return this.year() < other.year() ||
                (this.year() == other.year() && this.month() < other.month()) ||
                (this.year() == other.year() && this.month() == other.month() && this.day() < other.day());
    }

    public int daysSinceBeginYear() {
        int days = this.day();
        for (int i = 0; i < this.month() - 1; i++) {
            days += DAYS_IN_MONTHS[i];
        }
        if (this.month() > 2 && isLeapYear(this.year())) {
            days++;
        }
        return days;
    }

    public int daysUntilEndYear() {
        return isLeapYear(this.year()) ? 366 - daysSinceBeginYear() : 365 - daysSinceBeginYear();
    }

    public int daysBetween(Date other) {
        int days = 0;
        for (int i = this.year(); i < other.year(); i++) {
            days += isLeapYear(i) ? 366 : 365;
        }
        days -= this.daysSinceBeginYear();
        days += other.daysSinceBeginYear();
        return days;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
