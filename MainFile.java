import java.util.Scanner;

public class MainFile {

    public static void main(String args[]) {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Hello %s, your age is %d", username, age));
        // Validate the age and output the correct statement
        if (age >= 16) {
            System.out.println("You are old enough to drive");
        } else if (age < 18) {
            System.out.println("You are not old enough to drive");
        }

        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else if (age < 21) {
            System.out.println("You are not old enough to drink");
        }

        if (age >= 21) {
            System.out.println("You are old enough to drink");
        } else if (age < 35) {
            System.out.println("You are not old enough to be President");
        }

        if (age >= 35) {
            System.out.println("You are old enough to be President");
        } else if (age < 55) {
            System.out.println("You are not old enough to join AARP");
        }

        if (age >= 55) {
            System.out.println("You can join AARP");
        } else if (age < 67) {
            System.out.println("You are not started to draw your Social Security yet");
        }

        if (age >= 67) {
            System.out.println("You can starting drawing Social Security");
        }

        // Switch statement
        System.out.println("Employment status - employed(E), unemployed(U), or student(S)");
        System.out.print("Enter E, U or S -> ");
        String status = scanner.next();
        String statusSet = " ";
        switch (status) {

            case "E":
            case "e":
                statusSet = "You are employed";
                // System.out.printf(" You are Employed ");
                break;
            case "U":
            case "u":
                statusSet = "You are Unemployed";
                // System.out.printf(" You are Unemployed ");
                break;
            case "S":
            case "s":
                statusSet = "You are a student";
                // System.out.printf(" You are a student ");
                break;
            default:
                System.out.println("Enter the values E, U or s");
        }

        System.out.println("Do you have a Car(C), Truck(T), Suv(S), or do not own a vehicle(N)? ");
        System.out.print("Enter C, T ,V or N -> ");
        String vehicle = scanner.next();
        String vhcle = " ";

        switch (vehicle) {

            case "C":
            case "c":
                vhcle = "You have a car";
                // System.out.printf(" You are Employed ", v);
                break;

            case "T":
            case "t":
                vhcle = "You have a Truck";
                // System.out.printf(" You are Unemployed ");
                break;

            case "V":
            case "v":
                vhcle = "You have a SUV";
                // System.out.printf(" You are a student ", v);
                break;

            case "N":
            case "n":
                vhcle = "You have no vehicle";
                // System.out.printf(" You are a student ", v);
                break;

            default:
                System.out.println("Enter the values C, T,V  or N");

        }
        System.out.printf(" Hello! %s, %s and %s.", username, statusSet, vhcle);
    }

}