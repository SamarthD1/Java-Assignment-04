class Time {
    private int hr;
    private int min;
    private int sec;

    public Time() {
        this.hr = 12;
        this.min = 0;
        this.sec = 0;
    }

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public Time(int totalSeconds) {
        setClock(totalSeconds);
    }

    public void setClock(int totalSeconds) {
        this.hr = (totalSeconds / 3600) % 24;
        this.min = (totalSeconds % 3600) / 60;
        this.sec = totalSeconds % 60;
    }

    public void tick() {
        sec++;
        if (sec == 60) {
            sec = 0;
            min++;
        }
        if (min == 60) {
            min = 0;
            hr++;
        }
        if (hr == 24) {
            hr = 0;
        }
    }

    public void tickDown() {
        sec--;
        if (sec < 0) {
            sec = 59;
            min--;
        }
        if (min < 0) {
            min = 59;
            hr--;
        }
        if (hr < 0) {
            hr = 23;
        }
    }

    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }

    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.print("Default Time: ");
        t1.displayTime();

        Time t2 = new Time(5, 45, 23);
        System.out.print("Parameterized Time: ");
        t2.displayTime();

        Time t3 = new Time(3661);
        System.out.print("Time from seconds since midnight (3661s): ");
        t3.displayTime();

        t3.tick();
        System.out.print("After tick() (increment 1 sec): ");
        t3.displayTime();

        t3.tickDown();
        t3.tickDown();
        System.out.print("After tickDown() (decrement 2 sec): ");
        t3.displayTime();
    }
}

