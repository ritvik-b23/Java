import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.nextLine();

        StringTokenizer st = new StringTokenizer(string);
        while(st.hasMoreTokens()) {
            String tk = st.nextToken();
            if (tk.startsWith("b")) {
                System.out.println(tk);
            }
        }
    }
}
