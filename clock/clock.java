package chapterThree;
public class clock {
    private int hour;
    private int minute;
    private int second;

    public clock(int hour, int minute, int second) {
        if (hour > 23 || minute > 59 || second > 59) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
        this.hour = hour;
    }
    }
    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {}
        this.minute = minute;
    }
    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
        this.second = second;
    }
    }
    public void displayTime(){
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
