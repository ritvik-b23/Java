public class Ques3 {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        
        System.out.println("Number \t Square\t Cube");

        for (int i = start; i <= end; i++) {
            System.out.println(i + "\t " + (i*i) + "\t " + (i*i*i));
        }
    }
}
