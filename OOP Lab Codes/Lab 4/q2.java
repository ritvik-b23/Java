import java.util.*;

class Employee {
    String id, name;
    int dept;
    float basic, allowance, totalSalary;
    public Employee(String id, String name, int dept, float basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;
    }

    public void calculateSalary() {
        float hra;
        hra = (float)0.4 * basic;
        if (dept==1) {
            totalSalary = basic+hra+1500;
        }
        else if (dept==2) {
            totalSalary = basic+hra+2500;
        }
        else if (dept==3) {
            totalSalary = basic+hra+3500;
        }
    }

    public void display() {
        System.out.println("Name: "+name+"\nID: "+id+"\nDept: "+dept+"\nBasic: "+basic+"\nTotal Salary: "+totalSalary);
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int dept;
        float basic;
        Employee emps[] = new Employee[3];

        System.out.println("Enter details for 3 people: ");
        for (int i=0; i<3; i++) {
            System.out.println("Enter name: ");
            name=sc.nextLine();
            System.out.println("Enter ID: ");
            id=sc.nextLine();
            System.out.println("Enter basic salary: ");
            basic=sc.nextFloat();
            System.out.println("Enter dept(1-staff 2-acc 3-admin): ");
            dept=sc.nextInt();
            sc.nextLine();
            
            System.out.println(" ");

            emps[i] = new Employee(id, name, dept, basic);
        }

        for(Employee i : emps) {
            i.calculateSalary();
            i.display();
            System.out.println(" ");
        }
    }
}

