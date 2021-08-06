package bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
	   private boolean check;
	    private String firstName, lastName;
	    Scanner sc = new Scanner(System.in);
	    
	    public void checkFirstName() {
	        System.out.println("enter first name starts with cap and has minimum 3 character : ");
	        firstName = sc.nextLine();
	        check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstName).matches();
	        if (!check) {
	            System.out.println(" first name is invalid ");
	            checkFirstName();
	        }
	    	else {
	            System.out.println(" first name is valid ");
	        }
	    }

	    public void checkLastName() {
	        System.out.println("enter last name starts with cap and has minimum 3 character : ");
	        lastName = sc.nextLine();
	   	    check = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastName).matches();
	   	    if (!check) {
	   		     System.out.println(" last name is invalid ");
	   		     checkLastName();
	   	    }
	   	    else
	   		     System.out.println(" last name is valid ");
	    }

	    public static void main(String args[]) {
		
	        UserRegistration user = new UserRegistration();
	        user.checkFirstName();
	        user.checkLastName();
	    }
}
