import java.util.*;

class FlightDest {
    private String flightno, destination;
    public FlightDest(String flightno, String destination) {
        this.flightno = flightno;
        this.destination = destination;
    }

    public String getFlightNo() {
        return flightno;
    }

    public String getFlightsDest() {
        return destination;
    }
}

class FlightInfo {
    ArrayList<FlightDest> flightDestList; // holds objects of class FlightDest
    public FlightInfo() {
        flightDestList = new ArrayList<FlightDest>();
    }

    public void addFlightDestPair(String fNo, String dest) {
        FlightDest obj = new FlightDest(fNo, dest);
        flightDestList.add(obj);
    }

    public ArrayList<String> getFlightsDest(String dest) {
        ArrayList<String> r = new ArrayList<>();

        for (int i = 0; i < flightDestList.size(); i++) {
            if(flightDestList.get(i).getFlightsDest().equals(dest)) {
                r.add(flightDestList.get(i).getFlightNo());
            }
        }

        return r;
    }

}

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fNo, dest;

        FlightInfo obj = new FlightInfo();

        while(true) {
            System.out.println("1. Add flight details");
            System.out.println("2. Display flight no for same destination");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            System.out.println();
            sc.nextLine();
            

            if(choice==1) {
                System.out.print("Enter flight no: ");
                fNo = sc.nextLine();
                System.out.println();

                System.out.print("Enter flight destination: ");
                dest = sc.nextLine();
                System.out.println();

                obj.addFlightDestPair(fNo, dest);
            }

            else if(choice==2) {
                System.out.print("Enter destination to check: ");
                dest = sc.nextLine();
                System.out.println();
                System.out.println("Flights going to "+dest+" :");
                for (String fno : obj.getFlightsDest(dest)) {
                    System.out.println(fno);
                }
                System.out.println();
            }

            else if (choice==3) {
                System.exit(0);
            }
        }

    }
}