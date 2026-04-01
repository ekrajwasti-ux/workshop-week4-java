package Workshop4;

import java.util.*;

public class MainApp {

    
    static String[] names = new String[100];
    static String[] mobiles = new String[100];
    static String[] passwords = new String[100];
    static String[] dobs = new String[100];

    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPlease enter 1 for Sign up.");
            System.out.println("Please enter 2 for Quit.");

            choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                signup(sc);
            } else if (choice == 2) {
                System.out.println("\nThank you for using Application.");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 2);

        sc.close();
    }

    // SIGNUP METHOD
    public static void signup(Scanner sc) {

        String name, mobile, password, confirm, dob;

        while (true) {

          
            System.out.print("\nPlease enter your full name: ");
            name = sc.nextLine();

            if (name.length() <= 4) {
                System.out.println("Name must be more than 4 characters.");
                System.out.println("Please start again.");
                continue;
            }

            
            System.out.print("\nPlease enter your mobile number (username): ");
            mobile = sc.nextLine();

            if (!mobile.matches("0\\d{9}")) {
                System.out.println("Mobile number must be 10 digits and start with 0.");
                System.out.println("Please start again.");
                continue;
            }

           
            System.out.print("\nPlease enter your password: ");
            password = sc.nextLine();

            if (!password.matches("[A-Za-z]+[@&]\\d+")) {
                System.out.println("Password must start with letters, include @ or &, and end with numbers.");
                System.out.println("Example: John@123");
                System.out.println("Please start again.");
                continue;
            }

            
            System.out.print("\nPlease confirm your password: ");
            confirm = sc.nextLine();

            if (!password.equals(confirm)) {
                System.out.println("Your passwords are not matching.");
                System.out.println("Please start again.");
                continue;
            }

           
            System.out.print("\nPlease enter your Date of Birth #DD/MM/YYYY (No space): ");
            dob = sc.nextLine();

            if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("You have entered the Date of Birth in invalid format.");
                System.out.println("Please start again.");
                continue;
            }

           
            String[] parts = dob.split("/");
            int year = Integer.parseInt(parts[2]);
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - year;

            if (age < 21) {
                System.out.println("You must be at least 21 years old.");
                System.out.println("Please start again.");
                continue;
            }

            
            names[count] = name;
            mobiles[count] = mobile;
            passwords[count] = password;
            dobs[count] = dob;
            count++;

            System.out.println("\nYou have successfully signed up.");
            break;
        }
    }
}
