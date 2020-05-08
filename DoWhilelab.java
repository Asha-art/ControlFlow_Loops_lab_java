
import java.util.Scanner;

public class DoWhilelab {
    public static void main(String[] args) {
        char res;

        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        do {
            // prompt and read a string
            System.out.print("Enter your name: ");
            String username = scanner.next();

            // prompt and read an int
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println(String.format("Hello %s, your age is %d", username, age));

            System.out.println("Do you want to answer the questions again? Enter 'y'for yes 'n'for no");
            res = scanner.next().charAt(0);

        } while (res != 'n');

        scanner.close();

    }

}