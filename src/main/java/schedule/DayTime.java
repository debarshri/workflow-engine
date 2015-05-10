package schedule;

public class DayTime {
    private String hour;
    private String minute;

    public DayTime(String hour, String minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public String getHour() {
        return hour;
    }

    public String getMinute() {
        return minute;
    }
}
