// Code Created By: Rasandeep Singh Panag
import java.util.HashMap;
import java.util.Map;
public class Implementation implements theinterface{
MainAtmClass atm = new MainAtmClass();
Map<Double, String> rsp = new HashMap<>();

 	public void viewBalance() {
 		System.out.println("Your Available Balance is: " + atm.getBalance());
 		}
 	public void withdraw(double withdraw) {
 	        if(withdraw%500==0) {
 	            if (withdraw <= atm.getBalance()) {
 	            	rsp.put(withdraw, " Amount Withdrawn");
 	                System.out.println("Collect the Cash " + withdraw);
 	                atm.setBalance(atm.getBalance() - withdraw);
 	                viewBalance();
 	            } else {
 	                System.out.println("Your Balance is not sufficient");
 	            }
 	        }
 	        else {
 	            System.out.println("Please enter the amount in multipal of 500");
 	        }
 	 		}



 	public void deposit(double deposit) {
 		rsp.put(deposit, "\nYOUR AMOUNT IS DEPOSITED\n\n");
 		System.out.println(deposit + "\nYour deposit is Successful !!\n\n");
 		atm.setBalance(atm.getBalance()+deposit);
 		viewBalance();
 	}
 	public void viewMinist () {
 		for(Map.Entry<Double,String> m : rsp.entrySet()) {
 			System.out.println(m.getKey()+""+m.getValue());
 		}
 	}
}
