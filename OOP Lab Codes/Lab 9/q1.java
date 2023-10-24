import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year, id, psts;
        String dis, campus;

        System.out.println("Enter the following details: ");
        System.out.println("Year: "); year = sc.nextInt(); sc.nextLine();
        System.out.println("Discipline: "); dis = sc.nextLine();
        System.out.println("Enter PS or TS(1-PS, 2-TS): "); psts = sc.nextInt(); sc.nextLine();
        System.out.println("Campus: "); campus = sc.nextLine();
        Random rand = new Random();
        id = rand.nextInt(1000);

        String fullID="";
        fullID = fullID.concat(Integer.toString(year));
        fullID = fullID.concat(dis.toUpperCase());
        if(psts==1) { fullID = fullID.concat("PS"); }
        else if(psts==2) { fullID = fullID.concat("TS"); }
        fullID = fullID.concat(String.format("%04d",id));
        fullID = fullID.concat("U");

        String mail="";
        mail = mail.concat("f"+Integer.toString(year)+String.format("%04d",id)+"@"+campus.toLowerCase()+".bits-pilani.ac.in");

        System.out.println(fullID+" "+mail);
    }
}