import java.util.*;
class CreditCard{
        private String name, cardNo;
        private boolean enabled;
        private int pin;
        private String expiryMonth;
        private int cardType;
        private int currentCredit;
        int creditLimit;
        public CreditCard(String name, String cardNo, int pin, String expiryMonth, int cardType, int creditLimit, int currentCredit) {
                this.name = name;
                this.cardNo = cardNo;
                this.pin = pin;
                this.expiryMonth = expiryMonth;
                this.cardType = cardType;
                this.creditLimit = creditLimit;
                this.currentCredit = currentCredit;
        }
        public void changePin(int newPin) {
                pin = newPin;
                System.out.println("Pin updated.");
        }
        public void transact(int amt, int enteredPin) {
            if(!enabled) {
                if(this.pin == enteredPin) {
                    if(creditLimit >= amt) {
                        if(currentCredit>amt) {
                            if(cardType == 1) {
                                    currentCredit -= (amt-(amt*0.01));
                            }
                            else if(cardType == 2) {
                                    currentCredit -= (amt-(amt*0.02));
                            }
                            else if(cardType == 3) {
                                    currentCredit -= (amt-(amt*0.03));
                            }
                        }
                        if(currentCredit<amt) {
                            System.out.println("Not enough Credit! ");
                        }
                        if(currentCredit==amt) {
                            currentCredit = 0; System.out.println("Total credit left is 0.");
                        }
                    }
                    else {
                        System.out.println("Amount more than credit limit.");
                    }
                }
                else { 
                    System.out.println("Wrong pin"); 
                }
            }
            else { 
                System.out.println("Card not enabled."); 
            }
        }
        public void changeCardStatus(boolean status) {
                enabled = status;
                System.out.println("Card status changed.");
        }
        public void display() {
                System.out.println("Name: "+name+
                                    "\nCard no: "+cardNo+
                                    "\nExpiry: "+expiryMonth+
                                    "\nCard type: "+cardType+
                                    "\nCurrent credit: "+currentCredit+
                                    "\nLimit: "+creditLimit);
        }
}
public class CreditCardTester{
    public static void main(String[] args) {
        String name,cardNo, expiry;
        int pin, cardType, limit, credit;
        System.out.println("Enter Card details: ");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: "); name = sc.nextLine();
        System.out.println("Enter Card no: "); cardNo = sc.nextLine();
        System.out.println("Enter Expiry month: "); expiry = sc.nextLine();
        System.out.println("Enter pin: "); pin = sc.nextInt();
        System.out.println("Enter Card type (3-paltinum 2-gold 1-silver): "); cardType = sc.nextInt();
        System.out.println("Enter limit: "); limit = sc.nextInt();
        System.out.println("Enter current credit: "); credit = sc.nextInt();
        CreditCard c1 = new CreditCard(name,cardNo,pin,expiry,cardType,limit,credit);

        while(true) {
            System.out.println("Crdit card menu: ");
            System.out.println("1. Change pin");
            System.out.println("2. Transaction");
            System.out.println("3. Enable Card");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            int choice;
            choice = sc.nextInt();
            if (choice==1) {
                int newPin;
                System.out.println("Enter new pin: ");
                newPin = sc.nextInt();
                c1.changePin(newPin);
            }
            
            if (choice==2) {
                System.out.println("Enter amount: ");
                int transactAmt = sc.nextInt();
                System.out.println("Enter pin: ");
                int pass;
                pass = sc.nextInt();
                if (pin==pass) {
                    c1.transact(transactAmt, pin);
                }
                else {
                    System.out.println("Wrong pin.");
                }
            }
            
            if (choice==3) {
                c1.changeCardStatus(true);
            }

            if (choice==4) {
                c1.display();
            }

            if (choice==5) {
                System.exit(0);
            }
        }
    }
}

