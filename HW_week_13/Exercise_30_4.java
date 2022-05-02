package HW_week_13;

public class Exercise_30_4 {
    private static Integer sum = 0;

    public static void main(String[] args) {

        for (int i = 0; i <= 1000; i++) {
            Thread thread = new Thread() {
                public void run() {
                    synchronized (sum) {
                        sum++;
                    }
                }
            };
            thread.start();
        }
        System.out.println(sum);
    }

}
