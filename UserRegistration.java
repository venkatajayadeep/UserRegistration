package bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
	 private boolean check;
	    private String firstName, lastName, email, phoneNumber, password;
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
	        else {
	            System.out.println(" last name is valid ");
	        }
	    }

	    public void checkEmail() {
	        System.out.println("enter a valid email(Eg. abc.xyz@bl.co.in) : ");
	        email = sc.nextLine();
	        check = Pattern.compile("^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]{2,}+)*$").matcher(email).matches();
	        if (!check) {
	            System.out.println(" email is invalid ");
	            checkEmail();
	        }
		else {
	            System.out.println(" email is valid ");
	        }
	    }

	    public void checkPhoneNumber() {
	        System.out.println("enter a valid (Eg. 91 9919819801) : ");
	        phoneNumber = sc.nextLine();
	        check = Pattern.compile("^[0-9]{1,3} [0-9]{10}$").matcher(phoneNumber).matches();
	        if (!check) {
	            System.out.println(" phone number is invalid ");
	            checkPhoneNumber();
	        }
	        else {
	            System.out.println(" phone number is valid ");
	        }
	    }

	    public void checkPassword() {
	        System.out.println("enter password min of 8 and atleast 1 uppercase character): ");
	        password = sc.nextLine();
	        check = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]){8,}.*$").matcher(password).matches();
	        if (!check) {
	            System.out.println(" password invalid ");
	            checkPassword();
	        }
	        else {
	            System.out.println(" password valid ");
	        }
	    }

	    public static void main(String args[]) {
		
	        UserRegistration user = new UserRegistration();
	        user.checkFirstName();
	        user.checkLastName();
	        user.checkEmail();
	        user.checkPhoneNumber();
	        user.checkPassword();
	    }
}
