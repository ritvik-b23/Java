import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        System.out.print("Enter string 1: "); str1 = sc.nextLine();
        System.out.print("Enter string 2: "); str2 = sc.nextLine();

        ArrayList<Character> letters1 = new ArrayList<>();
        ArrayList<Character> letters2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            letters1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            letters2.add(str2.charAt(i));
        }

        for (int i = 0; i < letters2.size(); i++) {
            if(letters2.get(i) == ' ') {
                letters2.remove(i);
            }
        }

        Collections.sort(letters1);
        Collections.sort(letters2);

        // System.out.println(letters1);
        // System.out.println(letters2);

        if(letters1.equals(letters2)) {
            System.out.println("Anagram");
        }

        else { System.out.println("not anagram"); }
    }
}
