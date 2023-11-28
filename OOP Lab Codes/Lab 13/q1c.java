import java.util.*;

class UserDefinedException extends Exception {
    public UserDefinedException(String error) {
        super(error);
    }
}

class Primec {
    private int start;
    private int end;
    public Primec(int start, int end) throws UserDefinedException{
        if(start<0 || end<0) {
            throw new UserDefinedException("Negative number inputed");
        }
        this.start = start;
        this.end = end;
    }

    public static List<Integer> generatePrimeNumbers(int start, int end){
        List<Integer> primeNumbers = new ArrayList<>();

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }

        return primeNumbers;
    }

    private static boolean isPrime(int number) {
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

public class q1c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        Primec p;
        try {
            p = new Primec(start,end);
            List<Integer> primeNumbers = p.generatePrimeNumbers(start, end);
            System.out.println("Prime numbers between " + start + " and " + end + ":");
            for (int primeNumber : primeNumbers) {
                System.out.print(primeNumber + " ");
            }
        } 

        catch (UserDefinedException e) {
            e.printStackTrace();
        }

        System.out.println();
        scanner.close();
    }
}