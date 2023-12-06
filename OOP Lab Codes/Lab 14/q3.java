import java.util.*;

class PrimeCalculator implements Runnable {
    private final int start;
    private final int end;
    private long sum;

    public PrimeCalculator(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        System.out.println("Running thread: "+Thread.currentThread().getName());
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Thread "+Thread.currentThread().getName()+" finished");
    }

    public long getSum() {
        return sum;
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        int numThreads;

        System.out.print("Enter the limit: ");
        limit = sc.nextInt();

        System.out.print("Enter the number of threads: ");
        numThreads = sc.nextInt();

        List<Thread> threads = new ArrayList<>();
        List<PrimeCalculator> calculators = new ArrayList<>();

        int numbersPerThread = limit / numThreads;
        int start = 1;
        int end = numbersPerThread;

        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                end = limit;
            }

            PrimeCalculator calculator = new PrimeCalculator(start, end);
            calculators.add(calculator);

            Thread thread = new Thread(calculator);
            threads.add(thread);

            start = end + 1;
            end += numbersPerThread;
        }

        for (Thread thread : threads) {
            thread.start();
        }

        long sum = 0;
        for (int i = 0; i < numThreads; i++) {
            try {
                threads.get(i).join();
                sum += calculators.get(i).getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + sum);
    }
}
