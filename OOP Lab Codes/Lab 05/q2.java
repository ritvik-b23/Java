import java.util.*;

class SavingsAccount {
    static float annualInterestrate = 0.04f;
    private float savingsBalance;

    public SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterst() {
        savingsBalance = ((savingsBalance*annualInterestrate)/12)+savingsBalance;
        System.out.println("Monthly interst: "+savingsBalance);
    }

    public void modifyInterestRate(float newAnnualInt) {
        annualInterestrate = newAnnualInt;
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bal1, bal2, bal3; 
        System.out.println("Enter savings balance for acc 1: ");
        bal1 = sc.nextFloat();
        System.out.println("Enter savings balance for acc 2: ");
        bal2 = sc.nextFloat();
        System.out.println("Enter savings balance for acc 3: ");
        bal3 = sc.nextFloat();
        SavingsAccount s1 = new SavingsAccount(bal1);
        SavingsAccount s2 = new SavingsAccount(bal2);
        SavingsAccount s3 = new SavingsAccount(bal3);
        System.out.println("Annual interst rate: 4%");
        s1.calculateMonthlyInterst();
        s2.calculateMonthlyInterst();
        s3.calculateMonthlyInterst();
        System.out.println("\n");
        float newAI=0.05f;
        System.out.println("Annual interst rate: 5%");
        s1.modifyInterestRate(newAI);
        s1.calculateMonthlyInterst();
        s2.calculateMonthlyInterst();
        s3.calculateMonthlyInterst();

    }
}

