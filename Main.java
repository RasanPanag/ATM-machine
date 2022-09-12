// Code Created By Rasandeep Singh Panag
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		theinterface operation = new Implementation();
		int atmnumber [] = {406417, 86689853, 656668, 989898, 5656656, 575859, 607080, 9090100};
		int atmpin [] = {5555, 6666, 7777, 8888, 9999, 1313, 4444, 1111};

		Scanner a = new Scanner(System.in);
		System.out.println("WELCOME\n\n");
		System.out.print("Pleaese enter your ATM number: ");
		int atmNumber = a.nextInt();
		System.out.print("Enter Pin: ");
		int pin = a.nextInt();
		for (int i = 0; i<atmnumber.length; i++) {
			if ((atmnumber[i] == atmNumber) && (atmpin[i]==pin)) {
				System.out.println();
				while(true) {
					one: {
					System.out.println();
					System.out.println();
					System.out.println("1.View Available Balance");
					System.out.println("2.Withdraw Amount");
					System.out.println("3.Deposit Amount");
					System.out.println("4.View Ministatement");
					System.out.println("5.Exit \n");
					System.out.print("Enter Choice : ");
					int choice = a.nextInt();
					if(choice==1) {
						operation.viewBalance();
					}
					else if(choice == 2) {
						System.out.print("Please enter your amount to withdraw: ");
						double withdraw = a.nextDouble();
						System.out.println();
						operation.withdraw(withdraw);
                	}
					else if(choice == 3) {
						System.out.print("Please enter your amount to deposit: ");
						double deposit = a.nextDouble();
						System.out.println();
						operation.deposit(deposit);
                	}
					else if (choice == 4) {
						operation.viewMinist();
					}
					else if(choice == 5) {
                	System.out.println("Plesae collect your amount and thank you for using the ATM\n");
					}
					else {
                	System.out.println("Pleaes enter correct  choice\n");
                }
				System.out.print("Type 1 and press enter if you want to continue: ");
				int c = a.nextInt();
				System.out.println();
				if(c == 1) break one;
				else {
				System.out.println("Thank you for using the ATM machine!!!\n\n\n");
				break;
				}
				}}

		}
		else {
			System.out.println("Incorrect PIN");
			break;
			}
		}

		}
}
