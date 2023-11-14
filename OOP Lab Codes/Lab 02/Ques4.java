import java.util.*;

public class Ques4 {
    public static void main(String[] args) {
        int inp, pos=0, neg=0, zero=0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            inp = sc.nextInt();
            if (inp<0) { neg++; }
            if (inp>0) { pos++; }
            if (inp==0) { zero++; }
        }

        System.out.println("Positive: "+pos);
        System.out.println("Negetive: "+neg);
        System.out.println("Zeros: "+zero);
        sc.close();
    }
}
