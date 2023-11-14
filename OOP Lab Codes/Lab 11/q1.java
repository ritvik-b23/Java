import java.util.ArrayList;

abstract class Member {
    String name, address;
    public String getName() { return name; }
    public String getAddress() { return address; }
    public abstract int getFee();
}

class StandardMember extends Member {

    public StandardMember(String name, String address) {
        super(name, address);
    }

    @Override
    public int getFee() { return 0; }
    
}

class SeniorMember extends Member {
    int fee;

    public SeniorMember(String name, String address) {
        super(name, address);
    }

    @Override
    public int getFee() { return fee; }
    
}

class Society{
    ArrayList<Member> arrayList = new ArrayList<>();
    public void addMember(String name, String address) {
        Society mem = new Member();
        arrayList.add(mem);
    }

    public void addSeniorMember(String name, String address, int fee) {

    }
    
    public int getFeeTotal() { 
        // temp return statement
        return 1;
    }
}

public class q1 {
    public static void main(String[] args) {
        
    }
}