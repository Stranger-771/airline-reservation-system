package airlineSystem;
import java.util.Scanner;

public class Airline{
	public static void main(String[] args) {
		System.out.println("WELCOME TO UNITED AIRLINES");
		System.out.println("1.LOGIN");
		System.out.println("2.SIGNUP");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		LoginNew window = new LoginNew();
		SignUp windows = new SignUp();
		About about = new About();
		Fare fare = new Fare();
		AirProject airProject = new AirProject();
		int x = sc.nextInt();
		switch(x) {
		case 1:
			window.dhanu();
			break;
		case 2:
			windows.dhanu1();
			break;
		}
		try
		{
		    Thread.sleep(7000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		while(true){
			System.out.println("WELCOME TO UNITED AIRLINES");
			System.out.println("1.FARE CHARGES");
			System.out.println("2.SELECT FLIGHTS");
			System.out.println("3.ABOUT");
			System.out.println("4.EXIT");
			int y = sc.nextInt();
			switch(y) {
			case 1:
				fare.gaurav();
				break;
			case 2:
				airProject.harshitRagini();
				break; 
			case 3:
				about.gaurav1();
				break;
			case 4:
				System.exit(1);
			default:
				System.out.println("SORRY FOR THE INCONVINIENCE CAUSED");
			}
		}
	}
}