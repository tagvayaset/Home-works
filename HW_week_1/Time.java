package HW_week_1;

public class Time {

      private int Hour;
      private int Minute;
      private int Second;
      private long Time;

    public Time() {
        Time = System.currentTimeMillis();
    }

    public Time(long time) {
        Time = time;
    }
    public Time(int hour, int minute, int second) {
        Hour = hour;
        Minute = minute;
        Second = second;
        return;
    }

    public void setTime(long eTime) {
        Time = eTime;
    }

    public int getHour() {
        return (int)(Time / (1000 * 3600)) % 24;
    }

    public int getMinute() {
        return (int)(Time / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int)(Time / 1000) % 60;
    }
}
