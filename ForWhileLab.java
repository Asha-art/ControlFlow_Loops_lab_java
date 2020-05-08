public class ForWhileLab {
    public static void main(String[] args) {

        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;

        }
        System.out.println();

        // 1. Enhanced For loop
        System.out.print("Enhanced for loop:");
        for (int el : myArray) {
            System.out.print(el + " ");
        }
        System.out.println();

        // 2.reassign the elements of the array with the even numbers up to 60.Use
        // Enhanced for loop for printing even numbers
        System.out.print("Even numbers enhanced for loop: ");
        for (int x : myArray) {
            myArray[x] = myArray[x] * 2;
            if (myArray[x] % 2 == 0) {
                System.out.print(myArray[x] + " ");
            }
        }
        System.out.println();

        // 3. print in reverse
        System.out.print("Reverse order: ");
        for (int x = myArray.length - 1; x >= 0; x--) {
            System.out.print(myArray[x] + " ");
        }
        System.out.println();

        // 4. while loop (Above 3 and 4 with while loop)

        int x = 0;

        System.out.print("Even numbers while loop=>");
        int i = 0;
        myArray[x] = myArray[x] * 2;
        while (i < myArray[x]) {

            if (myArray[x] % 2 == 0) {
                System.out.print(myArray[x] + " ");
            }
            x++;
        }
        System.out.println();

        // reverse

        System.out.print("Reverse order with while loop=> ");
        int y = myArray.length - 1;
        myArray[y] = myArray[y] * 2;
        while (y >= 0) {

            if (myArray[y] % 2 == 0) {
                System.out.print(myArray[y] + " ");
            }
            y--;
        }
        System.out.println();
    }
}