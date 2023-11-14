import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String n;

        System.out.println("Enter a 5 digit number: ");
        n = num.nextLine();

        for(int i = 0; i < 5; i++) {
            System.out.print(n.charAt(i));
            System.out.print(" ");
        }
        System.out.println("");

        num.close();
    }
}
