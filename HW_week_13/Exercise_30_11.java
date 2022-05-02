package HW_week_13;

public class Exercise_30_11 {
    public static void main(String[] args) {
        String a = "ABC";
        String b = "EDF";

        Thread t1 = new Thread(){
            public void run(){
                synchronized (a){
                    System.out.println("A is synchronized");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (b){
                        System.out.println("B is synchronized");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (b){
                    System.out.println("B is synchronized");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (a){
                        System.out.println("A is synchronized");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
