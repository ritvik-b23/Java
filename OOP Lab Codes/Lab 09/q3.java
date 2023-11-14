import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number:");
        String phoneNum = sc.nextLine();
        if (phoneNum.startsWith("009715")) {
            System.out.print("00971 UAE Code "+phoneNum.substring(5,7)+" - Mobile");
        }
        if (phoneNum.startsWith("009714")) {
            System.out.print("00971 UAE Code "+phoneNum.substring(5,6)+" - Landline");
        }
        System.out.println();
    }
}
