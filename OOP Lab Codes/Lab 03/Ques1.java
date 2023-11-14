import java.util.*;

class elements{
	String name,symbol,type;
	double atm_weight;
	public elements(String Name,String Symbol,String Type,double Atm){
		name = Name;
		symbol = Symbol;
		type = Type;
		atm_weight = Atm;
	}
	
	public void display(){
		System.out.println(name+"\t"+
					symbol+"\t"+type+"\t"+atm_weight);
	}
	
	public void disp(){
		if(atm_weight>15.0) {
			System.out.println(name+"\t"+symbol+"\t"+type+"\t"+atm_weight);
		}
	}
}


public class Ques1{
	public static void main(String[] args) {
		System.out.println("Enter the element details: ");
		
		elements e1 = new elements("Sodium","Na","Alkali metal",22.98);
		elements e2 = new elements("Calcium","Ca","Alkali",2.98);
		elements e3 = new elements("Gold","Au","Alkali",32.98);
		System.out.println("Elements details: ");
		e1.display();
		e2.display();
		e3.display();
		System.out.println("Elements details with atomic mass more than 15: ");
		e1.disp();
		e2.disp();
		e3.disp();
	}
}
