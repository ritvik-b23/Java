class SumToN implements Runnable {

    private int start, end;
    private int result = 0;

    public SumToN(int s, int e) {
        start = s;
        end = e;
    }

    public void run() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            String name = Thread.currentThread().getName();
            System.out.println(name + " : i = " + i + " sum = " + sum);
        }
        result = sum;
    }

    public int getResult() {
        return result;
    }

    public void display() {
        System.out.println(result);
    }
}

public class q3 {

    public static void main(String[] args) {
        Runnable r1 = new SumToN(1, 5);
        Runnable r2 = new SumToN(6, 10);
        Runnable r3 = new SumToN(11, 15);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main thread: waiting begin");
        try {
            t1.join();
            System.out.println("t1 : joined");
            t2.join();
            System.out.println("t2 : joined");
            t3.join();
            System.out.println("t3 : joined");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main thread: waiting end");
        SumToN s1 = (SumToN) r1;
        SumToN s2 = (SumToN) r2;
        SumToN s3 = (SumToN) r3;

        s1.display();
        s2.display();
        s3.display();

        int sum = s1.getResult() + s2.getResult() + s3.getResult();
        System.out.println("Sum = : " + sum);
    }
}
