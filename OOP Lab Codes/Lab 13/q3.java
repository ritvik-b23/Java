import java.util.*;

class MainThread implements Runnable {
    Scanner sc = new Scanner(System.in);
    private Thread t;
    private String threadName;
    public MainThread(String threadName) { this.threadName = threadName; }

    public void run() {
        int num,n,sumRange;
        System.out.println("Running "+threadName);
        try {
            System.out.print("Enter number: "); num = sc.nextInt();
            System.out.print("Enter the number of threads to use: "); n = sc.nextInt(); 
            sumRange = num/n;
            for (int i = 0; i < sumRange; i++) {
                SubThread st = new SubThread(String.format("Thread %d", i));
                st.start();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Thread "+threadName+" interrupted.");
        }
        System.out.println("Thread "+threadName+" exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

class SubThread implements Runnable  {
    private Thread t;
    private String threadName;
    public SubThread(String threadName) { this.threadName = threadName; }
    public void run() {
        System.out.println("Running SubThread "+threadName);
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        
    }
}
