import java.util.*;

public class q1 {
    public static void main(String[] args) {
        int vote, c1=0, c2=0, c3=0, c4=0, c5=0, spoilt=0;
        int[] cand= new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of voters: ");
        int candidates = sc.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= candidates; i++) {
            System.out.println("1. Candidate 1");
            System.out.println("2. Candidate 2");
            System.out.println("3. Candidate 3");
            System.out.println("4. Candidate 4");
            System.out.println("5. Candidate 5");
            System.out.println("Enter your vote (enter digit): ");
            vote = sc.nextInt(); 
            System.out.println("\n");
            
	        if(vote==1) { cand[i]=1; }
            else if(vote==2) { cand[i]=2; }
            else if(vote==3) { cand[i]=3; }
            else if(vote==4) { cand[i]=4; }
            else if(vote==5) { cand[i]=5; }
            else { spoilt+=1; } 
        }

        for (int i = 0; i < cand.length; i++) {
            if (cand[i]==1) { c1++; }
            if (cand[i]==2) { c2++; }
            if (cand[i]==3) { c3++; }
            if (cand[i]==4) { c4++; }
            if (cand[i]==5) { c5++; }

        }

        System.out.println("Total number of votes: ");
        System.out.println("Candidate 1: "+c1);
        System.out.println("Candidate 2: "+c2);
        System.out.println("Candidate 3: "+c3);
        System.out.println("Candidate 4: "+c4);
        System.out.println("Candidate 5: "+c5);
        System.out.println("Number of spoilt votes: "+spoilt);
        sc.close();
    }
}

